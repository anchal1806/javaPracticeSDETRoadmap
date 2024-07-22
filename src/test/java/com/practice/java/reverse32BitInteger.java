package com.practice.java;

public class reverse32BitInteger {
    public static void main(String args[]){
        int arr[] = {123, -123, 120,1534236469};
        int ans[] = {321,-321,21,0};
          for(int i =0; i<arr.length;i++){
              System.out.println(reverseFunction(arr[i]));

          }
    }
    private static int reverseFunction(int value){
        long result  =0;
        int flag =0;
        if(value<0){
            flag =1;
            value = value *(-1);
        }
        while(value>0){
            result = result*10 +( value%10);
            value = value/10;
        }
        if(flag ==1){
            result = result *(-1);
        }
        if(result <Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
        return (int)result;
    }

}
