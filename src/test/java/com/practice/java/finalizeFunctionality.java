package com.practice.java;

public class finalizeFunctionality {

        public static void main(String[] args)
        {
            finalizeFunctionality obj = new finalizeFunctionality();
            // printing the hashcode
            System.out.println("Hashcode is: " + obj.hashCode());
            obj = null;
            // calling the garbage collector using gc()
            System.out.println("Hashcode is before gc: " + obj);
            System.gc();
          //  System.out.println("Hashcode is: " + obj);
           // System.out.println("End of the garbage collection");
           // finalize();
        }
        // defining the finalize method
        protected void finalize()
        {
            System.out.println("Called the finalize() method");
        }


}
