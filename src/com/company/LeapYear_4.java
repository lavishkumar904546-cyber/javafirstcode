package com.company;

import java.util.Scanner;

public class LeapYear_4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the year: ");
            int year = input.nextInt();

            if ((year%4==0 && year!=100) || year%400==0){
                System.out.println("Leap year");
            }
            else {
                System.out.println("Not leap Year");
            }
        }

    }






