package com.Activities.Activity2;

public class Activity2 {
    int sum=0;
    public static void main(String[] args) {
       int[] givenNumArray= { 10, 77, 10, 54, -11, 10};

       sumofvalue(givenNumArray);
    }


    public static void sumofvalue(int[] num)
    {
        int value=10;
        int addvalue = 0;
        int finalsum=30;

        for (int expectednum : num)
        {
            if (expectednum == value) 
                {
                    addvalue  = addvalue +expectednum;
                }
            if(addvalue==finalsum)
                {
                    System.out.println("the sum of all 10's in array :" + addvalue);
                    break;
                }
  }
    }
}
