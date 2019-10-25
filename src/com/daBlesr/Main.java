package com.daBlesr;

import com.daBlesr.FactoryPatternExample.PizzaBusiness;

public class Main {

    public static void main(String[] args) {
        try {
            PizzaBusiness.runExample();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
