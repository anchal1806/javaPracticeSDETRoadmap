package com.practice.java;

public class findSquareRoot {
    public static void main(String args[]){
        int num =25;
        System.out.println("Find sqrt  "+sqrt(num));
    }
     private static int sqrt(int num){
        if(num ==0 || num ==1){
            return num;
        }
        double t;
        double sqrt = num/2;
        do{
            t=sqrt;
            sqrt= (t+(num/t))/2;
        }while((t-sqrt)!=0);
        return (int)sqrt;
     }
}
