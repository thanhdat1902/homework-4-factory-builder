package org.example.Factory.Factory;

import org.example.Factory.Protein.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory proteinFactory=null;
    private ProteinFactory() {};
    public static ProteinFactory getInstance(){
        if(proteinFactory==null)
        {
            proteinFactory= new ProteinFactory();
        }
        return proteinFactory;
    }
    private final List<String> protein = new ArrayList<>(Arrays.asList("fish","chicken","beef","tofu"));
    public Protein getFoodInstance(String type) {
        switch (type) {
            case "fish":
                return new Fish();
            case "chicken":
                return new Chicken();
            case "beef":
                return new Beef();
            case "tofu":
                return new Tofu();
            default:
                return null;
        }
    }
    public Protein getFoodOnDiet(List<String> dietList) {
        List<String> proteinDiet = new ArrayList<>(protein);
        for(String diet: dietList) {
            if (protein.contains(diet)) {
                proteinDiet.remove(diet);
            }
        }
        int ran = new Random().nextInt(proteinDiet.size());
        return getFoodInstance(proteinDiet.get(ran));
    }
}
