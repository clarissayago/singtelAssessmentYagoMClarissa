package com.singtel.assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalCounter {

    private List<Animal> animalList = new ArrayList<Animal>();

    private Animal animal;

    private int walkingAnimalCounter = 0;
    private int flyingAnimalCounter = 0;
    private int singingAnimalCounter = 0;
    private int swmmwingAnimalCounter = 0;

    public AnimalCounter() {
        process();
    }

    private void initializeObject(){
        animalList.add(new Bird());
        animalList.add(new Duck());
        animalList.add(new Chicken());
        animalList.add(new Rooster());
        animalList.add(new Parrot());
        animalList.add(new Fish());
        animalList.add(new Shark());
        animalList.add(new ClownFish());
        animalList.add(new Dolphin());
        animalList.add(new Frog());
        animalList.add(new Dog());
        animalList.add(new ButterFly());
        animalList.add(new Cat());
    }

    private void process(){
        initializeObject();
    }

    public int countAllWalkingAnimals(){
        Iterator<Animal> animalIterator = animalList.listIterator();
        while (animalIterator.hasNext()){
            animal = (Animal) animalIterator.next();
            if (animal instanceof IWalker){
                walkingAnimalCounter++;
            }
        }
        System.out.println("Walking Animals: "+ walkingAnimalCounter);
        return walkingAnimalCounter;
    }

    public int countAllFlyingAnimals(){
        Iterator<Animal> animalIterator = animalList.listIterator();
        while (animalIterator.hasNext()){
            animal = (Animal) animalIterator.next();
            if (animal instanceof IFlyer){
                flyingAnimalCounter++;
            }
        }
        System.out.println("Flying Animals: "+ flyingAnimalCounter);
        return flyingAnimalCounter;
    }

    public int countAllSingingAnimals(){
        Iterator<Animal> animalIterator = animalList.listIterator();
        while (animalIterator.hasNext()){
            animal = (Animal) animalIterator.next();
            if (animal instanceof ISinger){
                singingAnimalCounter++;
            }
        }
        System.out.println("Singing Animals: "+ singingAnimalCounter);
        return singingAnimalCounter;
    }

    public int countAllSwimmingAnimals(){
        Iterator<Animal> animalIterator = animalList.listIterator();
        while (animalIterator.hasNext()){
            animal = (Animal) animalIterator.next();
            if (animal instanceof ISwimmer){
                swmmwingAnimalCounter++;
            }
        }
        System.out.println("Swimming Animals: "+ swmmwingAnimalCounter);
        return swmmwingAnimalCounter;
    }

}