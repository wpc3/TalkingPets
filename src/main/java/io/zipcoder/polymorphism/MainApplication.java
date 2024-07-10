package io.zipcoder.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {


    public static void main(String[] args) {
        //Setting field where user will type the pet they have and the name
        String petType;
        String petName;

        //Making an array list that will store user input
        ArrayList<Pet> petList = new ArrayList<>();

        //Scanner to read the user input
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many pets do you have?");


        int totalPets;//This variable will track user input when asked how many pets
        totalPets = scanner.nextInt();//Total pets equals user input
        scanner.nextLine();//Scanner reading next line
        
        //Looping through the amount of pets user has and this will print kind and pet for each pet user inputs
        for (int i = 0; i < totalPets; i++) {
            System.out.println("What kind of pet is it? (dog, bunny, cat" );

            //pet type equals what the user put in
            petType = scanner.nextLine();
            System.out.println("What is their name?");

            //pet name equals what the user put in
            petName = scanner.nextLine();

            //Switch case will add a pet and name based on what type of pet the user inputs
            switch (petType.toLowerCase()) {
                case "dog":
                    petList.add(new Dog(petName));
                    break;
                case "cat":
                    petList.add(new Cat(petName));
                    break;
                case "bunny":
                    petList.add(new Bunny(petName));
                    break;
                default:
                    System.out.println("Invalid pet.");//if the user doesnt type dog,cat or bunny this will tell them they have an invalid pet
                }

            }

        //For each object/pet that the user has, print pet name and what the pet speaks
        for (Pet obj : petList){
            System.out.println("Pet " + obj.getName() + "say " + obj.speak());
        }
        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //Take the number of pets from use
//        System.out.println("How many pets do you have");
//
//        int numberOfPets = 0;
//        try{numberOfPets = Integer.parseInt(br.readLine());}
//        catch (NumberFormatException e){
//            System.out.println("Invalid input for number of pets. Please enter a valid number of pets");
//            return;
//        }
//
//        //Initialize number of pets using user input
//        List<Pet> petList = new ArrayList<>();
//
//        //Take user number of pets from petList
//        for(int i =0; i < numberOfPets; i++){
//            return;
//        }


//    //Scanner for user input
//    Scanner scanner = new Scanner(System.in);
//
//    //Outprint to ask how many pets user has
//        System.out.println("How many pets do you have?");
//
//        //Based on user response, add the pets
//        int numberOfPets = scanner.nextInt();
//        scanner.nextLine();
//
//        //Create a list of pets based on the pet classes we created
//        List<Pet> petList = new ArrayList<>();
//
//
//        //Now ask them what kind of pet each one is
//        System.out.println("What kind of pets are they? Also what are their names?");
//
//        //Iterate through our pet list
//        for(int i = 0; i< numberOfPets; i++){

    }







