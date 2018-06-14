package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class SalamiDecorator extends PizzaDecorator {
    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().addIngredients(new Ingredients("Salami",1,6.0,2));
        return super.decoratePizza();
    }
}
