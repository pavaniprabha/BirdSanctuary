package com.birdsanctuary;

public class Dove extends Bird implements IsFlyable, IsSwimmable{
    public Dove(){
        colour = Colour.WHITE;
    }

    public void fly(){
        System.out.println("Dove can Fly");
    }

    public void eat(){
        System.out.println("Dove can eat ");
    }

    public void swim(){
        System.out.println("Dove can Swim");
    }
}
