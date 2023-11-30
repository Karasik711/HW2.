package impl;
import program.Animal;
import program.Illable;
import program.Swimable;

public class Fish extends Animal implements Illable, Swimable{
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("bul-bul");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getSwimmingSpeed() {
        return 10;
    }

    @Override
    public void getIll() {
        System.out.println(getName() + " " + getType() + " got ill..");
    }
}