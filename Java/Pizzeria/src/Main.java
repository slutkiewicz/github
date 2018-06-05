import products.AbstractProduct;
import products.drinks.TYPE;
import services.DELIVERYTYPE;
import services.DrinkMaker;
import services.Order;
import services.Waitress;
import static products.ProductMenu.*;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        PizzaStore store=PizzaStore.getInstance();
        store.addOrder();
        store.showOrders();



    }


}
