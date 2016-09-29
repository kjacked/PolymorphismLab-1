package io.zipcode.pets;

public class Cat extends Pet {

    public Cat(String petName) {
        super(petName, "Fish");


    }


    protected String speak() {
        return (this.name + " went MEOW!");
    }
}