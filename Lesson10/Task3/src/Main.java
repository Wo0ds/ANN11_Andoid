import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person bob1 = new Person("Bob",1);
        Person bob2 = new Person("Sara",2);
        Person bob3 = new Person("Bob",3);

        final List<Person> list = new ArrayList<>();
        list.add(bob1);
        list.add(bob2);
        list.add(bob3);

        if(list.contains(bob3)) {
            System.out.println("Содержится!");
        }
        else {
            System.out.println("Не содержится!");
        }

        for (Person x : list) {
            System.out.println(x);
        }
        list.remove(bob3);
        list.removeAll(list);
        System.out.println(list);
    }
}
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "Name: " + name + "," + " id: " + id;
    }
}