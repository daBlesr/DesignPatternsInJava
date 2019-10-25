package com.daBlesr.FactoryPatternExample.PizzaStores;

import com.daBlesr.FactoryPatternExample.Pizza;
import com.daBlesr.FactoryPatternExample.PizzaStore;
import com.daBlesr.FactoryPatternExample.Pizzas.TokyoCheesePizza;
import com.daBlesr.FactoryPatternExample.Pizzas.TokyoFishPizza;
import com.daBlesr.FactoryPatternExample.Pizzas.TokyoSalamiPizza;

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
