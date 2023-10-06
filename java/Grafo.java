import classes.fork.Fork;

public class Grafo {
    public static void main(String[] args) {
        Fork grafo = new Fork();

        grafo.adicVertice("A");
        grafo.adicVertice("B");
        grafo.adicVertice("C");
        grafo.adicVertice("D");

        grafo.adicAresta(0, 1);
        grafo.adicAresta(0, 2);
        grafo.adicAresta(0, 3);
        grafo.adicAresta(2, 3);

        Fork grafoTwo = new Fork();
        grafoTwo.adicVertice("A");
        grafoTwo.adicVertice("B");
        grafoTwo.adicVertice("C");
        grafoTwo.adicVertice("D");
        grafoTwo.adicVertice("E");
        grafoTwo.adicVertice("F");
        grafoTwo.adicVertice("G");
        grafoTwo.adicAresta(0, 1, 50);
        grafoTwo.adicAresta(0, 3, 80);
        grafoTwo.adicAresta(1, 2, 60);
        grafoTwo.adicAresta(1, 3, 90);
        grafoTwo.adicAresta(2, 4, 40);
        grafoTwo.adicAresta(3, 2, 20);
        grafoTwo.adicAresta(3, 4, 70);
        grafoTwo.adicAresta(4, 1, 50);
        grafoTwo.adicAresta(5, 6, 20);
        System.out.println("Menor Caminho");
        grafoTwo.menorCaminho();
        System.out.println();

    }
}
