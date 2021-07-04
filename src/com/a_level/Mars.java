package com.a_level;

public class Mars implements Planet{
    String namePlanet="Mars";
    int order = 4;
    int hoursInDay=24;
    float accelerationOfGravity=3.86f;

    public float accelerationOfGravityPlanet(float accelerationOfGravity){
        accelerationOfGravity=this.accelerationOfGravity;
        return accelerationOfGravity;
    }
    public void orderOfPlanet(int order){
        order=this.order;
        System.out.println("Order of Mars in Solar System is: "+order);
    }
    public void howManyEarthDays(int hoursInDay){
        hoursInDay=this.hoursInDay;
        System.out.println(hoursInDay/24 + " Earth days in one "+namePlanet + " day");
    }
}
