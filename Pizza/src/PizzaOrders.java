class PizzaOrders {
    PizzaShop orderFrom;
    private String[] pizzaSelected;
    private short totalAmount;
    private float deliveryTime;

    PizzaOrders(PizzaShop orderFrom) {
        this.orderFrom = orderFrom;
    }

    public void displayFlavours() {
        orderFrom.displayFlavourswithPrice();
    }

    public void makeOrder(String... pizzaFlavour) {
        this.pizzaSelected = pizzaFlavour;
    }

    public void calculateTotalAmount() {
        this.totalAmount = orderFrom.calculateAmount(pizzaSelected);
    }

    public void printOrder() {
        System.out.println("Pizza Shop: " + orderFrom.getShopName());
        System.out.println("Pizza Flavours selected:");
        for (String flavour : pizzaSelected) {
            System.out.println("\t" + flavour);
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}
