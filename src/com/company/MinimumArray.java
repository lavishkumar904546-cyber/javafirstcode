package com.company;

public class MinimumArray {

    public static int Min(int[] arr) {
        int min_num = arr[0];

        int i = 1;
        while (i < arr.length) {
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
            i++;
        }

        return min_num;
    }

    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 5, 30, 18};

        int minNumber = Min(arr);
        System.out.println("Minimum number of array: " + minNumber);
    }
}