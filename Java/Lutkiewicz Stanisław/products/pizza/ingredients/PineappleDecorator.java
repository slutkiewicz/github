package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class PineappleDecorator extends PizzaDecorator {
    public PineappleDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().addIngredients(new Ingredients("Pineapple",1,4.0,0));
        return super.decoratePizza();
    }
}
