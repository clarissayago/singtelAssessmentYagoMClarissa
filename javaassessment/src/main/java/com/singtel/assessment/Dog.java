package com.singtel.assessment;

public class Dog extends Mammal implements ISoundmaker, IWalker, ISwimmer {

    public String makeSound() {
        System.out.println("Woof, woof");
        return "Woof, woof";
    }

    public void walk() {

    }

    public void swim() {

    }

}