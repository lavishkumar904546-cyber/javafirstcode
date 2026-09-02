package com.company;

public class MethodQuesion_1VarargsArguments {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;

        }
           return result;
    }

    static int sum(int a, int b) {
        return a + b;
    }
      public static void main(String[] args) {
          System.out.println("welcome to vararg");
          System.out.println("the sum of 4 and 5 " +sum (4,5));
          System.out.println("the sum of 6,7 and7 "  +sum(6,7,7));

      }

      }



















