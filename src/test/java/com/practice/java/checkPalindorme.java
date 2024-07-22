package com.practice.java;

public class checkPalindorme {
    public static void main(String[] args) {
       System.out.println("word palindrome   "+ isStringPalindrome("madam"));
        System.out.println("number palindrome  "+  isNumberPalindrome(121));
    }
    static boolean isStringPalindrome(String str){
        StringBuffer sb = new StringBuffer();
       for(int j =str.length()-1; j>=0; j--){
           sb.append(str.charAt(j));
       }
       System.out.println("sb *"+sb.toString());
       if(sb.toString().equals(str)){
           return true;
       }
       else{
           return false;
       }
    }
    static boolean isNumberPalindrome(int num){
        int num1 =0;
        int num2 = num;
        while(num!=0){
            num1 = (num1*10) + (num % 10);
            num = num / 10;
        }
        System.out.println("num2   * "+num1);

        if(num2 == num1){
            return true;
        }else{
            return false;
        }

    }
}
