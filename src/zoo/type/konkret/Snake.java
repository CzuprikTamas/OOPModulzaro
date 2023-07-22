package zoo.type.konkret;

import zoo.type.Reptile;

public class Snake extends Reptile {

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Kígyó hang..");
    }
}
