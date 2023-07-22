package zoo.type.konkret;

import zoo.type.Mammal;

public class Dog extends Mammal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Kutya hang..");
    }
}
