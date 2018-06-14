package services;


import products.pizza.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    public enum  DELIVERY {SELF_PICKUP,HOME_DELIVERY}
    private DELIVERY delivery;
    private double orderCost;
    private String  clientSurname;
    private String  clientNumber;
    private String  deliveryaddress;
    private ArrayList<Pizza> list =new ArrayList<>();


    public void addItem(Pizza product){
        this.list.add(product);
    }

    private Order(OrderBuilder builder) {
    this.orderCost=builder.orderCost;
    this.deliveryaddress=builder.deliveryaddress;
        this.delivery=builder.delivery;
        this.clientSurname=builder.clientSurname;
        this.clientNumber=builder.clientNumber;
        this.list.addAll(builder.list);
    }

    @Override
    public String toString() {
        int justAnIterator=0;

        StringBuilder sb = new StringBuilder();
        sb.append("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\--//////////////////////////"

                +"\n Name:"+clientSurname
                +" Phone number:" +clientNumber
                +" Delivery:"+delivery
                +" Delivery Address :"+deliveryaddress);
        for (Pizza it : list){
            justAnIterator++;
                sb.append("\n"+justAnIterator+". "+it.toString());
        }
        sb.append("\n-------------------------------\n TOTAL COST: ");
                sb.append(orderCost);
        return sb.toString();
    }
//----------------------------BUILDER
public static class OrderBuilder{
    private DELIVERY delivery;
    private double orderCost;
    private String  clientSurname;
    private String  clientNumber;
    private String  deliveryaddress;

    private ArrayList<Pizza> list =new ArrayList<>();


    public OrderBuilder(DELIVERY delivery){
        this.delivery=delivery;
        if(delivery.toString()=="HOME_DELIVERY")
            orderCost=10.00;
        else
            orderCost=0;
        this.clientSurname=clientSurname;

    }
    public OrderBuilder surname(String clientSurname){
        this.clientSurname=clientSurname;
        return this;
    }
    public OrderBuilder number(String clientNumber){
        this.clientNumber=clientNumber;
        return this;
    }
    public OrderBuilder pizza (Pizza... pizza){

       this.list.addAll(Arrays.asList(pizza));
        return this;
    }
    public OrderBuilder address (String address){

        this.deliveryaddress=address;
        return this;
    }
    public Order build(){
        if(this.deliveryaddress==null){
            this.deliveryaddress="Pizzastreet 11";
        }
        calculateCost();
        return new Order(this);
    }


    private void calculateCost(){
        for (Pizza it: list)
            this.orderCost+=it.getCost();

    }
}

}
