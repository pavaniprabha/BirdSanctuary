package com.birdsanctuary;

public class Penguin extends Bird implements IsSwimmable {
    public Penguin(){
        colour = Colour.WHITE;
    }

    public void eat(){
        System.out.println("Penguin eats Fish");
    }

    public void swim(){
        System.out.println("Penguin can Swim");
    }
}
