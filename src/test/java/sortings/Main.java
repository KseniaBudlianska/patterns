package sortings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", 21);
        Person p2 = new Person("Mike", 15);
        Person p3 = new Person("Mike", 15);
        Person p4 = new Person("Mike", 31);
        Person p5 = new Person("Name", 14);
        Person p6 = new Person("Name", 44);
        List<Person> pList = Arrays.asList(p1, p6, p2, p3, p4, p5);
        pList.forEach(p-> System.out.println(p.getName() + "_" + p.getAge()));
        Collections.sort(pList, new SortPersons());
        System.out.println("Sorting...");
        pList.forEach(p-> System.out.println(p.getName() + "_" + p.getAge()));
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static class SortPersons implements Comparator<Person> {
        @Override public int compare(Person o1, Person o2) {
            int comp = o1.getName().compareTo(o2.getName());
            if (comp == 0) {    // names are equal
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return comp;
        }
    }
}
