package com.basicsinjava;
import java.util.*;

public class Main {
    public static int calcFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact_nm1 = calcFact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans=calcFact(n);
        System.out.println(ans);
    }    
}
