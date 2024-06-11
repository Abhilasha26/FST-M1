package com.Activities.Activity3;

public class Activity3 {

    public static void main(String[] args) {
        
        double Seconds=1000000000;
        double EarthSecond=31557600 ;
        double MercuryEarthYear=0.2408467 ;
        double VenusEarthYear =0.61519726;
        double MarsEarthYear=1.8808158;
        double JupiterEarthYear=11.862615;
        double SaturnEarthYear =29.447498;
        double UranusEarthYear=84.016846;
        double NeptuneEarthYear=164.79132;

        System.out.println("Age of Mercury :"+ Seconds/EarthSecond/MercuryEarthYear +" Earth year old" );
        System.out.println("Age of Venus:"+ Seconds/EarthSecond/VenusEarthYear +" Earth year old" );
        System.out.println("Age of Mars :"+ Seconds/EarthSecond/MarsEarthYear +" Earth year old" );
        System.out.println("Age of Jupiter :"+ Seconds/EarthSecond/JupiterEarthYear +" Earth year old" );
        System.out.println("Age of Saturn :"+ Seconds/EarthSecond/SaturnEarthYear +" Earth year old" );
        System.out.println("Age of Unanus :"+ Seconds/EarthSecond/UranusEarthYear +" Earth year old" );
        System.out.println("Age of Neptune :"+ Seconds/EarthSecond/NeptuneEarthYear +" Earth year old" );

    }

}
