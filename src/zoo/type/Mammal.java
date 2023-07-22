package zoo.type;

import zoo.Animal;
import zoo.Viviparous;

public class Mammal extends Animal implements Viviparous {

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Emlős hang..");
    }
}
