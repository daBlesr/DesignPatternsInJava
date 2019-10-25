package com.daBlesr.FactorPatternExample.Pizzas;

import com.daBlesr.FactorPatternExample.Ingredient;
import com.daBlesr.FactorPatternExample.Pizza;
import com.daBlesr.FactorPatternExample.PizzaBusiness;
import com.daBlesr.FactorPatternExample.PizzaStore;

public class UtrechtSalamiPizza extends Pizza {
    private Ingredient[] ingredients = new Ingredient[] {
            () -> "Hollandse Salami",
    };

    @Override
    public PizzaStore getStore() {
        return PizzaBusiness.UtrechtStore;
    }

    @Override
    public Ingredient[] getIngredients() {
        return this.ingredients;
    }
}
