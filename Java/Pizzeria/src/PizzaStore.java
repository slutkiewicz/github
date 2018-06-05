import services.Order;
import services.Waitress;

import java.util.ArrayList;

public class PizzaStore {

    private ArrayList<Order> orders = new ArrayList<>();

    private static PizzaStore ourInstance = new PizzaStore();

    public static PizzaStore getInstance() {
        return ourInstance;
    }

    private Waitress waitress=new Waitress();

    private PizzaStore() {
    }

    public void addOrder(){
        orders.add(waitress.createOrder());
    }
    public void showOrders(){
        String s;
       s= orders.toString();
       System.out.println(s);
    }
}
