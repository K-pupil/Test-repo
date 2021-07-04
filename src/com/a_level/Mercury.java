package com.a_level;

public class Mercury implements Planet{
    String namePlanet="Mercury";
    int order = 1;
    int hoursInDay=1407;
    float accelerationOfGravity=3.70f;

    public float accelerationOfGravityPlanet(float accelerationOfGravity){
        accelerationOfGravity=this.accelerationOfGravity;
        return accelerationOfGravity;
    }
    public void orderOfPlanet(int order){
        order=this.order;
        System.out.println("Order of Mercury in Solar System is: "+order);
    }
    public void howManyEarthDays(int hoursInDay){
        hoursInDay=this.hoursInDay;
        System.out.println(hoursInDay/24 + " Earth days in one "+namePlanet + " day");
    }
}
