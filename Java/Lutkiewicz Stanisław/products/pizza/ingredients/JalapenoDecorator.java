package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class JalapenoDecorator extends PizzaDecorator {
    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().addIngredients(new Ingredients("Jalapeno",1,7.0,4));
        return super.decoratePizza();
    }
}
