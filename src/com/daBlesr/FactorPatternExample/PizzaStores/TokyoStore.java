package com.daBlesr.FactorPatternExample.PizzaStores;

import com.daBlesr.FactorPatternExample.Pizza;
import com.daBlesr.FactorPatternExample.PizzaStore;
import com.daBlesr.FactorPatternExample.Pizzas.TokyoCheesePizza;
import com.daBlesr.FactorPatternExample.Pizzas.TokyoFishPizza;
import com.daBlesr.FactorPatternExample.Pizzas.TokyoSalamiPizza;

public class TokyoStore implements PizzaStore {
    @Override
    public String getName() {
        return "Tokyo";
    }

    @Override
    public Pizza createPizza(String pizzaType) throws Exception {
        switch (pizzaType) {
            case "Cheese":
                return new TokyoCheesePizza();
            case "Fish":
                return new TokyoFishPizza();
            case "Salami":
                return new TokyoSalamiPizza();
        }
        throw new Exception("Unknown pizza type");
    }
}
