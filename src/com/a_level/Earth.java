package com.a_level;

public class Earth implements Planet{
    String namePlanet="Earth";
    int order = 3;
    int hoursInDay=24;
    float accelerationOfGravity= 9.81f;

    public float accelerationOfGravityPlanet(float accelerationOfGravity){
        accelerationOfGravity=this.accelerationOfGravity;
        return accelerationOfGravity;
    }
    public void orderOfPlanet(int order){
        order=this.order;
        System.out.println("Order of "+namePlanet+" in Solar System is: "+order);
    }
    public void howManyEarthDays(int hoursInDay){
        hoursInDay=this.hoursInDay;
        System.out.println(hoursInDay/24 + " Earth days in one "+namePlanet + " day");
    }
}
