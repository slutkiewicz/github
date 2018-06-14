package products.pizza;

import products.pizza.ingredients.Ingredients;

public class PizzaMargarita extends Pizza {

    public PizzaMargarita() {
        super("Margarita");
        this.addIngredients(new Ingredients("Cheese",1,4.0,0));
    }
}
