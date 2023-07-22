package zoo.type.konkret;

import zoo.Oviparous;
import zoo.type.Bird;

public class Eagle extends Bird implements Oviparous {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Sas hang..");
    }
}
