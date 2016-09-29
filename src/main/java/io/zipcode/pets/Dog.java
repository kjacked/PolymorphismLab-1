package io.zipcode.pets;

public class Dog extends Pet {

    public Dog(String petName) {
        super(petName, "Dog");

    }


    protected String speak() {
        return (this.name + " went BARK!");
    }

}