package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class ChickenDecorator extends PizzaDecorator {
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().addIngredients(new Ingredients("Chicken",1,6.0,0));
        return super.decoratePizza();
    }
}
