package dev.challenge;

import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> list;

    public Store(ArrayList<ProductForSale> list) {
        this.list = list;
    }

    public void addItemToOrder(ProductForSale product){
        list.add(product);
    }

    public void printOrder(){

    }
}
