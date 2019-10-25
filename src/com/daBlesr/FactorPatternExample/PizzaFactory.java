package com.daBlesr.FactorPatternExample;

class PizzaFactory {

    static Pizza createPizza(Order order) throws Exception {
        Pizza pizza;
        switch(order.store) {
            case "Utrecht":
                pizza = PizzaBusiness.UtrechtStore.createPizza(order.pizzaType);
                break;
            case "Tokyo":
                pizza = PizzaBusiness.TokyoStore.createPizza(order.pizzaType);
                break;
            default:
                throw new Exception("Cannot find store");
        }

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
