package impl;

import program.Animal;
import program.Illable;
import program.Runnable;

public class Cat extends Animal implements Illable, Runnable{
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
        System.out.println("Cat woke up..");
    }

    private void findFood() {
        System.out.println("Cat found food..");
    }

    private void eat() {
        System.out.println("Cat was eating..");
    }

    @Override
    public void getIll() {
        System.out.println(getName() + " " + getType() + " got ill..");
    }

    @Override
    public int getRunningSpeed() {
        return 45;
    }


}