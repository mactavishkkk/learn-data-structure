package classes;

public class ArvoreBinaria {
    public No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void inserirNo(int id, Object elemento) {
        No novoNo = new No(id, elemento, null, null);

        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;

            while (true) {
                pai = atual;

                if (id < atual.getId()) {
                    atual = atual.getEsquerdo();

                    if (atual == null) {
                        pai.setEsquerdo(novoNo);
                        return;
                    }
                } else {
                    atual = atual.getDireito();

                    if (atual == null) {
                        pai.setDireito(novoNo);
                        return;
                    }
                }
            }
        }
    }

    private void preFixado(No atual) {
        if (atual != null) {
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            preFixado(atual.getEsquerdo());
            preFixado(atual.getDireito());
        }
    }

    public void imprimeElementosArvore() {
        preFixado(raiz);
    }

    public int contarEsquerdasFestivas(No atual) {
        if (atual == null) {
            return 0;
        }

        int esquerdasFestivasEsquerdo = contarEsquerdasFestivas(atual.getEsquerdo());
        int esquerdasFestivasDireito = contarEsquerdasFestivas(atual.getDireito());

        int contagemAtual = esquerdasFestivasEsquerdo + esquerdasFestivasDireito;

        if (atual.getEsquerdo() != null) {
            contagemAtual++;
        }

        return contagemAtual;
    }

    public void imprimeTotalEsquerdasFestivas() {
        int totalEsquerdasFestivas = contarEsquerdasFestivas(raiz);
        System.out.println("O total de esquerdas festivas desta árvore binária é: " + totalEsquerdasFestivas + "\n");
    }

    private void imprimirRecuos(No atual, String prefixo) {
        if (atual != null) {
            System.out.println(prefixo + atual.getId());
            imprimirRecuos(atual.getEsquerdo(), prefixo + "   ");
            imprimirRecuos(atual.getDireito(), prefixo + "   ");
        }
    }

    public void imprimirArvoreComRecuo() {
        imprimirRecuos(raiz, "");
    }

}
