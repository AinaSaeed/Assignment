class Pizza {
    private String flavour;
    private short price;

    Pizza(String flavour, short price) {
        this.flavour = flavour;
        this.price = price;
    }

    public String toString() {
        return ("Flavour: " + flavour + "Price::" + price);
    }

    public Object getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour.toString();
    }

    public int getPrice() {
        return price;
    }
}

