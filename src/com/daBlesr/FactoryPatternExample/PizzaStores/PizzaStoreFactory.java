package com.daBlesr.FactoryPatternExample.PizzaStores;

import com.daBlesr.FactoryPatternExample.PizzaBusiness;
import com.daBlesr.FactoryPatternExample.PizzaStore;

public class PizzaStoreFactory {

    public static PizzaStore getStore(String store) throws Exception {
        switch (store) {
            case "Tokyo":
                return PizzaBusiness.TokyoStore;
            case "Utrecht":
                return PizzaBusiness.UtrechtStore;
            default:
                throw new Exception("Cannot find store");
        }
    }
}
