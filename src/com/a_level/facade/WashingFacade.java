package com.a_level.facade;

public class WashingFacade {
    WashingMachine washingMachine;
    Washing washing;
    Drying drying;

    public WashingFacade(WashingMachine washingMachine, Washing washing, Drying drying){
        this.washingMachine=washingMachine;
        this.washing=washing;
        this.drying=drying;
    }

    public void washingProcess(){
        washingMachine.powerOn();
        washing.washing();
        drying.drying();
        washingMachine.powerOff();

    }
}
