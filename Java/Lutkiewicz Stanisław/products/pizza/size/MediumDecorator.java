package products.pizza.size;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class MediumDecorator extends PizzaDecorator {
    public MediumDecorator(Pizza pizza) {
        super(pizza);
    }
    public Pizza decoratePizza(){
        this.getPizza().setSize("Medium");
        this.getPizza().setBaseCost(20.00);
        return super.decoratePizza();
    }
}
