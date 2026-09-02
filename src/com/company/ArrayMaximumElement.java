package com.company;

public class ArrayMaximumElement {
     public static void main(String[] args) {
         int[]arr={1,2,3,455,455,7};
         int max=0;
         for (int e:arr){
             if(e>max){
                 max=e;
             }
         }
         System.out.println("the value of maximum element in this array  " +max);

    }
}
