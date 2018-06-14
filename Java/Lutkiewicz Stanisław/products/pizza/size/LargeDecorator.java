package products.pizza.size;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class LargeDecorator extends PizzaDecorator {
    public LargeDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().setSize("Large");
        this.getPizza().setBaseCost(25.00);
        return super.decoratePizza();
    }
}
