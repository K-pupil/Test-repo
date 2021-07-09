package com.a_level.factory;

public class Suit implements Wardrobe{
    @Override
    public void getDressed() {
        System.out.println("I choose suit today!");
    }
}
