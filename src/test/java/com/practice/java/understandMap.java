package com.practice.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class understandMap {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Anchal");
        map.put(2, "Rahul");
        map.put(3, "Rohit");
        map.put(4, "ROmil");
        map.put(5, "Roshini");
        map.put(6, "Sunshine");

        map.entrySet().stream().forEach(entry-> {
            System.out.println(entry.getKey() + "" + entry.getValue());
        });


      for(Map.Entry<Integer, String> entry1 :map.entrySet()){
          System.out.println(entry1.getKey()+"value"+entry1.getValue());
      }

      Iterator it = map.entrySet().iterator();
      while(it.hasNext()){
          System.out.println(it.next()+" ****"+ map.get(it.next()));
      }













        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" *** "+ entry.getValue()));

        for(Integer key : map.keySet()){
            System.out.println("hoorah  "+key+ "   "+map.get(key));

        }

for(Map.Entry<Integer, String> entry : map.entrySet() ){
   System.out.println( " hey "+entry.getKey()+" "+entry.getValue());

}
        Iterator it1 = map.entrySet().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


    }

}
