package io.zipcode.pets;

public class Fish extends Pet {

    public Fish(String petName) {
        super(petName, "Fish");

    }


    protected String speak() {
        return (this.name + " went 'blub'!");
    }

}