package com.practice.java;

public class exceptionChaining {

    public static void main(String args[]){
        try{
        String s = null;
        System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("THink about the null");}
       try{
       int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 7, 9, 10};
       arr[11] = 20;
        System.out.println(arr.length);


        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("think about the size");
        }
    }


}
