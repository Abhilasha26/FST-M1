package com.Activities.Activity12;

public class Activity12 {

    public static void main(String[] args)  
    {
        //Without body
        Addable ad1= (num1,num2) ->(num1+num2);
        System.out.println("Sum of value without Body : " + ad1.add(20, 30));
       
        //With Body and return
        Addable ad2 = (int num1, int num2) -> 
        { return (num1+ num2);};
       
        System.out.println("Sum of value with Body : " +ad2.add(100, 200));
       
       
    }

}
