package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().addIngredients(new Ingredients("Ham",1,4.0,0));
        return super.decoratePizza();
    }
}
