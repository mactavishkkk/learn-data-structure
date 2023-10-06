package classes.filter;

import interfaces.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public List<Integer> filtra(List<Integer> numeros, Predicate predicado) {
        return numeros
                .stream()
                .filter(numero -> predicado.teste(numero))
                .collect(Collectors.toList());

    }

}
