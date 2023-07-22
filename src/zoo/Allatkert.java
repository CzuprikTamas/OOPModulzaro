package zoo;

import zoo.type.Bird;
import zoo.type.Mammal;
import zoo.type.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Allatkert {

    private List<Animal> listOfAnimals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        listOfAnimals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        listOfAnimals.remove(animal);
    }

    public void listOfAllAnimal() {
        System.out.println("Az összes állat:");
        for (Animal actual : listOfAnimals) {
            System.out.println(actual);
        }
    }

    public void ListOfReptile() {
        System.out.println("A hüllő az állatkertben:");
        for (Animal actual : listOfAnimals) {
            if (actual instanceof Reptile) {
                System.out.println(actual);
            }
        }
    }

    public void ListOfMammal() {
        System.out.println("Az emlősök az állatkertben:");
        for (Animal actual : listOfAnimals) {
            if (actual instanceof Mammal) {
                System.out.println(actual);
            }
        }
    }

    public void ListOfBird() {
        System.out.println("A madarak az állatkertben:");
        for (Animal actual : listOfAnimals) {
            if (actual instanceof Bird) {
                System.out.println(actual);
            }
        }
    }



    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }
}
