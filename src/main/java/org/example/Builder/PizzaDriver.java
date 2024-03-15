package org.example.Builder;

public class PizzaDriver {
    public static void main(String[] args) {
        //    Question 1:
        System.out.println("------------------------------- Question 1 -------------------------------");
        Pizza pizzaSmall3 = new PizzaBuilder("Small")
                .addBeef()
                .addExtraCheese()
                .addSausage()
                .makePizza();

        pizzaSmall3.eat();

        Pizza pizzaMedium6 = new PizzaBuilder("Medium")
                .addSpicyPork()
                .addHamAndPineapple()
                .addMushrooms()
                .addOnions()
                .addOlives()
                .addPesto()
                .makePizza();
        pizzaMedium6.eat();

        Pizza pizzaLarge9 = new PizzaBuilder("Large")
                .addPeppers()
                .addPesto()
                .addOlives()
                .addPepperoni()
                .addChicken()
                .addExtraCheese()
                .addSpinach()
                .addBacon()
                .addSpicyPork()
                .makePizza();
        pizzaLarge9.eat();

        //    Question 2:
        System.out.println("------------------------------- Question 2 -------------------------------");
        Pizza pizzaHutLarge3 = new PizzaBuilder("Large")
                .setPizzaHut()
                .addHamAndPineapple()
                .addMushrooms()
                .addOnions()
                .makePizza();

        Pizza pizzaHutSmall2 = new PizzaBuilder("Small")
                .setPizzaHut()
                .addBeef()
                .addSpinach()
                .makePizza();

        Pizza pizzaLittleCaesarsMedium8 = new PizzaBuilder("Medium")
                .setLittleCaesars()
                .addPepperoni()
                .addOlives()
                .addMushrooms()
                .addBacon()
                .addHam()
                .addChicken()
                .addExtraCheese()
                .addPeppers()
                .makePizza();

        Pizza pizzaLittleCaesarsSmall6 = new PizzaBuilder("Small")
                .setLittleCaesars()
                .addBeef()
                .addTomatoAndBasil()
                .addSpicyPork()
                .addPesto()
                .addPeppers()
                .addHamAndPineapple()
                .makePizza();

        Pizza pizzaDominosSmall1 = new PizzaBuilder("Small")
                .setDominos()
                .addBeef()
                .makePizza();

        Pizza pizzaDominosLarge3 = new PizzaBuilder("Large")
                .setDominos()
                .addSausage()
                .addExtraCheese()
                .addOnions()
                .makePizza();

        pizzaHutLarge3.eat();
        pizzaHutSmall2.eat();
        pizzaLittleCaesarsMedium8.eat();
        pizzaLittleCaesarsSmall6.eat();
        pizzaDominosSmall1.eat();
        pizzaDominosLarge3.eat();
    }
}
