package services;

import products.AbstractProduct;
import products.drinks.Drink;
import products.pizza.Pizza;
import products.pizza.SIZE;
import products.pizza.TYPE;
import products.pizza.ingredients.INGREDIENT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static products.ProductMenu.*;

public class Waitress {
private final Scanner scanner;

    public Waitress() {
        this.scanner = new Scanner(System.in).useDelimiter(" *");
    }

    public Order createOrder(){
        boolean ifExit=false;
        AbstractProduct tester;
        DELIVERYTYPE delivery;
        List<AbstractProduct> products= new ArrayList<>();
        AbstractProduct[] finalProducts;
        while (!ifExit){
        //---------------------------PIZZA ORDER
            tester=pizzaOrder();
            if(tester!=null)
                products.add(tester);
            if(ifAdd("DO YOU WANT TO ORDER SOMETHING ELSE")) {
                ifExit=false;
            }
            else
                ifExit=true;
        }
        ifExit=false;
        //------------------------------DRINK ORDER

            if (ifAdd("DO YOU WANT TO ORDER SOMETHING TO DRINK")){
                while (!ifExit) {
                    tester=drinkOrder();
                    if(tester!=null)
                        products.add(tester);
                    if(ifAdd("DO YOU WANT TO ORDER SOMETHING ELSE TO DRINK")) {
                        ifExit=false;
                    }
                    else
                        ifExit=true;
                }
        }
        //--------------------------CLIENT INFO
        Client client= new Client().getClientInfo();
        if (client.getDelivery())
            delivery= DELIVERYTYPE.HOME_DELIVERY;
        else
            delivery=DELIVERYTYPE.SELF_PICKUP;

        finalProducts=products.toArray(new AbstractProduct[0]);
         return new Order(delivery,client,finalProducts);
        }


public Drink drinkOrder(){
  int orderNr;
        offerDrinks();
        orderNr= takeNumberOrder();
        return new DrinkMaker().getProduct(checkDrinks(orderNr));

}


public Pizza pizzaOrder(){
    boolean exit=false;
    TYPE type=null;
    SIZE size=null;
    int orderNr;
    Integer[] accesoriesOrderNr;
    INGREDIENT[] ingredients=new INGREDIENT[20];

    while(type==null && !exit){
        offerPizzas();
        orderNr= takeNumberOrder();
        if(orderNr==0){
            exit=true;
        }
        else {
            type = checkPizzas(orderNr);
            if (ifAdd("Do you want to add something to your pizza?")) {
                        while(ingredients[0]==null && !exit) {
                            accesoriesOrderNr = takeArrayOrder();
                            if(accesoriesOrderNr[0]==0){
                                exit=true;
                            }
                            else{
                                ingredients=checkIgredients(accesoriesOrderNr);
                                while(size==null && !exit) {
                                    offerPizzaSize();
                                    orderNr = takeNumberOrder();
                                    if (orderNr == 0) {
                                        exit = true;
                                    } else {
                                        size = checkPizzasSize(orderNr);
                                    }
                                }
                                if(exit){
                                    exit=false;
                                    ingredients=null;
                                }
                            }
                        }
                        if(exit){
                            exit=false;
                            type=null;
                        }
            }
            else {
                while(size==null && !exit) {
                    offerPizzaSize();
                    orderNr = takeNumberOrder();
                    if (orderNr == 0)
                        exit = true;
                     else
                        size = checkPizzasSize(orderNr);
                }
            }
            if(exit){
                exit=false;
                type=null;
            }
        }
    }
    if (exit==true)
        return null;
    else if(ingredients[0]==null)
        return new PizzaCooker().getProduct(type,size);
    else
        return new PizzaCooker().getProduct(type,size,ingredients);
}

public boolean ifAdd(String s){
        System.out.println(s);
        System.out.println("1. YES");
        System.out.println("ANY NUMBER FOR NO");
    while (!scanner.hasNextInt()) {
        System.out.print("It has to be a number! Type number from menu: ");
        scanner.next();
    }
    if(scanner.nextInt()==1){
        scanner.nextLine();
        return true;
    }
    else{
        scanner.nextLine();
        return false;
    }
}


    public int takeNumberOrder() {
       int a;
           System.out.print("Type number from menu: ");
           while (!scanner.hasNextInt()) {
               System.out.print("It has to be a number! Type number from menu: ");
               scanner.next();
           }
           a=scanner.nextInt();
           scanner.nextLine();
        return a;
       }

    public Integer[] takeArrayOrder(){
        Integer[] finalOrder;
        int justAnIterator=0;
        List<Integer> order = new ArrayList<>();
        boolean ifFinished=false;
        while(!ifFinished) {
            offerIngredients();
                order.add(takeNumberOrder());
            if(order.get(justAnIterator)!=0){
                System.out.println("Do you want to add sth more? ");
                System.out.println("1. YES");
                System.out.println("ANY NUMBER FOR NO");
                if(scanner.nextInt()==1)
                    ifFinished=false;
                else
                    ifFinished=true;
                scanner.nextLine();
                justAnIterator++;
            }
            else
                ifFinished=true;
        }
        finalOrder=order.toArray(new Integer[0]);
        return finalOrder;
    }

    }



