package com.company;
import java.util.Scanner;
public class ArithmeticOperator {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number=");
        var num1=input.nextInt();
        System.out.println("enter the  second number= ");
        var num2=input.nextInt();
        System.out.println(" the sum of two number");
        System.out.println(num1+num2);
        System.out.println("the difference of two number");
        System.out.println(num1-num2);
        System.out.println("the multiply two number");
        System.out.println(num1*num2);
        System.out.println("the division number");
        System.out.println(num1/num2);
        System.out.println("remainder of integer");
        System.out.println(num1%num2);




    }
    
}
