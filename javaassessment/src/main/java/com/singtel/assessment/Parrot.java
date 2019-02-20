package com.singtel.assessment;

public class Parrot extends FlyingBird implements ISoundmaker, IWalker, IFlyer{

    private Sound sound;

    public void setSound(Sound sound){
        this.sound = sound;
    }

    public String makeSound() {
        return sound.makeSound();
    }

    public void walk() {

    }
}
