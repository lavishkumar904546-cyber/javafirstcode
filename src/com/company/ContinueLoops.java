package com.company;

public class ContinueLoops {
     public static void main(String[] args) {
         for (int i = 0; i <= 50; i++) {
             if (i == 2) {
                 System.out.println("ending loops");
                 continue;

             }
             System.out.println(i);
             System.out.println("java is great");

         }

    }
}
