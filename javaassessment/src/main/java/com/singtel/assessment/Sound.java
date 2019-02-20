package com.singtel.assessment;

public class Sound {

    private ISoundmaker soundMaker;

    private String sound;

    public Sound(ISoundmaker soundMaker) {
        this.soundMaker = soundMaker;
    }

    public Sound(String sound) {
        this.sound = sound;
    }

    public String makeSound() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (soundMaker != null && sound == null){
                stringBuffer.append(soundMaker.makeSound());
            } else if(soundMaker == null && sound != null){
                System.out.println(sound);
                stringBuffer.append(sound);
            } else {
                System.out.println("No Sound");
                stringBuffer.append("sound");
            }
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
