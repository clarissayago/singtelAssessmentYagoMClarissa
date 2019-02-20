package com.singtel.assessment;

public class Chicken extends NonFlyingBird implements ISoundmaker {

    public String makeSound() {
        System.out.println("Cluck, cluck");
        return "Cluck, cluck";
    }
}
