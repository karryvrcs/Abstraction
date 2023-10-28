package dev.challenge;

abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public double getPrice(int quantity){
        return quantity * price;
    }

    public void printItem(int quantity){
        System.out.println("Quantity: " + quantity + "  " + "Price: " + price);

    }

    abstract void showDetails();
}
