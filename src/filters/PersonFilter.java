package filters;

import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonFilter {

    private Criteria criteria;

    public PersonFilter(Criteria criteria) {
        this.criteria = criteria;
    }

    public List<Person> apply(List<Person> people ){
        return criteria.meetCriteria(people);
    }
}

/**
 *
 * and: [
 *  or: [
 *      salary > 500,
 *      age > 30
 *
 *  ],
 *  gender  = Male.
 * ]
 *
 *
 */