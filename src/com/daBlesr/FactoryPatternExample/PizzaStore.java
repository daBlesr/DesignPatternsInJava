package com.daBlesr.FactoryPatternExample;

public interface PizzaStore {
    String getName();

    Pizza createPizza(String pizzaType) throws Exception;
}
