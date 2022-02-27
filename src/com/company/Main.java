package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("canis", "Szarik");

        System.out.println(dog.name);
        System.out.println(dog.getWeight());
        dog.feed();
        System.out.println(dog.getWeight());


        Human me = new Human("Konrad", "Nazwisko");
        System.out.println(me.getWeight());
        System.out.println(me.name);
    }
}
