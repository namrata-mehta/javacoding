package com.javaprograms_basics;

public class nestedif {
    public static void main(String[] args) {
        int age = 25;
        if(age > 0) {
            if(age > 18) {
                System.out.println("you can drive");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
}