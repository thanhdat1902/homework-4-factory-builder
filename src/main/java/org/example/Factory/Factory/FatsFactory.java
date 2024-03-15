package org.example.Factory.Factory;

import org.example.Factory.Fats.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatsFactory {
    private static FatsFactory fatsFactory=null;
    private FatsFactory() {};
    public static FatsFactory getInstance(){
        if(fatsFactory==null)
        {
            fatsFactory= new FatsFactory();
        }
        return fatsFactory;
    }
    private final List<String> fats = new ArrayList<>(Arrays.asList("avocado","sour cream","tuna","peanuts"));

    public Fats getFoodInstance(String type) {

        switch (type) {
            case "avocado":
                return new Avocado();
            case "sour cream":
                return new SourCream();
            case "tuna":
                return new Tuna();
            case "peanuts":
                return new Peanuts();
            default:
                return null;
        }
    }
    public Fats getFoodOnDiet(List<String> dietList) {
        List<String> fatsDiet = new ArrayList<>(fats);
        for(String diet: dietList) {
            if (fats.contains(diet)) {
                fatsDiet.remove(diet);
            }
        }
        int ran = new Random().nextInt(fatsDiet.size());
        return getFoodInstance(fatsDiet.get(ran));
    }
}
