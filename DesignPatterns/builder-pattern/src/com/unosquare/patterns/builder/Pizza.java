package com.unosquare.patterns.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Toping{HAM,ONION,PEPPER,SAUSAGE};
    final Set<Toping> topings;

    abstract static class Builder<T extends Builder<T>>{
        //Creates empty enumset of type topping
        EnumSet<Toping> toppings = EnumSet.noneOf(Toping.class);
        //We return a generic Builder
        public T addTopping(Toping toping){
            toppings.add(Objects.requireNonNull(toping));
            return self();

        }
        protected abstract T self();
        //We'll return a subtype in the subclass: covariant return typing
        abstract Pizza build();
    }
    Pizza(Builder<?> builder){
        //Enumset is mutable so we should return a copy as good practice
        topings = builder.toppings.clone();
    }
}
