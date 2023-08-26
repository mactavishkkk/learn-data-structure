import classes.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nEstrutura de Dados(Árvore Binária)\n");

        ArvoreBinaria cerejeira = new ArvoreBinaria();

        cerejeira.inserirNo(10, "A");
        cerejeira.inserirNo(5, "B");
        cerejeira.inserirNo(3, "C");
        cerejeira.inserirNo(6, "D");
        cerejeira.inserirNo(4, "E");
        cerejeira.inserirNo(14, "F");
        cerejeira.inserirNo(13, "G");
        cerejeira.inserirNo(15, "H");

        cerejeira.imprimeTotalEsquerdasFestivas();
        cerejeira.imprimirArvoreComRecuo();
    }
}
