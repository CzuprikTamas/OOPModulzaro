package zoo.type.konkret;

import zoo.type.Mammal;

public class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Macska hang..");
    }
}
