package com.company;

public class ArrayChapterQusion_2WhetherIntegerPresentArray {
     public static void main(String[] args) {
         float[]marks={45.7f,67.8f,63.4f,99.2f,100.0f};
         float num=0f;
         boolean isInArray=false;
         for (float element:marks){
             if (num==element);
             isInArray=true;
             break;

         }
        if(isInArray){
            System.out.println("the value is parsent in array int he array");;
        }
        else {
            System.out.println("the value is  not parsent in array int he array");
        }
    }
}
