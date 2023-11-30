package veterinary;
import java.util.ArrayList;
import java.util.List;

import impl.Human;
import program.Animal;
import program.Flyable;
import program.Speakable;
import program.Swimable;
import program.Runnable;

public class VetClinic {
    private final List<Animal> animals;
    private Human headPhysician;

    public VetClinic(Human headPhysician) {
        this.headPhysician = headPhysician;
        this.animals = new ArrayList<>();
    }
    public VetClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Speakable> getSpeakingAnimals() {
        List<Speakable> speakingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Speakable) speakingAnimals.add((Speakable) a);

        return speakingAnimals;
    }

    public Human getHeadPhysician() {
        return headPhysician;
    }

    public VetClinic addAnimal(Animal animal) {
        if (animal instanceof Human)
            this.headPhysician = (Human) animal;
        else
            this.animals.add(animal);
        return this;
    }
}