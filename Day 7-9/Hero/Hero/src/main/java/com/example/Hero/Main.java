package com.example.Hero;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("not a perfect number");
        }
        int sum=0;
        for(int i=0;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("A perfect number");
        }
        if(sum!=n){
           System.out.println("not a perfect number"); 
        }
    }
}