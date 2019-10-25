package com.daBlesr.FactoryPatternExample.PizzaStores;

import com.daBlesr.FactoryPatternExample.Pizza;
import com.daBlesr.FactoryPatternExample.PizzaStore;
import com.daBlesr.FactoryPatternExample.Pizzas.UtrechtCheesePizza;
import com.daBlesr.FactoryPatternExample.Pizzas.UtrechtFishPizza;
import com.daBlesr.FactoryPatternExample.Pizzas.UtrechtSalamiPizza;

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
