package filters;

import entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class LessThanAgeCriteria implements Criteria {

    private int age;

    public LessThanAgeCriteria(int age) {
        this.age = age;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(person -> person.getAge() < age).collect(Collectors.toList());
    }
}
