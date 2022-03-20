package com.basicsinjava;

public class Main {
    public static void printSum(int n, int i, int sum){
        if(i==n){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(n, i+1, sum);
        System.out.println(i);
    }

    public static void main(String args[]){
        int n=3;
        printSum(n, 1, 0);
    }    
}
