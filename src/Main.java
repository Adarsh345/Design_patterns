import restaurant.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        System.out.println(order.placeOrder("samosa"));
        System.out.println(order.placeOrder("pizza"));
        System.out.println(order.placeOrder("daltikkad"));
        System.out.println(order.placeOrder("Chhole bhature"));

    }
}