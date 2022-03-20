package com.basicsinjava;

public class Main {
    public static void calcFact(int n, int i, int product){
        if(i==n){
            product*=n;
            System.out.println(product);
            return;
        }
        product*=i;
        calcFact(n, i+1, product);
    }

    public static void main(String args[]){
        int n=5;
        calcFact(n, 1, 1);
    }    
}
