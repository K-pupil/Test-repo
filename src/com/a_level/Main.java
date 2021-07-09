package com.a_level;

import com.a_level.builder.CakeBuildDirector;
import com.a_level.facade.Drying;
import com.a_level.facade.Washing;
import com.a_level.facade.WashingFacade;
import com.a_level.facade.WashingMachine;
import com.a_level.factory.Wardrobe;
import com.a_level.factory.WardrobeFactory;

public class Main {

    public static void main(String[] args) {
        /*Singleton*/
        Singleton.getInstance("String");
        /*Factory*/
        WardrobeFactory wardrobeFactory = new WardrobeFactory();
        Wardrobe dress = wardrobeFactory.getDressed(WardrobeFactory.GET_DRESSED.DRESS);
        Wardrobe suit = wardrobeFactory.getDressed(WardrobeFactory.GET_DRESSED.SUIT);
        dress.getDressed();
        suit.getDressed();
        /*Facade*/
        WashingMachine washingMachine = new WashingMachine();
        Washing washing = new Washing();
        Drying drying = new Drying();
        WashingFacade washingFacade = new WashingFacade(washingMachine, washing, drying);
        washingFacade.washingProcess();
        /*Builder*/
        CakeBuildDirector cakeBuildDirector =new CakeBuildDirector();

    }
}





