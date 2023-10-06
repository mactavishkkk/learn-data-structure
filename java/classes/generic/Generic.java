package classes.generic;

public class Generic {
    public static <T> void exibe(T[] elementos) {
        for (T elemento : elementos) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maior(T... valores) {
        T maior = null;
        for (T valor : valores) {
            if (maior == null || valor.compareTo(maior) > 0) {
                maior = valor;
            }
        }
        return maior;
    }
}
