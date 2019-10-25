package com.daBlesr.FactorPatternExample;

public abstract class Pizza {

    void prepare() {
        System.out.println("preparing " + this.getClass().getSimpleName());
    }

    void bake() {
        System.out.println("baking " + this.getClass().getSimpleName());
    }

    void box() {
        System.out.println("boxing " + this.getClass().getSimpleName());
    }

    protected abstract PizzaStore getStore();
    public abstract Ingredient[] getIngredients();
}
