package com.company;

public class ArrayFindWhetherSorted {
    public static void main(String[] args) {
      boolean isSorted=true;
      int[]arr={1,2100,3,455,5,34,67};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[i+1]){
                                                                                                                                                                               isSorted=false;
                break;

            }

        }
        if(isSorted){
            System.out.println("the arry is sorted");
        }
        else {
            System.out.println("the arry is not sorted");
        }
    }

    }

