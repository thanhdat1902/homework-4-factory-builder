package org.example.Builder;

import java.util.ArrayList;

public class Pizza {
    private String size;
    private String chain;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    private ArrayList<String> toppings;
    public Pizza(String size, String chain, ArrayList<String> toppings) {
        this.size = size;
        this.chain = chain;
        this.toppings = toppings;
    }
    public void eat() {
        System.out.println("Pizza brand: " + this.chain + ",size: " + this.size + " with " + toppings.size() + " topping(s):");
        for (String topping: this.toppings)
            System.out.println("-" + topping);
    }

}