package filters;

import entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class LessThanSalaryCriteria implements Criteria {
    private final int salary;

    public LessThanSalaryCriteria(int salary) {
        this.salary = salary;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(person -> person.getSalary() < salary).collect(Collectors.toList());
    }
}
