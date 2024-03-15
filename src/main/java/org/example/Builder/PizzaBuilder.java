package org.example.Builder;

import java.util.ArrayList;

public class PizzaBuilder{
    private String pizzaChain;
    private String size;

    private ArrayList<String> toppings;

    public PizzaBuilder(String size) {
        if(isValidSize(size)) {
            this.size = size;
            this.pizzaChain = "Pizza Hut";
            this.toppings = new ArrayList<>();
        } else {
            throw new IllegalArgumentException("Invalid Pizza size.");
        }
    }

    public PizzaBuilder setPizzaHut() {
        this.pizzaChain = "Pizza Hut";
        return this;
    }

    public PizzaBuilder setLittleCaesars() {
        this.pizzaChain = "Little Caesars";
        return this;
    }

    public PizzaBuilder setDominos() {
        this.pizzaChain = "Dominos";
        return this;
    }



    public PizzaBuilder addPepperoni() {
        this.toppings.add("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        this.toppings.add("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.toppings.add("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        this.toppings.add("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        this.toppings.add("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        this.toppings.add("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        this.toppings.add("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        this.toppings.add("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        this.toppings.add("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.toppings.add("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        this.toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        this.toppings.add("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        this.toppings.add("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        this.toppings.add("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        this.toppings.add("Spicy Pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        this.toppings.add("Ham and Pineapple");
        return this;
    }

    public PizzaBuilder setPizzaChain(String pizzaChain){
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder setSize(String size){
        if(!isValidSize(size)){
            throw new IllegalArgumentException("Invalid Pizza size.");
        }
        this.size = size;return this;
    }

    public Pizza makePizza(){
        if (size == null){throw new IllegalStateException("Pizza size is required.");}
        return new Pizza(size, pizzaChain, toppings);
    }

    private boolean isValidSize(String size){
        String[] validSizes = {"Small", "Medium", "Large"};
        for (String x: validSizes){
            if (x.equalsIgnoreCase(size)){
                return true;
            }
        }
        return false;
    }
}