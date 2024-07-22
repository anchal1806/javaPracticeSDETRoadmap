package com.practice.java;

public class BuyTwoChocolateNSaveMoeny {
    public static void main(String args[]){
        int []prices = {3,2,3};
        int money =3;
        System.out.println(buyChoco(prices,money));
    }

        public static int buyChoco(int[] prices, int money) {
        int flag =0;
            for(int i=0; i<prices.length; i++){
                for(int j = i+1; j<prices.length; j++){
                    if(money-(prices[i]+prices[j])>0)
                    {
                        System.out.println("i"+i);
                        System.out.println("j" +j);
                        if(flag ==1){
                            flag =0;
                        }
                        return money;
                    }
                    else if(money-(prices[i]+prices[j])<0){
                        flag = 1;
                    }

                }
            if(flag ==1){
                return money;
            }
            }
            return 0;
        }

}
