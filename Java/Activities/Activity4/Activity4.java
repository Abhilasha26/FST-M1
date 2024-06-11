package com.Activities.Activity4;

import java.util.Arrays;

public class Activity4 {

    static void insertationSort(int[] data ) 
    {
        int aaraysize = data.length;
        System.out.println("Length of an Array : "+ aaraysize);
        int i, j,temp;

      for (i=0;i<aaraysize-1 ;i++)
      {
        for (j=i+1;j<aaraysize-1; j++)
        {
           if (data[i]> data[j])
           {
                temp=data[i];
                data[i]=data[j];
                data[j]=temp;           
           }     
        }
      } 
    }

    public static void main(String[] args) {
        
        int[] dataArray = {4,2,1,6,4,7,2,4,3};
        System.out.println("Before Sorting an Array: "+ Arrays.toString(dataArray));
        insertationSort(dataArray);
        System.out.println("After sorting Array :" + Arrays.toString(dataArray));

     
    }

}
