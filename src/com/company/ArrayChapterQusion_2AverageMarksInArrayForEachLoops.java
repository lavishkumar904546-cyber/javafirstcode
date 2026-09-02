package com.company;

public class ArrayChapterQusion_2AverageMarksInArrayForEachLoops {
     public static void main(String[] args) {
         int[]marks={45,50,55,60,65};
         int sum=0;
         for (int element :marks){
             sum=sum+element;

         }
         System.out.println("the value of average marks is "+sum/ marks.length);

    }
}
