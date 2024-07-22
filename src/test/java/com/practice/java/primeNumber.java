package com.practice.java;

public class primeNumber {
    // number can either be divided by itself or 1
    public static void main(String[] args) {
        System.out.println("Number is  "+checkPrimeNumber(29)+" prime");

    }
   static boolean checkPrimeNumber(int number){
        int n =1;
        int counter=0;
        System.out.println("number is "+number);
        while(n< (number/2)){
           if(number%n ==0 && n!=1)
           {
               counter++;
               n++;
           }
           else{
               n++;
           }

        }
        if(counter>1){
            return false;
        }
       return true;
   }
}
