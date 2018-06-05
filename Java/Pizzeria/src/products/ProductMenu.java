package products;

import products.pizza.SIZE;
import products.pizza.TYPE;
import products.pizza.ingredients.INGREDIENT;

import java.util.ArrayList;
import java.util.List;

public class ProductMenu {

    public static void offerPizzas() {
        System.out.println("Menu: ");
        System.out.println("0. GO BACK ");

        System.out.println("1."+ TYPE.HAWAII);
        System.out.println("2."+TYPE.MARGARITA);
        System.out.println("3."+TYPE.PEPERONI);
        System.out.println("4.Make your Own Pizza");
    }
    public static TYPE checkPizzas(int type){
        TYPE type1;
        switch (type){
            case 1:
                type1= TYPE.HAWAII; break;
            case 2:
                type1= TYPE.MARGARITA; break;
            case 3:
                type1= TYPE.PEPERONI; break;
            case 4:
                type1= TYPE.RAW; break;
            default: type1=null;break;
        }
        return type1;
    }
    public static void offerPizzaSize() {
        System.out.println("Menu: ");
        System.out.println("0. GO BACK ");

        System.out.println("1."+ SIZE.SMALL);
        System.out.println("2."+SIZE.MEDIUM);
        System.out.println("3."+SIZE.LARGE);
        System.out.println("4."+SIZE.XLARGE);

    }
    public static SIZE checkPizzasSize(int type){
        SIZE type1;
        switch (type){
            case 1:
                type1= SIZE.SMALL; break;
            case 2:
                type1= SIZE.MEDIUM; break;
            case 3:
                type1= SIZE.LARGE; break;
            case 4:
                type1= SIZE.XLARGE; break;
            default: type1=SIZE.MEDIUM;break;
        }
        return type1;
    }
    public static void offerIngredients() {
        System.out.println("Menu: ");
        System.out.println("0. GO BACK ");

        System.out.println("1."+ INGREDIENT.CHEESE);
        System.out.println("2."+INGREDIENT.CHICKEN);
        System.out.println("3."+INGREDIENT.JALAPENO);
        System.out.println("4."+INGREDIENT.SALAMI);
        System.out.println("5."+INGREDIENT.HAM);
        System.out.println("6."+INGREDIENT.PINAPPLE);

    }
    public static INGREDIENT[] checkIgredients(Integer[] type){
        INGREDIENT[] type2;
        List<INGREDIENT> type1 = new ArrayList<INGREDIENT>();
        for (Integer it: type){
            switch (it){
                case 1:
                    type1.add(INGREDIENT.CHEESE); break;
                case 2:
                    type1.add(INGREDIENT.CHICKEN); break;
                case 3:
                    type1.add(INGREDIENT.JALAPENO); break;
                case 4:
                    type1.add(INGREDIENT.SALAMI); break;
                case 5:
                    type1.add(INGREDIENT.HAM); break;
                case 6:
                    type1.add(INGREDIENT.PINAPPLE); break;
                default: type1=null;break;
            }
        }
        type2 = type1.toArray(new INGREDIENT[0]);
        return type2;
    }
    public static void offerDrinks() {
        System.out.println("Menu: ");
        System.out.println("0. GO BACK ");

        System.out.println("1."+ products.drinks.TYPE.COLA);

        System.out.println("2."+products.drinks.TYPE.FANTA);

        System.out.println("3."+products.drinks.TYPE.ORANGEJUICE);

        System.out.println("4."+products.drinks.TYPE.WATER);

    }
    public static products.drinks.TYPE checkDrinks(int type){
        products.drinks.TYPE type1;
        switch (type){
            case 1:
                type1= products.drinks.TYPE.COLA; break;
            case 2:
                type1= products.drinks.TYPE.FANTA; break;
            case 3:
                type1= products.drinks.TYPE.ORANGEJUICE; break;
            case 4:
                type1= products.drinks.TYPE.WATER; break;

            default: type1=null;break;
        }
        return type1;
    }

}
