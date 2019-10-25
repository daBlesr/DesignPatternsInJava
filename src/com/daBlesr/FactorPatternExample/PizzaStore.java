package com.daBlesr.FactorPatternExample;

public interface PizzaStore {
    String getName();

    Pizza createPizza(String pizzaType) throws Exception;
}
