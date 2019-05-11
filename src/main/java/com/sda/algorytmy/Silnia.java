package com.sda.algorytmy;

public class Silnia {
    public static int silnia(int n){

        System.out.println(n);

        if(n<2) {
            return 1;
        }
        return n* silnia(n-1);

    }

    public static void main(String[] args) {
        silnia( 3);


    }

}
