package com.practice.java;

import java.util.*;

/*
* Iterators
* */

public class collectionsBasics {
    public static void main(String args[]) {
        implementArrayList();
        implementStack();
        hashSetImplementation();
        implementHashMap();
        implementEntryWithHashMap();
        implementWithObject();

    }

    public static ArrayList implementArrayList() {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(22);
        for (int i = 1; i < 10; i++) {
            ar.add(ar.get(i - 1) + 1);
        }
        Iterator<Integer> it = ar.iterator();
        while(it.hasNext()){
            System.out.print(" " +it.next());
        }
        return ar;
    }

    public static Stack implementStack() {
        Stack<String> st = new Stack<>();
        st.push("anchal");
        st.push("rahul");
        st.push("shweatank");
        st.push("keerti");
        st.push("prashant");

        Iterator<String> it = st.iterator();
        System.out.println(" ");
        while(it.hasNext()){
            System.out.print(" " +it.next());
        }
        System.out.println("Stack size "+ st.size());
        Iterator<String> it1 = st.iterator();
        while(it1.hasNext()){
            System.out.print(" " +st.pop());
        }
        System.out.println("Stack size after pop"+ st.size());
        return st;
    }

    public static HashSet hashSetImplementation(){
        HashSet<Character> hs = new HashSet<>();
        char[] arr  = {'l','o','v','e'};
        hs.add('g');
        hs.add('o');
        hs.add('l');
        hs.add('u');
        hs.add('m');
        System.out.println(" ");
        Iterator<Character> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        return hs;
    }

    static HashMap implementHashMap(){
        HashMap<String, Integer> hm  = new HashMap<>();
        hm.put("Anchal",1);
        hm.put("Rahul",2);
        hm.put("Kirti",3);
        hm.put("Prashant",4);
        hm.put("Shweatank",5);
        hm.put(null,9);
        hm.put("Anchal",5);
        hm.put("date",null);
        hm.put("random",null);
        System.out.println(" ");

        Iterator<String> it = hm.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.print(key+ "**"+hm.get(key));
        }

        System.out.println("printed using entrySet "+hm.entrySet());
        return hm;
    }

    static HashMap implementEntryWithHashMap(){
        HashMap<Integer,Character> hm = new HashMap<>();
        hm.put(10, 'L');
        hm.put(12,'O');
        hm.put(14,'V');
        hm.put(16,'E');
        for(Map.Entry<Integer, Character> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        Iterator<Map.Entry<Integer,Character>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Character> entry = it.next();
            System.out.println("Whole entrySet implementation "+entry.getKey() +" "+ entry.getValue());
        }
        return hm;
    }

    static HashMap implementWithObject(){
        HashMap<Integer, Employee> hm = new HashMap<>();
        Employee e = new Employee(39,"Anchal","galgotias");
        Employee e1 = new Employee(30,"Ross","galgotias C");
        Employee e2 = new Employee(31,"Rachel","galgotias Degre ");
        Employee e3 = new Employee(19,"Monica","galgotias mEdical");

        hm.put(1, e1);
        hm.put(2, e2);
        hm.put(2,e3);
        hm.put(4,e);

        for(Map.Entry<Integer, Employee>entry : hm.entrySet()){

            System.out.println(entry.getKey()+" "+entry.getValue().id +" "+entry.getValue().college+" "+entry.getValue().name);
        }

        return hm;
    }


}

