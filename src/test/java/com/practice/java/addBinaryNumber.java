package com.practice.java;

public class addBinaryNumber {
    public static void main(String[] args){
        String number1 = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String number2 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
       // String number1 = "1010";
       // String number2 = "1011";

        System.out.println("Added Binary :  " + addBinary(number1, number2));
    }
    private static String addBinary(String number1, String number2){
        StringBuilder num1 = new StringBuilder(number1);
        StringBuilder num2 = new StringBuilder(number2);

        int len = 0;
        if(num1.length() > num2.length()) {
            len = num1.length();
            int i =num1.length() - num2.length();
            while(i!=0){
              num2.insert(0, '0');
              i--;
            }
        }
        else if (num1.length() < num2.length()) {
            len = num2.length();
            int i =num2.length() - num1.length();
            while(i!=0) {
                num1.insert(0, '0');
                i--;
            }
        }
        if(num1.length() == num2.length()){
            len = num1.length();
        }
        System.out.println("num1 and num2 "+num1+ "        "   +num2);
        int carry = 0;
        StringBuilder sum =new StringBuilder(len+1) ;
        for(int i=len-1; i>0; i--){
            System.out.println("inside loop "+ num1.charAt(i) +"  " + num2.charAt(i)+"    iteration    "+i);
            if(num1.charAt(i) =='1' && num2.charAt(i)=='1' && carry == 1){
                sum.insert(0,'1');
                carry = 1;
            }
            else if((num1.charAt(i)=='1' && num2.charAt(i)=='0'&& carry == 1)||(num1.charAt(i)=='0' && num2.charAt(i)=='1' && carry == 1)){
                  sum.insert(0,'0');
                  carry= 1; 
            }
            else if(num1.charAt(i) =='0' && num1.charAt(i)=='0' && carry == 1){
                sum.insert(0,'1');
                carry = 0;
            }
            else if((num1.charAt(i)=='1' && num2.charAt(i)=='0'&& carry == 0)||(num1.charAt(i)=='0' && num2.charAt(i)=='1' && carry == 0)){
                sum.insert(0,'1');
                carry= 0;
            }
            else if(num1.charAt(i) =='1' && num1.charAt(i)=='1' && carry == 0){
                sum.insert(0,'0');
                carry = 1;
            }

            else if(num1.charAt(i) =='0' && num1.charAt(i)=='0' && carry == 0){
                sum.insert(0,'0');
                carry = 0;
            }
            System.out.println("inside loop sum is "+ sum +"    iteration    "+i);

        }


        if(num1.charAt(0) =='1' && num2.charAt(0)=='1' && carry == 1){
            sum.insert(0,'1');
            sum.insert(0,'1');
        }
        else if((num1.charAt(0) =='1' && num2.charAt(0)=='0' && carry == 1)||num1.charAt(0) =='0' && num2.charAt(0)=='1' && carry == 1){
            sum.insert(0,'0');
            sum.insert(0,'1');
        }
        else if((num1.charAt(0) =='0' && num1.charAt(0)=='0' && carry == 1)||num1.charAt(0) =='0' && num1.charAt(0)=='0' && carry == 1){
            sum.insert(0,'1');
        }
        else if((num1.charAt(0) =='1' && num2.charAt(0)=='0' && carry == 0)||num1.charAt(0) =='0' && num2.charAt(0)=='1' && carry == 0){
            sum.insert(0,'1');
        }
        else if(num1.charAt(0) =='0' && num2.charAt(0)=='0' && carry == 0){
            sum.insert(0,'0');
        }
        else if(num1.charAt(0) =='1' && num2.charAt(0)=='1' && carry == 0){
            sum.insert(0,'0');
            sum.insert(0,'1');
        }
      //  System.out.println("hey am I the final answer "  +sum.toString());

        return sum.toString();
    }
}
