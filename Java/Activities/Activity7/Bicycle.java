package com.Activities.Activity7;

class Bicycle implements BicycleOperations,BicycleParts {

    public int gears;
    public int currentSpeed;
  
    public Bicycle( int gears, int currentspeed)
    {
       this.currentSpeed=currentspeed;
       this.gears =gears;
    }

    public void applybrake(int decrement)
    {
            currentSpeed= currentSpeed- decrement;
    }
    public void speedup(int increment)
    {
            currentSpeed= currentSpeed+increment;
    }
  
   public void bicycleDesc()
   {
    System.out.println("No of Gears : "+gears +" The currentSpeed of the bicycle is :" +currentSpeed);
   }

}
