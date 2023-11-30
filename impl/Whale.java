package impl;
import program.Animal;
import program.Illable;
import program.Swimable;

public class Whale extends Animal implements Swimable, Illable{
    public Whale(String name, String color) {
        super(name, color, 2);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public void getIll() {
        System.out.println(getName() + " " + getType() + " got ill..");;
    }

    @Override
    public int getSwimmingSpeed() {
        return 20;
    }
}