package com.singtel.assessment;

public class Frog extends SwimmingAnimal implements IWalker, ISoundmaker, ISwimmer {

    public void walk() {

    }

    public String makeSound() {
        System.out.println("Ribit, ribit");
        return "Ribbit, ribbit";
    }

    public void swim() {

    }
}