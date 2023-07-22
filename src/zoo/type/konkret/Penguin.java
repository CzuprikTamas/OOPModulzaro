package zoo.type.konkret;

import zoo.type.Bird;

public class Penguin extends Bird {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Pingvin hang..");
    }
}
