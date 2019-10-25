package com.daBlesr.FactoryPatternExample;

import com.daBlesr.FactoryPatternExample.PizzaStores.PizzaStoreFactory;

class PizzaFactory {

    static Pizza createPizza(Order order) throws Exception {
        PizzaStore store = PizzaStoreFactory.getStore(order.store);
        Pizza pizza = store.createPizza(order.pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
