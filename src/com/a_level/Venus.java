package com.a_level;

public class Venus implements Planet{
    String namePlanet="Venus";
    int order = 2;
    int hoursInDay=5832;
    float accelerationOfGravity=8.88f;

    public float accelerationOfGravityPlanet(float accelerationOfGravity){
        accelerationOfGravity=this.accelerationOfGravity;
        return accelerationOfGravity;
    }
    public void orderOfPlanet(int order){
        order=this.order;
        System.out.println("Order of Venus in Solar System is: "+order);
    }
    public void howManyEarthDays(int hoursInDay){
        hoursInDay=this.hoursInDay;
        System.out.println(hoursInDay/24 + " Earth days in one "+namePlanet + " day");
    }
}
