package com.a_level.builder;
//Builder pattern
public class Cake {
    private String layerColor;
    private String taste;

    public static class CakeBuilder{
        private Cake cake;

        public CakeBuilder(){
            cake=new Cake();
        }

        public CakeBuilder layerColor(String layerColor){
            cake.layerColor=layerColor;
            return this;
        }
        public CakeBuilder taste(String taste){
            cake.taste=taste;
            return this;
        }
        public Cake build(){
            return cake;
        }
    }
}
