package org.example.Factory;

import org.example.Factory.Factory.CarbsFactory;
import org.example.Factory.Factory.FatsFactory;
import org.example.Factory.Factory.ProteinFactory;

public interface MacronutrientsAbstractFactory {
    CarbsFactory getCarbsFactory();
    FatsFactory getFatsFactory();
    ProteinFactory getProteinFactory();
}
