import java.util.List;
import classes.filter.Filter;
import classes.filter.Odd;
import classes.filter.Pair;

public class TestFilter {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Filter filtro = new Filter();
        List<Integer> pares = filtro.filtra(numeros, new Pair());
        List<Integer> impares = filtro.filtra(numeros, new Odd());

        System.out.printf("Números pares:%22s\n", pares);
        System.out.printf("Números ímpares:%20s\n", impares);
    }
}