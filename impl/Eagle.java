package impl;

import program.Animal;
import program.Flyable;
import program.Illable;

public class Eagle extends Animal implements Flyable, Illable{
    String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void getIll() {
        System.out.println(this.getName() + " " + this.getType() + " got ill..");;
    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void speak() {
        System.out.println("Крик орла в высоте..");;
    }

    @Override
    public void hunt() {

    }

}