package com.birdsanctuary;

public abstract class Bird {
	enum Colour {WHITE, BLACK, GREEN, YELLOW, GREY};

    protected String id;
    protected Colour colour;

    public abstract void eat();

    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", colour='" + colour + '\'' +'}';
    }
   
}
