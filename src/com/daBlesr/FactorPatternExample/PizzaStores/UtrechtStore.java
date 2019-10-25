package com.daBlesr.FactorPatternExample.PizzaStores;

import com.daBlesr.FactorPatternExample.Pizza;
import com.daBlesr.FactorPatternExample.PizzaStore;
import com.daBlesr.FactorPatternExample.Pizzas.UtrechtCheesePizza;
import com.daBlesr.FactorPatternExample.Pizzas.UtrechtFishPizza;
import com.daBlesr.FactorPatternExample.Pizzas.UtrechtSalamiPizza;

public class UtrechtStore implements PizzaStore {
    @Override
    public String getName() {
        return "Utrecht";
    }

    @Override
    public Pizza createPizza(String pizzaType) throws Exception {
        switch (pizzaType) {
            case "Cheese":
                return new UtrechtCheesePizza();
            case "Fish":
                return new UtrechtFishPizza();
            case "Salami":
                return new UtrechtSalamiPizza();
        }
        throw new Exception("Unknown pizza type");
    }

}
