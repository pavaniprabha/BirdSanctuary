package com.birdsanctuary;

public class Parrot extends Bird implements IsFlyable{
    public Parrot(){
        colour = Colour.GREEN;
    }

    public void fly(){
        System.out.println("Parrot can Fly");
    }

    public void eat(){
        System.out.println("Parrot can eat");
    }

}