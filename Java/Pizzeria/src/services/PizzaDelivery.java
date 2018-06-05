package services;

public class PizzaDelivery {
    private DELIVERYTYPE deliverytype;


    public PizzaDelivery(DELIVERYTYPE deliverytype) {
        this.deliverytype=deliverytype;
    }
//----------------------GETTERS/SETTERS-------------------------
    public DELIVERYTYPE getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(DELIVERYTYPE deliverytype) {
        this.deliverytype = deliverytype;
    }

}
