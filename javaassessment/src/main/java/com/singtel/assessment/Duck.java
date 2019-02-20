package com.singtel.assessment;

public class Duck extends NonFlyingBird implements ISwimmer, ISoundmaker{


    public String makeSound() {
        System.out.println("Quack, quack");
        return "Quack, quack";
    }

    public void swim() {

    }
}