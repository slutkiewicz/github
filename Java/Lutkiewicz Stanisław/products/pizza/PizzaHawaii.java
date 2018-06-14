package products.pizza;

import products.pizza.ingredients.Ingredients;

public class PizzaHawaii extends Pizza{
    public PizzaHawaii() {
        super("Hawaii");
        this.addIngredients(new Ingredients("Cheese",1,4.0,0));
                this.addIngredients(new Ingredients("Ham",1,4.0,0));
                        this.addIngredients(new Ingredients("Pineapple",1,4.0,0));
    }
}
