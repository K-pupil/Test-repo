package com.a_level.builder;
//Builder pattern
public class CakeBuildDirector {
    public CakeBuildDirector(){
        Cake newCake = new Cake.CakeBuilder()
                .layerColor("Green")
                .taste("Very good")
                .build();
    }
}
