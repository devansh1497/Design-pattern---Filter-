package filters;

import entity.Person;
import enums.Gender;

import java.util.List;
import java.util.stream.Collectors;

public class GenderCriteria implements Criteria{
    private final Gender gender;

    public GenderCriteria(Gender gender) {
        this.gender = gender;
    }


    @Override
    public List<Person> meetCriteria(List<Person> people) {
        return people.stream().filter(person -> person.getGender() == gender).collect(Collectors.toList());
    }
}
