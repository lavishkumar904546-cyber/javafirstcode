package com.company;


class MethodQuestion2Pattern {

    static void MethodQuestion2Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MethodQuestion2Pattern(4);
    }
}