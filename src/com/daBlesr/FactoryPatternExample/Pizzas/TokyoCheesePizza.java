package com.daBlesr.FactoryPatternExample.Pizzas;

import com.daBlesr.FactoryPatternExample.Ingredient;
import com.daBlesr.FactoryPatternExample.Pizza;
import com.daBlesr.FactoryPatternExample.PizzaBusiness;
import com.daBlesr.FactoryPatternExample.PizzaStore;

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
