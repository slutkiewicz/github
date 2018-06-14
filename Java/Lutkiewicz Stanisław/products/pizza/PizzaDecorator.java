package products.pizza;

public class PizzaDecorator {

    Pizza pizza;



    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    public Pizza decoratePizza(){
        this.pizza.calculateIngredients();
        return this.pizza;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }


}
