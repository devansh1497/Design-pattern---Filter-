package filters;

import entity.Person;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> people);
}
