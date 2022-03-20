package com.basicsinjava;
import java.util.*;

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
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
        }else{
            calcFact(n, 1, 1);
        }
    }    
}
