package impl;
import program.Animal;
import program.Flyable;
import program.Illable;
import program.Runnable;
import program.Swimable;

public class Duck extends Animal implements Flyable, Illable, Runnable, Swimable{
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 8;
    }

    @Override
    public void getIll() {
        System.out.println(getName() + " " + getType() + " got ill..");
    }

    @Override
    public int getSwimmingSpeed() {
        return 10;
    }
}