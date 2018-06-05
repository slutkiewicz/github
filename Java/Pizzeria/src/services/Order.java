package services;

import products.AbstractProduct;
import services.DELIVERYTYPE;

import java.util.ArrayList;

public class Order {
    private DELIVERYTYPE delivery;
    private double orderCost;
    private Client client;
    private ArrayList<AbstractProduct> list =new ArrayList<>();


    public void addItem(AbstractProduct product){
        this.list.add(product);
    }

    public Order(DELIVERYTYPE delivery,Client client, AbstractProduct... products) {
        this.delivery=delivery;
        this.client=client;
        for (AbstractProduct it : products)
           addItem(it);
    }
private void calculateCost(){
        this.orderCost=this.delivery.getCost();
        for (AbstractProduct it: list)
            this.orderCost+=it.getCost();

}
    @Override
    public String toString() {
        int justAnIterator=0;
        calculateCost();
        StringBuilder sb = new StringBuilder();
        sb.append("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\--//////////////////////////"
                +"\n Name:"+client.getSurname()
                +" Phone number:" +client.getPhoneNumber()
                +" Delivery:"+delivery);
        for (AbstractProduct it : list){
            justAnIterator++;
                sb.append("\n"+justAnIterator+". "+it.toString());
        }
        sb.append("\n-------------------------------\n TOTAL COST: ");
                sb.append(orderCost);
        return sb.toString();
    }
}
