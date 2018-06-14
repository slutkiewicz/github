package products.pizza.ingredients;

import products.pizza.Pizza;
import products.pizza.PizzaDecorator;

public class IngredientDecorator extends PizzaDecorator {
    public IngredientDecorator(Pizza pizza) {
        super(pizza);
    }
    public static Pizza jalapenoDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Jalapeno",1,7.0,4))).decoratePizza();

    }
    public static Pizza chickenDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Chicken",1,6.0,0))).decoratePizza();

    }
    public static Pizza hamDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Ham",1,4.0,0))).decoratePizza();

    }
    public static Pizza pineappleDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Pineapple",1,4.0,0))).decoratePizza();

    }
    public static Pizza salamiDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Salami",1,6.0,2))).decoratePizza();

    }
    public static Pizza cheeseDecorate(Pizza pizza){
        return new IngredientDecorator(pizza.addIngredients(new Ingredients("Cheese",1,4.0,0))).decoratePizza();

    }
}
