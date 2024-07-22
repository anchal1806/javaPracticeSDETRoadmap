package com.practice.java;

import java.util.ArrayList;
import java.util.Iterator;

public class unionOfArrayBruteForcce {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int arr2[] = {1,2,3,6,7};
        ArrayList<Integer> arrlist = new ArrayList<>();
        int i=0, j=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arrlist.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arrlist.add(arr2[j]);
                j++;
            }
            else if(arr1[i]==arr2[j]){
                arrlist.add(arr1[i]);
                i++;
                j++;
            }
          //  System.out.println(i+"  "+j);
        }
        while(i==arr1.length && j<arr2.length){
            arrlist.add(arr2[j]);
            j++;
        }
        while(j==arr2.length && i< arr1.length){
            arrlist.add(arr1[i]);
            i++;
        }
        Iterator<Integer> it = arrlist.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
    }

}
