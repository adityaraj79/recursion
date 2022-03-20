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
        int xpownm1 = calcPow(x, n-1);
        int xpown = x*xpownm1;
        return xpown;
    }

    public static void main(String args[]){
        int x=4;
        int n=6;
        int ans = calcPow(x, n);
        System.out.println(ans);
    }    
}
