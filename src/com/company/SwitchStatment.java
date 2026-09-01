package com.company;

import java.util.Scanner;

public class SwitchStatment {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int age;
         System.out.println("enter the age");
         age= sc.nextInt();
         switch (age){
             case 18:
                 System.out.println("you are going to adult!");
                 break;
             case 23:
                 System.out.println("you are going to get join job");
                 break;
             case 60:
                 System.out.println("you are going to getr retired");
                 break;
             default:
                 System.out.println("enjoy your life");

         }
         System.out.println(age);

    }
}
