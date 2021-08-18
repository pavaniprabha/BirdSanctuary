package com.birdsanctuary;

import java.util.ArrayList;

import java.util.List;

public class BirdSanctuaryManager {

    List<Bird> birdList= new ArrayList<Bird>();

    public void printFlyable(){
        for (int i = 0; i < birdList.size(); i++) {
           if (birdList.get(i) instanceof IsFlyable){
                IsFlyable flyable = (IsFlyable) birdList.get(i);
                flyable.fly();
            }
        }
    }

    public void printSwimmable(){
        for (int i = 0; i < birdList.size(); i++) {
            if (birdList.get(i) instanceof IsSwimmable){
                IsSwimmable swimmable = (IsSwimmable) birdList.get(i);
                swimmable.swim();
            }
        }
    }

    public void printEats(){
        for (int i = 0; i < birdList.size(); i++) {
            birdList.get(i).eat();
        }
    }

    public void print(){
        for (int i = 0; i < birdList.size(); i++) {
            System.out.println(birdList.get(i));
        }
    }
} 

	