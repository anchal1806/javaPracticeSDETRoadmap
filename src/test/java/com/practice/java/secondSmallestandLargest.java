package com.practice.java;

public class secondSmallestandLargest {
    public static void main(String[] args) {
     /*   int arr[] ={11,2,5,17,4,3,20};
        int min = arr[0];
        int max = arr[0];
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=1; i< arr.length; i++){
          min =  Math.min(min, arr[i]);
          max= Math.max(max, arr[i]);
                 }
        for(int i =0; i< arr.length;i++){
            if(arr[i]<secondMin && arr[i]!=min){
                secondMin = arr[i];
            }
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }

        System.out.println("minium value is "+min +" Max vlaue is "+max);
        System.out.println("Second minium value is "+secondMin +" Second Max vlaue is "+secondMax);
*/

        /*Second optimal approach*/
        int arr[] ={11,2,5,17,4,3,20};
        int min = 2;
        int max = 11;
        int secondMin = 11;
        int secondMax = 2;

        for(int i =2; i< arr.length;i++){
            if(min>arr[i]){
                secondMin = min;
                min = arr[i];

            }
            else if(arr[i]<secondMin && min<arr[i]){
                secondMin = arr[i];
            }

            if(max<arr[i]){
                secondMax =max;
                max = arr[i];
             //   System.out.println("max "+max);
            }
            else if(arr[i]>secondMax && max>arr[i]){
                secondMax = arr[i];
             //  System.out.println("2nd max "+secondMax);
            }
            }

        System.out.println("minium value is "+min +" Max vlaue is "+max);
        System.out.println("Second minium value is "+secondMin +" Second Max vlaue is "+secondMax);

    }
}
