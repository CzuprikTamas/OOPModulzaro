import bank.BankAccount;
import bank.NotEnoughMoneyException;
import person.Gender;
import person.Person;
import shape.Circle;
import shape.Rectangle;
import shape.Square;
import zoo.Allatkert;
import zoo.Animal;
import zoo.type.konkret.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException {

        Set<Person> friends = new HashSet<>();

        Person Jucus = new Person("Jucus", 70, Gender.FEMALE, "Falmászás");
        Person Zoli = new Person("Jucus", 40, Gender.MALE, "Falmászás");
        Person Rodrigez = new Person("Jucus", 28, Gender.GENDERSEMLEGES, "Falmászás");
        Person Mary = new Person("Mary", 30, Gender.FEMALE, "Falmászás");

        Jucus.addFriend(Zoli);
        Jucus.addFriend(Rodrigez);
        Jucus.addFriend(Mary);

        System.out.println("Population: " + Person.getPopulation());





        BankAccount ZolcsiAccount = new BankAccount("Zoli", 1300, 32432423);
        BankAccount FeriAccount = new BankAccount("Feri", 5000, 12345678);

        ZolcsiAccount.withdraw(1300);
        System.out.println(ZolcsiAccount.getBalance());
        ZolcsiAccount.deposit(30000);
        ZolcsiAccount.transfer(FeriAccount, 5000);
        System.out.println(FeriAccount.getBalance());





        List<Animal> animals = new ArrayList<>();

        Animal animal1 = new Cat("macska", 300);
        Animal animal2 = new Dog("kutya", 3214);
        Animal animal3 = new Eagle("sas", 23);
        Animal animal4 = new Penguin("pingvin", 12);
        Animal animal5 = new Snake("kigyo", 1);
        Animal animal6 = new Turtle("teknos", 34);

        Allatkert zoo = new Allatkert();
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        zoo.addAnimal(animal5);
        zoo.addAnimal(animal6);
        zoo.ListOfBird();
        zoo.removeAnimal(animal4);
        zoo.ListOfBird();








        Circle circle = new Circle(2.5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Square square = new Square(2);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}