package io.zipcode.pets;


public abstract class Pet {
    public String getType;
    public String type;
    public String name;

    public Pet(String name, String petType) {
        this.type = petType;
        this.name = name;
    }

    protected abstract String speak();

    protected String getName(){
        return this.name;
    }

    protected String getType(){
        return this.type;
    }
}
