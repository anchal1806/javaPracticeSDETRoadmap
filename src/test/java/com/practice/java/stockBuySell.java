package com.practice.java;

public class stockBuySell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        //int prices[]={7,6,4,3,1};
        int max= Integer.MIN_VALUE;
        for(int i =0; i<prices.length; i++){
            for( int j=i+1; j<prices.length; j++){
                 max= Math.max(max, prices[j]-prices[i]);
               //  System.out.println(prices[j]-prices[i]+"  "+max +" "+i+"  "+j);
            }
        }
        if(max<=0){
            System.out.println("There is no point in selling the stock so profit is  "+ 0);
        }
        else
        System.out.println("Max profit is   "+max);
    }

}
