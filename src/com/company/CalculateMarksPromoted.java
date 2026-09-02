package com.company;

import java.util.Scanner;

public class CalculateMarksPromoted {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         byte m1,m2,m3;
         System.out.println("entrer the marks in physics");
         m1=sc.nextByte();
         System.out.println("enter the marks in mathe");
         m2= sc.nextByte();
         System.out.println("enter the marks in chemistry ");
         m3= sc.nextByte();
         float avg=(m1+m2+m3)/3.0f;
         System.out.println("avg persentage is :"+avg);
         if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
         System.out.println("congulation you are promoted");

         }
         else {
             System.out.println("sorry you have not promoted");
         }




    }
}
