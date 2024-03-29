package filters;

import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria extends BinaryCriterion implements Criteria{

    public AndCriteria(List<Criteria> criterion) {
        super(criterion);
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new ArrayList<>(people);
        for (Criteria criteria : criterion) {
            result = criteria.meetCriteria(result);
        }
        return result;
    }
}
