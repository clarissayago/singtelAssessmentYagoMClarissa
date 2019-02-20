package com.singtel.assessment;

import com.singtel.assessment.*;
import org.junit.*;
import org.junit.Assert;

public class SolutionTest {

    @Test
    public void testChickenSound(){
        ISoundmaker iSoundMaker = new Chicken();
        Assert.assertEquals("Cluck, cluck", iSoundMaker.makeSound());
    }

    @Test
    public void testDuckSound(){
        ISoundmaker iSoundMaker = new Duck();
        Assert.assertEquals("Quack, quack", iSoundMaker.makeSound());
    }

    @Test
    public void testRoosterSound(){
        Rooster rooster = new Rooster();
        Assert.assertEquals("Cock-a-doodle-doo", rooster.makeSound());
    }

    @Test
    public void testParrotSoundAlongWithDog(){
        ISoundmaker iSoundMaker = new Parrot();
        ((Parrot) iSoundMaker).setSound(new Sound(new Dog()));
        Assert.assertEquals("Woof, woof", iSoundMaker.makeSound());
    }

    @Test
    public void testParrotSoundAlongWithCat(){
        ISoundmaker iSoundMaker = new Parrot();
        ((Parrot) iSoundMaker).setSound(new Sound(new Cat()));
        Assert.assertEquals("Meow", iSoundMaker.makeSound());
    }


    @Test
    public void testParrotSoundAlongWithDuck(){
        ISoundmaker iSoundMaker = new Parrot();
        ((Parrot) iSoundMaker).setSound(new Sound(new Duck()));
        Assert.assertEquals("Quack, quack", iSoundMaker.makeSound());
    }

    @Test
    public void testParrotSoundAlongWithRandomSound(){
        ISoundmaker iSoundMaker = new Parrot();
        ((Parrot) iSoundMaker).setSound(new Sound("Ring, ring"));
        Assert.assertEquals("Ring, ring", iSoundMaker.makeSound());
    }

    @Test
    public void testCounterForWalkingAnimals(){
        AnimalCounter animalCounter = new AnimalCounter();

        Assert.assertEquals(7, animalCounter.countAllWalkingAnimals());
    }

    @Test
    public void testCounterForFlyingAnimals(){
        AnimalCounter animalCounter = new AnimalCounter();

        Assert.assertEquals(2, animalCounter.countAllFlyingAnimals());
    }

    @Test
    public void testCounterForSingingAnimals(){
        AnimalCounter animalCounter = new AnimalCounter();

        Assert.assertEquals(3, animalCounter.countAllSingingAnimals());
    }

    @Test
    public void testCounterForSwimmingAnimals(){
        AnimalCounter animalCounter = new AnimalCounter();

        Assert.assertEquals(7, animalCounter.countAllSwimmingAnimals());
    }


}
