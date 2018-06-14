package products.pizza.size;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class SmallDecorator extends PizzaDecorator {
    public SmallDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().setSize("Small");
        this.getPizza().setBaseCost(15.00);
        return super.decoratePizza();
    }
}
