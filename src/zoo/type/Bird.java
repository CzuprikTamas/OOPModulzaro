package zoo.type;

import zoo.Animal;
import zoo.Oviparous;

public class Bird extends Animal implements Oviparous {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Madár hang..");
    }
}
