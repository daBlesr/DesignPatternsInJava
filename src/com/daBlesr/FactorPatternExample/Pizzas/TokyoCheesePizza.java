package com.daBlesr.FactorPatternExample.Pizzas;

import com.daBlesr.FactorPatternExample.Ingredient;
import com.daBlesr.FactorPatternExample.Pizza;
import com.daBlesr.FactorPatternExample.PizzaBusiness;
import com.daBlesr.FactorPatternExample.PizzaStore;

public class TokyoCheesePizza extends Pizza {

    private Ingredient[] ingredients = new Ingredient[] {
            () -> "Mozarella",
            () -> "Monchou"
    };

    @Override
    public PizzaStore getStore() {
        return PizzaBusiness.TokyoStore;
    }

    @Override
    public Ingredient[] getIngredients() {
        return this.ingredients;
    }
}
