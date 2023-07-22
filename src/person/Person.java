package person;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private int age;
    private final Gender gender;
    private String hobbies;

    private static int population = 0;

    private Set<Person> friends;


    public Person(String name, int age, Gender gender, String hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        friends = new HashSet<>();
        population++;
    }

    public void addFriend(Person person) {
        if (person != null && !friends.contains(person)) {
            friends.add(person);
            //person.addFriend();
        }
    }

    public static int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Person> getFriends() {
        return friends;
    }

    public void setFriends(Set<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", hobbies = " + hobbies +
                ", friends[" + friends +
                ']';
    }
}
