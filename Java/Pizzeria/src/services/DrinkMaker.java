package services;

import products.AbstractProduct;
import products.drinks.Drink;

import products.drinks.TYPE;

public class DrinkMaker extends Maker {


    public Drink getProduct(TYPE type) {
        Drink drink=type.getDrink();

        return drink;
    }
}
