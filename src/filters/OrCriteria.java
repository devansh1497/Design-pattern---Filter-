package filters;

import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria extends BinaryCriterion implements Criteria {

    public OrCriteria(List<Criteria> criterion) {
        super(criterion);
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new ArrayList<>();
        for (Criteria criteria : criterion) {
            result.addAll(criteria.meetCriteria(people));
        }
        return result.stream().distinct().collect(Collectors.toList());
    }
}
