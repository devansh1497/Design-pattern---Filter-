package filters;

import java.util.List;

public class BinaryCriterion {

    List<Criteria> criterion;

    BinaryCriterion(List<Criteria> criterion) {
        if (criterion.size() < 2) {
            throw new IllegalArgumentException("Minimum 2 conditions needed for binary criteria");
        }
        this.criterion = criterion;
    }

}
