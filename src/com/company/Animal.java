package com.company;

public class Animal {
    String species;
    String name;
    Integer age;
    Double weight;
    private Boolean alive;

    Animal(String species, String name){
        this.alive = true;
        this.species = species;
        this.name = name;
        if(species.equals("canis")) {
            this.weight = 2.0;
        }
        else if (species.equals("felis")){
            this.weight = 1.0;
        }
    }

    public Double getWeight(){
        return  this.weight;
    }

    public void feed(){
        this.weight += 0.1;
        System.out.println("dzieki za jedzonko");
    }
}
