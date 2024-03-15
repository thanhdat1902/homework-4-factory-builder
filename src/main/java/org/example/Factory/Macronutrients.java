package org.example.Factory;

import org.example.Factory.Factory.CarbsFactory;
import org.example.Factory.Factory.FatsFactory;
import org.example.Factory.Factory.ProteinFactory;

public class Macronutrients implements MacronutrientsAbstractFactory{
    private static Macronutrients macronutrients=null;
    private Macronutrients() {};
    public static Macronutrients getInstance(){
        if(macronutrients==null)
        {
            macronutrients= new Macronutrients();
        }
        return macronutrients;
    }
    @Override
    public CarbsFactory getCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    @Override
    public FatsFactory getFatsFactory() {
        return FatsFactory.getInstance();
    }

    @Override
    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }
}
