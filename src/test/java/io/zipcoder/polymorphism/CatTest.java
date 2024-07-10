package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testCatSpeak() {

        //Given
        Pet cat = new Pet("Bugs");

        //When
        String talkingPets = cat.speak();

        //Then
        Assert.assertEquals("Meow", talkingPets);
    }

    @Test
    public void testCatGetName() {
        //Given
        String expectedName = "Cat";
        Pet cat = new Pet(expectedName);

        //Then
        String actualName = cat.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testCatSetName() {
        //Given
        Pet cat = new Pet("Roger");
        String newName = "Catty";

        //Then
        cat.setName(newName);

        //When
        Assert.assertEquals(newName, cat.getName());

    }

    @Test
    public void testCatIsAPet(){
        String name = "Carm";
        Cat cat = new Cat((name));
        Assert.assertTrue(cat instanceof Cat);
    }
}