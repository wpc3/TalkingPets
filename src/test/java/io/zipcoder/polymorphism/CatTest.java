package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testCatSpeak() {

        //Given
        Cat cat = new Cat("Bugs");

        //When
        String talkingPets = cat.speak();

        //Then
        Assert.assertEquals("Meow", talkingPets);
    }

    @Test
    public void testCatGetName() {
        //Given
        String expectedName = "Cat";
        Cat cat = new Cat(expectedName);

        //Then
        String actualName = cat.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testCatSetName() {
        //Given
        Cat cat = new Cat("Roger");
        String newName = "Catty";

        //Then
        cat.setName(newName);

        //When
        Assert.assertEquals(newName, cat.getName());

    }
}