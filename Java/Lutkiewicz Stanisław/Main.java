import products.pizza.TYPE;
import products.pizza.ingredients.JalapenoDecorator;
import products.pizza.size.LargeDecorator;
import products.pizza.size.MediumDecorator;
import products.pizza.size.SmallDecorator;
import products.pizza.ingredients.ChickenDecorator;
import services.Order;

import static products.pizza.ingredients.IngredientDecorator.*;
import static services.PizzaFactory.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore store=PizzaStore.getInstance();

        store.addOrder(new Order.OrderBuilder(Order.DELIVERY.SELF_PICKUP)
                .surname("Don Pizzer")
                .pizza(new SmallDecorator (getPizza(TYPE.HAWAII)).decoratePizza()
                        ,new LargeDecorator(getPizza(TYPE.PEPERONI)).decoratePizza())
                .build());


        PizzaStore store2 = PizzaStore.getInstance();
        store2.addOrder(new Order.OrderBuilder(Order.DELIVERY.SELF_PICKUP)
                .surname("Don Pablo")
                .pizza(new ChickenDecorator(new SmallDecorator (getPizza(TYPE.MARGARITA)).decoratePizza()).decoratePizza()
                        ,new LargeDecorator(getPizza(TYPE.PEPERONI)).decoratePizza())
                .build());


        store2.addOrder(new Order.OrderBuilder(Order.DELIVERY.HOME_DELIVERY)
                .surname("Don Pizzer")
                .number("64832168")
                .address("Karolina 16")
                .pizza(new ChickenDecorator(new SmallDecorator (getPizza(TYPE.MARGARITA)).decoratePizza()).decoratePizza()
                        ,new LargeDecorator(getPizza(TYPE.PEPERONI)).decoratePizza())
                .build());

//----------------------------STATIC DECORATOR METOD
        store2.addOrder(new Order.OrderBuilder(Order.DELIVERY.HOME_DELIVERY)
                .surname("New MEthod")
                .number("46846")
                .address("Jagielonska 15")
                .pizza(jalapenoDecorate(new SmallDecorator(getPizza(TYPE.MARGARITA)).decoratePizza())
                        ,pineappleDecorate(new LargeDecorator(getPizza(TYPE.PEPERONI)).decoratePizza())
                        ,cheeseDecorate(jalapenoDecorate(pineappleDecorate(new MediumDecorator(getPizza(TYPE.RAW)).decoratePizza()))))
                .build());

        //String s = pizza.toString()
store.showOrders();
           }


}
