package com.basicsinjava;
import java.util.*;

public class Main {
    public static int calcPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPow(x, n/2)*calcPow(x, n/2);
        }else{
            return calcPow(x, n/2)*calcPow(x, n/2)*x;
        }
    }

    public static void main(String args[]){
        int x=4;
        int n=6;
        int ans = calcPow(x, n);
        System.out.println(ans);
    }    
}
