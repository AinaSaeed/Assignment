import java.util.ArrayList;

class PizzaShop {
    private String shopName;
    private ArrayList<Pizza> flavoursOffered;
    private int phoneNo;

    PizzaShop(String shopName ,ArrayList<Pizza>flavoursOffered) {
        this.shopName = shopName;
        this.flavoursOffered = flavoursOffered;
    }

    public void displayFlavourswithPrice() {
        for (Pizza pizza : flavoursOffered) {
            System.out.println(pizza);
        }
    }

    public short calculateAmount(String[] pizzas) {
        short amount = 0;
        for (String pizza : pizzas) {
            for (Pizza flavour : flavoursOffered) {
                if (flavour.getFlavour().equals(pizza)) {
                    amount += flavour.getPrice();
                    break;
                }
            }
        }
        return amount;
    }

    public String getShopName() {
        return shopName;
    }
}


