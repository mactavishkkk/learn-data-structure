package classes.fork;

import classes.distance.Distance;
import classes.vertex.Vertex;

public class Fork {

    private final int MAX_VERTICES = 20;
    private final int INFINITO = 1000000;
    private Vertex listaVertice[];
    private Distance menor[];
    
    private int matriz[][];
    private int numVertices;
    private int numFechados;
    private int verticeAtual;
    private int distParaAtual;

    public Fork() {
        listaVertice = new Vertex[MAX_VERTICES];
        matriz = new int[MAX_VERTICES][MAX_VERTICES];
        numVertices = 0;
        numFechados = 0;
        for (int y = 0; y < MAX_VERTICES; y++) {
            for (int x = 0; x < MAX_VERTICES; x++) {
                matriz[x][y] = INFINITO;
            }
        }
        menor = new Distance[MAX_VERTICES];
    }

    public void adicVertice(String rotulo) {
        numVertices++;
        listaVertice[numVertices] = new Vertex(rotulo);
    }

    public void adicAresta(int inicio, int fim, int peso) {
        matriz[inicio][fim] = 1;
        matriz[fim][inicio] = 1;
    }

    public void displayVertice(int v) {
    }

    private int pegaMinimo() {
        int minimo = INFINITO;
        int indice = 0;
        for (int j = 1; j < numVertices; j++) {
            if (!listaVertice[j].getVisitado() && menor[j].getDistancia() < minimo) {
                minimo = menor[j].getDistancia();
                indice = j;
            }
        }
        return indice;
    }

    private void ajustaMenor() {
        int coluna = 1;
        while (coluna < numVertices) {
            if (listaVertice[coluna].getVisitado()) {
                coluna++;
                continue;
            }
            int atualParaMargem = matriz[verticeAtual][coluna];
            int inicioParaMargem = distParaAtual + atualParaMargem;
            int menorDistancia = menor[coluna].getDistancia();
            if (inicioParaMargem < menorDistancia) {
                menor[coluna].setPaiVertice(verticeAtual);
                menor[coluna].setDistancia(inicioParaMargem);
            }
            coluna++;
        }
    }

    private void mostraMenor() {
        for (int j = 0; j < numVertices; j++) {
            System.out.print(listaVertice[j].getRotulo() + "=");

            if (menor[j].getDistancia() == INFINITO) {
                System.out.print("inf");
            } else {
                System.out.print(menor[j].getDistancia());
            }
            String pai = (String) listaVertice[menor[j].getPaiVertice()].getRotulo();
            System.out.print("(" + pai + ") ");
        }
        System.out.println("");
    }

    public void menorCaminho() {
        int inicio = 0;
        listaVertice[inicio].foiVisitado();
        numFechados = 1;
        for (int j = 0; j <= numVertices; j++) {

            int distancia = matriz[inicio][j];

            menor[j] = new Distance(inicio, distancia);
        }
        while (numFechados < numVertices) {

            int indiceParaMinimo = pegaMinimo();

            int minimaDistancia = menor[indiceParaMinimo].getDistancia();
            if (minimaDistancia == INFINITO) {

                System.out.println("Existem vértices não endereçados");
                break;
            } else {

                verticeAtual = indiceParaMinimo;
                distParaAtual = menor[indiceParaMinimo].getDistancia();
            }
            listaVertice[verticeAtual].foiVisitado();
            numFechados++;
            ajustaMenor();
        }
        mostraMenor();
        numFechados = 0;

        for (int j = 0; j < numVertices; j++)
            listaVertice[j].naoFoiVisitado();
    }
}
