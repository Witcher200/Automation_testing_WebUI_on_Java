package lesson_9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPP {
    static class Person {
        enum Course {
            TESTER, ENGINEER, MANAGER, DEVELOPER, QA, Admin,
        }

        private final String name;
        private List<Course> cources;
        private List<String> cr;

        public Person(String name, List<Course> cources) {
            this.name = name;
            this.cources = cources;
        }

        public String getName(){
            return this.name;
        }

        public List<Course> getCources(){
            return this.cources;
        }

    }

    public static List<Person.Course> Task_1(List<Person> persons) {
        return  persons.stream()
                .flatMap(pers -> pers.getCources().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> Task_2(List<Person> persons, int limit) {
        return   persons.stream()
                .sorted((o1, o2) -> o2.getCources().size() - o1.getCources().size())
                .limit(limit)
                .map(s -> s.getName() + ":" + s.getCources().size())
                .collect(Collectors.toList());
    }

    public static List<String> Task_3(List<Person> persons, Person.Course prof) {
        return  persons.stream()
               .filter(pers -> pers.getCources().contains(prof))
               .map(s -> s.getName() + ":" + s.getCources().toString())
               .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Igor", Arrays.asList(Person.Course.QA, Person.Course.TESTER)),
            new Person("Dima", Arrays.asList(Person.Course.MANAGER, Person.Course.DEVELOPER,
            Person.Course.QA)),
            new Person("Darina", Arrays.asList(Person.Course.Admin, Person.Course.QA,
            Person.Course.DEVELOPER, Person.Course.ENGINEER)),
            new Person("Diana", Arrays.asList(Person.Course.QA, Person.Course.TESTER)),
            new Person("Nikolay", Arrays.asList(Person.Course.ENGINEER)),
            new Person("Vladimir", Arrays.asList(Person.Course.ENGINEER, Person.Course.DEVELOPER,
            Person.Course.TESTER)),
            new Person("Artem", Arrays.asList(Person.Course.QA)),
            new Person("Elena", Arrays.asList(Person.Course.TESTER)),
            new Person("Irina", Arrays.asList(Person.Course.TESTER)),
            new Person("Aleksandra", Arrays.asList(Person.Course.TESTER))
          ));

    System.out.println("Задание № 1");
        Task_1(persons).forEach(System.out::println);

        System.out.println(" ");

    System.out.println("Задание № 2");
        Task_2(persons, 3).forEach(System.out::println);

        System.out.println(" ");

     System.out.println("Задание № 3");
        Task_3(persons, Person.Course.MANAGER).forEach(System.out::println);

        Task_3(persons, Person.Course.TESTER).forEach(System.out::println);

       Set<Person> uniqPosition = new HashSet<>();
        uniqPosition.addAll(persons);
    }
}
