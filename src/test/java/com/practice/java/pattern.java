package com.practice.java;

public class pattern {
    public static void main(String[] args) {
      /*  *******
         *****
          ***
          *
           *
*/
        int rows =4;
    for(int i = rows; i>0; i--){
        for(int j = 0; j< rows-i;j++) {
            System.out.print(" ");
        }
            for(int k=1; k<=2*i-1;k++){
                System.out.print("*");
            }

        System.out.println("");
    }
    }
}
