package com.practice.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class undestandSet {
    public static void main(String args[]){
        Set<Integer> set = new HashSet<Integer>();

        set.add(9);
        set.add(4);
        set.add(3);
        set.add(10);
        set.add(1);
        set.add(0);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println("please do it anchal "+it.next());
        }
    }
}
