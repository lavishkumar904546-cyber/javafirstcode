package com.company;

public class ArrayChapterQusion_1CalculateTheirSum {
     public static void main(String[] args) {
         float[]marks={15.5f,67.8f,63.4f,99.2f,100.0f};
         float sum=0;
         for (float element:marks) {
             sum=sum+element;


         }
         System.out.println("the value of sum is  " +sum);

    }
}
