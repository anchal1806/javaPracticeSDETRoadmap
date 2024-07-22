package com.practice.java;

public class reverse32BitIntegerBetterSolution {
    public static void main(String args[]){
    int arr[] = {123, -123, 120,1534236469};
    int ans[] = {321,-321,21,0};
    for(int i =0; i<arr.length;i++){
        System.out.println(reverseFunction(arr[i]));

    }
}
    private static int reverseFunction(int value) {
      int result =0;
      int lastDigit =0;
      while(value!=0){
          lastDigit = value%10;
          if(value > Integer.MAX_VALUE/10 || value == Integer.MAX_VALUE/10 && lastDigit >7){
              return 0;
          }
          if(value < Integer.MIN_VALUE/10 || value == Integer.MAX_VALUE/10 && lastDigit < -8){
              return 0;
          }
          result = result*10 + lastDigit;
          value = value/10;
      }
      return result;
    }
}
