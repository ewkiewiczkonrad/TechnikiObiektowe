package com.company;

public class Phone extends Device{
    Double screenSize;


    @Override
    public void turnOn() {
        System.out.println("Wciskam przycisk");
        System.out.println("Uruchamiam sie");
    }
}
