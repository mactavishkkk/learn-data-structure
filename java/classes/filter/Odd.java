package classes.filter;

import interfaces.Predicate;

public class Odd implements Predicate {

    @Override
    public Boolean teste(Integer valor) {
        return 1 == valor % 2;
    }

}
