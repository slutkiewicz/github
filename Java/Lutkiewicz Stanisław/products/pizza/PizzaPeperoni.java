package products.pizza;

import products.pizza.ingredients.Ingredients;

public class PizzaPeperoni extends Pizza {
    public PizzaPeperoni() {
        super("Peperoni");
        this.addIngredients(new Ingredients("Cheese",1,4.0,0));
        this.addIngredients(new Ingredients("Jalapeno",1,7.0,4));
        this.addIngredients(new Ingredients("Salami",1,6.0,2));

    }
}
