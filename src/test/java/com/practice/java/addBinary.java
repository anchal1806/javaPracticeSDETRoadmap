package com.practice.java;

import java.util.Arrays;

public class addBinary {
    public static void main(String args[]) {
        String a = "1111";
        String b = "1111";
        System.out.println(convertToBinary(a,b));
    }

    private static String convertToBinary(String a, String b) {
        int x = conversion(a);
        int y = conversion(b);
        int add = x+y;
        System.out.println("Add is :"+add);
        String result = conversionToBinary(add);
        return result;
    }
    private static int conversion(String alpha){
        double number =0;
        int count = alpha.length()-1;
       for(int i=0; i <=alpha.length()-1;i++){
           if(alpha.charAt(i)=='1'){
               number = number + Math.pow(2, count);
           }
           else
           { number = number + 0*Math.pow(2, count);}
           count--;
       }
       System.out.println("number is: " +(int)number);
        return (int) number;
    }

    private static String conversionToBinary(int beta){
        int number[] = new int[35];
        int i =0;
          while(beta > 0){
           number[i++] = beta % 2;
           beta = beta/2;
          }
        StringBuilder sb = new StringBuilder(i);

        for(int j=i-1; j>=0; j--){
            sb.append(number[j]);
          }
        return sb.toString();
    }


}
