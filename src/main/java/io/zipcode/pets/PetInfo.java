package io.zipcode.pets;

import java.util.ArrayList;


public class PetInfo {
    public static ArrayList<Pet> getPets() {
        Pet pet = null;
        ArrayList<Pet> pets = new ArrayList<Pet>();
        int howManyPets = User.integerInput("How many pets do you have?");
        while(howManyPets > 0) {
            String petType = User.stringInput("What type of pet is it?");
            String petName = User.stringInput("What is your pets name?");
            switch (petType.toUpperCase()) {
                case "DOG":
                    pet = new Dog(petName);
                    break;
                case "CAT":
                    pet = new Cat(petName);
                    break;
                case "FISH":
                    pet = new Fish(petName);
                    break;
                default: System.out.println("Hey wait, that's not an animal!");
            }
            pets.add(pet);
            howManyPets--;
        }
        return pets;
    }


    public static void main(String[] args){
        ArrayList<Pet> myPets = getPets();
        for(Pet pet : myPets){
            System.out.println("Pet type = " + pet.getType());
            System.out.println("Pet name = " + pet.getName());
            System.out.println("Pet speech = " + pet.speak());
        }
    }
}



