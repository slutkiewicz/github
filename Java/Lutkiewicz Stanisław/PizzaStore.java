import services.Order;


import java.util.ArrayList;

public class PizzaStore {

    private ArrayList<Order> orders = new ArrayList<>();

    private static PizzaStore ourInstance = new PizzaStore();

    public static PizzaStore getInstance() {
        return ourInstance;
    }


    private PizzaStore() {
    }

    public void addOrder(Order order){
       orders.add(order);

    }
    public void showOrders(){
        String s;
        s= orders.toString();
        System.out.println(s);
    }

}
