package com.Activities.Activity7;

public class MountainBike extends Bicycle {

public int seatHeight;

public MountainBike(int gears, int currentspeed, int seatHeight)
    {
        this.gears=gears;
        this.currentSpeed= currentspeed;
}
public void setHeight(int newValue)
{
    seatHeight= newValue;
}

}
