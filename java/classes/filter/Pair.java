package classes.filter;

import interfaces.Predicate;

public class Pair implements Predicate {

    @Override
    public Boolean teste(Integer valor) {
        return 0 == valor % 2;
    }

}
