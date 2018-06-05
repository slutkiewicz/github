package products.drinks;


import products.AbstractProduct;

public class Drink extends AbstractProduct {
    protected String name;

    protected double cost;

    public Drink(String name,double cost) {

        this.name = name;
        this.cost= cost;
    }
    //----------------------GETTERS/SETTERS-------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        String string= name+" Cost:"+cost;
                return string;
    }
}
