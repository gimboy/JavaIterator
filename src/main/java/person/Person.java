package person;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String phone;

    public Person(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>(new AgeComparator());
        treeSet.add(new Person("Timur","Argisot",35,"81213"));
        treeSet.add(new Person("Timur","Argis3ot",75,"81213"));
        treeSet.add(new Person("3imur","Argisot",15,"81213"));
        treeSet.add(new Person("T2imur","Argisot",25,"81213"));
        for (Person person : treeSet) {
            System.out.println(person);
        }
    }
}
