package services;

import products.pizza.ingredients.INGREDIENT;
import products.pizza.Pizza;
import products.pizza.SIZE;
import products.pizza.TYPE;

public class PizzaCooker extends Maker {
    public PizzaCooker() {
    }
    //-----------------------------MAKING STANDARD PIZZA---------------------------

    public Pizza getProduct(TYPE TYPE, SIZE size){
        Pizza pizza = TYPE.getPizza();
        pizza.setSize(size);
        pizza.setBaseCost(pizza.getSize().getCost());
        pizza.calculateIngredients();

        return pizza;
    }
    //-------------------------MAKING UNIQUE PIZZA-------------------

    public Pizza getProduct(TYPE TYPE, SIZE size, INGREDIENT... ingredients){
        Pizza pizza = TYPE.getPizza();
        pizza.setName("Unique "+pizza.getName());
        pizza.setSize(size);
        pizza.setBaseCost(pizza.getSize().getCost());
        pizza.addIngredients(ingredients);
        pizza.calculateIngredients();

        return pizza;
    }

}
