package com.daBlesr.FactorPatternExample.Pizzas;

import com.daBlesr.FactorPatternExample.Ingredient;
import com.daBlesr.FactorPatternExample.Pizza;
import com.daBlesr.FactorPatternExample.PizzaBusiness;
import com.daBlesr.FactorPatternExample.PizzaStore;

public class UtrechtFishPizza extends Pizza {
    private Ingredient[] ingredients = new Ingredient[] {
            () -> "Haring",
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
