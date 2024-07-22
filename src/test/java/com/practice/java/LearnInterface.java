package com.practice.java;

public interface LearnInterface {
    int value =0;
    default void learningInterface(){
        System.out.println("I am in interface but I am default function of learning Interface");
    }
    static void learntNewThings(){
        System.out.println("I am in interface but I am static of learntNewThings Interface");

    }
    int learningIsFun();
}
