package org.example.Factory;

import org.example.Factory.Carbs.Carbs;
import org.example.Factory.Fats.Fats;
import org.example.Factory.Protein.Protein;

import java.sql.Array;
import java.util.*;

public class Customer {
    private String name;
    private DietPlan dietPlan;
    private Carbs carbs;
    private Fats fats;
    private Protein protein;
    public Customer(String name, DietPlan dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }
    public void createMeal(){
        List<String> listUnits = getFoodUnitsMeetDietPlan();
        this.carbs = Macronutrients.getInstance().getCarbsFactory().getFoodOnDiet(listUnits);

        this.fats = Macronutrients.getInstance().getFatsFactory().getFoodOnDiet(listUnits);
        this.protein = Macronutrients.getInstance().getProteinFactory().getFoodOnDiet(listUnits);
    }
    public void showMeal() {
        System.out.println("Name: " + this.name);
        System.out.println("Meal plan: " + dietPlan.toString());
        System.out.println("Serve with: " + carbs.toString() + ", " + protein.toString() + ", " + fats.toString());
    }
    private List<String> getFoodUnitsMeetDietPlan() {
        List<String> restrictedSet = null;
        switch (dietPlan) {
            case NO_RESTRICTION:
                restrictedSet = new ArrayList<>();
                break;
            case PALEO:
                restrictedSet = new ArrayList<>(Arrays.asList("bread", "lentils", "tofu", "cheese", "sour cream"));
                break;
            case VEGAN:
                restrictedSet = new ArrayList<>(Arrays.asList("fish", "chicken", "tuna", "beef", "cheese", "sour cream"));
                break;
            case NUT_ALLERGY:
                restrictedSet = new ArrayList<>(Arrays.asList("pistachio", "peanuts"));
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan.");
        }
        return restrictedSet;
    }
}
