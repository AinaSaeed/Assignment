import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create Pizza objects
        Pizza pizza1 = new Pizza("Tikka : ", (short) 10);
                Pizza pizza2 = new Pizza("Pepperoni : ", (short) 12);
                Pizza pizza3 = new Pizza("Fajita : ", (short) 11);
                Pizza pizza4 = new Pizza("Supreme : ", (short) 13);

                // Create PizzaShop objects
                ArrayList<Pizza> shop1Flavours = new ArrayList<>();
        shop1Flavours.add(pizza1);
        shop1Flavours.add(pizza2);
        PizzaShop shop1 = new PizzaShop("Italian Pizza",shop1Flavours);

        ArrayList<Pizza> shop2Flavours = new ArrayList<>();
        shop2Flavours.add(pizza3);
        shop2Flavours.add(pizza4);

                PizzaShop shop2 = new PizzaShop("Pizza Hut", shop2Flavours);

                // Create PizzaOrders objects
                PizzaOrders order1 = new PizzaOrders(shop1);
        PizzaOrders order2 = new PizzaOrders(shop2);

        // Display pizza flavors offered by both PizzaShops
        System.out.println("Pizza flavors offered by " + shop1.getShopName() + ":");
        order1.displayFlavours();
        System.out.println();

        System.out.println("Pizza flavors offered by " + shop2.getShopName() + ":");
        order2.displayFlavours();
        System.out.println();

        // Make orders
        order1.makeOrder("Tikka","Pepperoni");
                order2.makeOrder("Fajita","Supreme");

                        // Calculate the total amount for each order
                        order1.calculateTotalAmount();
        order2.calculateTotalAmount();

        // Print orders
        System.out.println("Order from " + order1.orderFrom.getShopName() + ":");
        order1.printOrder();
        System.out.println();

        System.out.println("Order from " + order2.orderFrom.getShopName() + ":");
        order2.printOrder();
    }
}