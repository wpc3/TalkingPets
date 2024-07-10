package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BunnyTest {
    @Test
    public void testBunnySpeak() {

        //Given
        Pet bunny = new Bunny("Bugs");

        //When
        String talkingPets = bunny.speak();

        //Then
        Assert.assertEquals("Hi", talkingPets);
    }

    @Test
    public void testBunnyGetName() {
        //Given
        String expectedName = "Bunny";
        Pet bunny = new Bunny(expectedName);

        //Then
        String actualName = bunny.getName();

        //When
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testBunnySetName() {
        //Given
        Pet bunny = new Bunny("Roger");
        String newName = "Mike";

        //Then
        bunny.setName(newName);

        //When
        Assert.assertEquals(newName, bunny.getName());

    }

    @Test
    public void testBunnyIsPet(){
       String name = "Bun";
       Bunny bunny = new Bunny((name));
       Assert.assertTrue(bunny instanceof Bunny);

    }




}
