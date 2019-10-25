package com.daBlesr.FactoryPatternExample.Pizzas;

import com.daBlesr.FactoryPatternExample.Ingredient;
import com.daBlesr.FactoryPatternExample.Pizza;
import com.daBlesr.FactoryPatternExample.PizzaBusiness;
import com.daBlesr.FactoryPatternExample.PizzaStore;

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
