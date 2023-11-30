package impl;

import program.Animal;
import program.Illable;
import program.Runnable;
import program.Swimable;

public class Crocodile extends Animal implements Illable, Swimable, Runnable{
    public Crocodile(String name, String color) {
        super(name, color,4);
    }

    public Crocodile(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Hr-r-r!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getSwimmingSpeed() {
        return 45;
    }

    @Override
    public void getIll() {
        System.out.println(getName() + " " + getType() + " got ill..");
    }

    @Override
    public int getRunningSpeed() {
        return 30;
    }

}