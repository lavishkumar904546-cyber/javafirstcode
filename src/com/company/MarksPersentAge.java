package com.company;
import java.util.Scanner;
public class MarksPersentAge {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your physice marks=");
        int physice= sc.nextInt();
        System.out.println("your math marks=");
        int math= sc.nextInt();
        System.out.println("your chemistry marks=");
        int chemistry= sc.nextInt();
        System.out.println("your english marks=");
        int english= sc.nextInt();
        System.out.println("your hindi marks=");
        int hindi= sc.nextInt();
        int total=physice+math+chemistry+english+hindi;
        double percentage=(total/500.0)*100;
        System.out.println("total marks="  +total);
        System.out.println("total student percentage="  +percentage);




    }
}
