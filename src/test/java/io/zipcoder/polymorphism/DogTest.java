package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testDogSpeak() {

        //Given
        Dog dog = new Dog("Bugs");

        //When
        String talkingPets = dog.speak();

        //Then
        Assert.assertEquals("Bark", talkingPets);
    }

    @Test
    public void testDogGetName() {
        //Given
        String expectedName = "Bunny";
        Dog dog = new Dog(expectedName);

        //Then
        String actualName = dog.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogSetName() {
        //Given
        Dog dog = new Dog("Roger");
        String newName = "Frog";

        //Then
        dog.setName(newName);

        //When
        Assert.assertEquals(newName, dog.getName());


    }
}