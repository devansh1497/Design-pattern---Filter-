import entity.Person;
import enums.Gender;
import filters.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "devansh", 27, 599999, Gender.MALE);
        Person person2 = new Person(2, "Tommy", 20, 342, Gender.MALE);
        Person person3 = new Person(3, "Jmimy", 31, 5366, Gender.MALE);
        Person person4 = new Person(4, "Shaun", 43, 2432, Gender.MALE);
        Person person5 = new Person(5, "Drake", 46, 1005, Gender.MALE);
        Person person6 = new Person(6, "Willia", 60, 42424, Gender.MALE);
        Person person7 = new Person(7, "John", 51, 53442, Gender.MALE);
        Person person8 = new Person(8, "Sarah", 24, 4000, Gender.FEMALE);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);

        people.add(person3);
        people.add(person4);

        people.add(person5);
        people.add(person6);

        people.add(person7);
        people.add(person8);


        Criteria greaterThanSalaryCriteria = new GreaterThanSalaryCriteria(5000);
        Criteria moreThanAgeCriteria = new MoreThanAgeCriteria(25);
        Criteria maleCriteria = new GenderCriteria(Gender.FEMALE);

        List<Criteria> l1 = new ArrayList<>();
        l1.add(moreThanAgeCriteria);
        l1.add(greaterThanSalaryCriteria);

        Criteria or = new OrCriteria(l1);

        List<Criteria> l2 = new ArrayList<>();
        l2.add(or);
        l2.add(maleCriteria);

        Criteria and = new AndCriteria(l2);

        PersonFilter filter = new PersonFilter(and);
        List<Person> filteredPeople = filter.apply(people);
        for (Person filteredPerson : filteredPeople) {
            System.out.println(filteredPerson);
        }
    }
}