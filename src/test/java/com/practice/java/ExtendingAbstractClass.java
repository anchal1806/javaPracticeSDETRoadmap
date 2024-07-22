package com.practice.java;

public class ExtendingAbstractClass extends AbstractClass implements LearnInterface {
    @Override
    void running() {
      System.out.println("running after extension");
    }
    @Override
    public int learningIsFun() {
        System.out.println("I was joking");
        return 0;
    }
    public static void main(String args[]){
        ExtendingAbstractClass eab = new ExtendingAbstractClass();
        eab.run();
        eab.running();
        eab.learningIsFun();
        eab.learningInterface();
        LearnInterface.learntNewThings();


        AbstractClass ac = new AbstractClass() {
            @Override
            void running() {
                System.out.println("There you are overriden in object of abstract class");
            }
        };
      //  ac.run();
        ac.running();

    }


}
