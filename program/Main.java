package program;

import impl.Cat;
import impl.Crocodile;
import impl.Dog;
import impl.Duck;
import impl.Eagle;
import impl.Fish;
import impl.Whale;
import veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Барсик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Eagle("Орлуша"))
                .addAnimal(new Crocodile("Гена"))
                .addAnimal(new Fish("Немо"))
                .addAnimal(new Whale("Контики"))
                .addAnimal(new Doctor("Айболит"));

        System.out.println("All animals:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunningSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimmingSpeed());
        }

        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlightSpeed());
        }

        System.out.println("\nSpeaking animals:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nHead physician of this clinic:");
        System.out.println(vetClinic.getHeadPhysician());
        vetClinic.getHeadPhysician().speak();
    }

}