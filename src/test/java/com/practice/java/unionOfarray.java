package com.practice.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class unionOfarray {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int arr2[] = {1,2,3,6,7};
       HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int j =0; j<arr2.length; j++){
            hs.add(arr2[j]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
             arrayList.addAll(hs);
        for(int i =0; i< arrayList.size(); i++){
            System.out.print("  "+arrayList.get(i));
        }


     /*   Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            arrayList.add(it.next());
        }*/



    }
}
