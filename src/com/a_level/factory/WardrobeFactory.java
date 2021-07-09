package com.a_level.factory;

//Factory pattern
public class WardrobeFactory {
    public enum GET_DRESSED{
        DRESS,
        SUIT;
    }

    public Wardrobe getDressed(GET_DRESSED clothes) {
        Wardrobe choise=null;
        switch (clothes){
            case DRESS: choise=new Dress(); break;
            case SUIT: choise=new Suit(); break;
            default:
                System.out.println("Nothing to put on!");
        }
        return choise;

    }

}
