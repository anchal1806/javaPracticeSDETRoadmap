package com.practice.java;

public class stepsToBecomePalindrome {
    public static void main(String args[]){
       System.out.println("Steps required are   "+ stepsRequired(87));
        System.out.println("Steps required are   "+ stepsRequired(11));
        System.out.println("Steps required are   "+ stepsRequired(42));
        System.out.println("Steps required are   "+ stepsRequired(17));

    }
    public static long reverse(long number) {
        long reverse = 0;
        while(number!=0){
            reverse = reverse*10 + (number%10);
            number = number/10;
        }
        return reverse;
    }

    public static boolean isPalindrome(long number){
        if(reverse(number) == number){
            return true;
        }
        return false;
    }
    public static int stepsRequired(long number){
        int steps =0;
        long value =0;
        while(isPalindrome(number)!= true){
            value = number + reverse(number);
            number = value;
            steps++;
        }
        System.out.println("Palindrome number "+ number);
        return steps;
    }
}


