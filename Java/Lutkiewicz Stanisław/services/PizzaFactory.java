package services;

import products.pizza.*;
import products.pizza.ingredients.*;

public class PizzaFactory{
    public PizzaFactory() {
    }
    //-----------------------------MAKING STANDARD PIZZA---------------------------

    public static Pizza getPizza(TYPE type) {
        switch (type.getName()) {
            case "Hawaii":
                return new PizzaHawaii();

            case "Margarita":
                return new PizzaMargarita();

            case "Peperoni":
                return new PizzaPeperoni();

            case "Unique":

                return new PizzaRaw();
        }
        return null;
    }


}
