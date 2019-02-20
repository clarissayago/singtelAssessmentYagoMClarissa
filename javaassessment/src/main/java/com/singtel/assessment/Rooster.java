package com.singtel.assessment;

public class Rooster extends Animal{

    private Chicken chicken;

    public String makeSound(){
        chicken = new Chicken(){
            @Override
            public String makeSound() {
                System.out.println("Cock-a-doodle-doo");
                return "Cock-a-doodle-doo";
            }
        };
        return chicken.makeSound();
    }
}
