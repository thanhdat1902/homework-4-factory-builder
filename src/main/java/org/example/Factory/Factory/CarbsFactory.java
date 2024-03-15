package org.example.Factory.Factory;

import org.example.Factory.Carbs.*;

import java.util.*;

public class CarbsFactory {
    private static CarbsFactory carbsFactory=null;
    private CarbsFactory(){}
    public static CarbsFactory getInstance(){
        if(carbsFactory==null)
        {
            carbsFactory= new CarbsFactory();
        }
        return carbsFactory;
    }
    private final List<String> carbs = new ArrayList<>(Arrays.asList("cheese","bread","lentils","pistachio"));

    private Carbs getFoodInstance(String type) {
        switch (type) {
            case "cheese":
                return new Cheese();
            case "bread":
                return new Bread();
            case "lentils":
                return new Lentils();
            case "pistachio":
                return new Pistachio();
            default:
                return null;
        }
    }
    public Carbs getFoodOnDiet(List<String> dietList) {
        List<String> carbsDiet = new ArrayList<>(carbs);
        for(String diet: dietList) {
            if (carbs.contains(diet)) {

                carbsDiet.remove(diet);
            }
        }
        int ran = new Random().nextInt(carbsDiet.size());
        return getFoodInstance(carbsDiet.get(ran));
    }
}
