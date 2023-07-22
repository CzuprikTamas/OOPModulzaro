package zoo.type;

import zoo.Animal;
import zoo.Oviparous;

public class Reptile extends Animal implements Oviparous {

    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Hüllő hang..");
    }

}
