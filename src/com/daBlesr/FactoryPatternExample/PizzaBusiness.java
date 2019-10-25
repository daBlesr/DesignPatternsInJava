package com.daBlesr.FactoryPatternExample;


import com.daBlesr.FactoryPatternExample.PizzaStores.TokyoStore;
import com.daBlesr.FactoryPatternExample.PizzaStores.UtrechtStore;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PizzaBusiness {

    public static PizzaStore TokyoStore = new TokyoStore();
    public static PizzaStore UtrechtStore = new UtrechtStore();

    public static void runExample() throws Exception {

         Order[] orders = new Order[] {
                 new Order("Tokyo", "Fish"),
                 new Order("Utrecht", "Fish"),
                 new Order("Tokyo", "Salami"),
                 new Order("Tokyo", "Salami"),
                 new Order("Utrecht", "Cheese"),
         };

         Pizza[] pizzas = new Pizza[orders.length];

         for (int i = 0; i < orders.length; i++) {
             pizzas[i] = PizzaFactory.createPizza(orders[i]);
         }

         for (Pizza pizza : pizzas) {
             System.out.println(
                     "Pizza from " + pizza.getStore().getName() + " with " +
                             Arrays.stream(pizza.getIngredients())
                                .map(Ingredient::getName)
                                .collect(Collectors.joining(" and "))
             );
         }
    }
}
