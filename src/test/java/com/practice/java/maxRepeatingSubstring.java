package com.practice.java;

public class maxRepeatingSubstring {
    public static void main(String args[]) {
      /*  maxRepeating("ababc","ab");
        maxRepeating("ababc", "ac");
        maxRepeating("ababc","ba");
        maxRepeating("b","b");*/
        maxRepeating("aaaba aaaba aaba aaaba aaabaa aab aaaaba","aaaba");
    }

        public static int maxRepeating (String sequence, String word){
            int count = 0;
            int len = word.length();
            String a = "";
            int i=0;
            while (i <= sequence.length()-1) {

                a = sequence.substring(i,i+len);
                System.out.println("substring  "+a);
                if(a.equals(word)){
                    System.out.println("indexes "+ i);
                    count++;
                     i++;
                    if(i>=sequence.length()-len){
                        break;
                    }
                }
                if(i>=sequence.length()-len){
                    break;
                }
                i++;
            }
            System.out.println("total substtrings are "+count);
        return count;
        }
}
