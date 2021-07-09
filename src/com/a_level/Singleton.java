package com.a_level;

public class Singleton {
    //Singleton pattern
    String singleton;
    static Singleton instance;
    private Singleton(String singleton){
        this.singleton=singleton;
    }
    public static Singleton getInstance(String singleton){
        if(instance==null)
            instance=new Singleton(singleton);
        return instance;
    }
}
