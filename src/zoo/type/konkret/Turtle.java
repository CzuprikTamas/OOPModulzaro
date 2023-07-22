package zoo.type.konkret;

import zoo.type.Reptile;

public class Turtle extends Reptile {

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Teknős hang..");
    }
}
