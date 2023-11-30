package impl;

import program.Animal;
import program.Illable;
import program.Runnable;
import program.Speakable;
import program.Swimable;

public class Human extends Animal implements Illable, Runnable, Swimable, Speakable{
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void getIll() {
        System.out.println(this.name + " got ill.. Let's visit a doctor!");
    }

    @Override
    public int getSwimmingSpeed() {
        return 8;
    }

    @Override
    public int getRunningSpeed() {
        return 15;
    }

    @Override
    public void speak() {
        System.out.println("Привет, меня зовут " + this.name);;
    }

    @Override
    public void hunt() {
        System.out.println("Поел в кафе..");;
    }

}