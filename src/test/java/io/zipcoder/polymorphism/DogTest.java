package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testDogSpeak() {

        //Given
        Pet dog = new Pet("Bugs");

        //When
        String talkingPets = dog.speak();

        //Then
        Assert.assertEquals("Bark", talkingPets);
    }

    @Test
    public void testDogGetName() {
        //Given
        String expectedName = "Bunny";
        Pet dog = new Pet(expectedName);

        //Then
        String actualName = dog.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogSetName() {
        //Given
        Pet dog = new Pet("Roger");
        String newName = "Frog";

        //When
        dog.setName(newName);

        //Then
        Assert.assertEquals(newName, dog.getName());


    }

    @Test
    public void testCatIsAPet(){
        //Given
        String name = "Carm";

        //When
        Dog dog = new Dog((name));

        //Then
        Assert.assertTrue(dog instanceof Dog);
    }
}