package products.pizza.ingredients;

public class Ingredients {
    private int quantity;
    private String name;
    private double price;
    private int spiceLVL;

    public Ingredients( String name,int quantity, double price, int spiceLVL) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.spiceLVL = spiceLVL;
    }

    //----------------------TO STRING-------------------------
    @Override
    public String toString() {
        String string= quantity+" Cost: " + quantity*getPrice();
        return string;
    }

//----------------------GETTERS/SETTERS-------------------------
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpiceLVL(int spiceLVL) {
        this.spiceLVL = spiceLVL;
    }

    public String getName() {
        return this.name;
    }


    public double getPrice() {
        return this.price;
    }


    public int getSpiceLVL() {
        return this.spiceLVL;
    }

    public int getQuantity() {
        return this.quantity;
    }

}
