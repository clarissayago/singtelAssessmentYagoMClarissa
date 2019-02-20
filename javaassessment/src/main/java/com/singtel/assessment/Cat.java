package com.singtel.assessment;

public class Cat extends Mammal implements IWalker, ISoundmaker {

    public void walk() {

    }

    public String makeSound() {
        System.out.println("Meow");
        return "Meow";
    }
}