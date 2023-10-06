package classes.list;

import classes.atthe.AttheBL;

public class List {

  private AttheBL inicio;

  public List() {
    this.inicio = null;
  }

  public void insereInicio(Object elemento) {
    AttheBL novoNo = new AttheBL(elemento, null);
    novoNo.setProximo(this.inicio);
    this.inicio = novoNo;
  }

  public Object removeInicio() {
    AttheBL auxiliar = this.inicio;
    this.inicio = auxiliar.getProximo();
    return auxiliar.getElemento();
  }

  public void imprimeLista() {
    AttheBL auxiliar = this.inicio;
    if (auxiliar != null) {
      System.out.println("\nInício da Lista Ligada:\n");

      while (auxiliar != null) {
        System.out.println(auxiliar.getElemento());
        auxiliar = auxiliar.getProximo();
      }
      System.out.println("Fim da Lista.\n");
    } else {
      System.out.println("Lista Vazia.");
    }
  }

  public Object buscaElemento(long posicao) {
    AttheBL auxiliar = this.inicio;

    while ((posicao > 0) && (auxiliar != null)) {
      if (posicao == 1) return auxiliar.getElemento();
      posicao--;
      auxiliar = auxiliar.getProximo();
    }
    return null;
  }

  public void liberaLista() {
    while (inicio != null) {
      inicio = inicio.getProximo();
    }
  }

  public Boolean listaVazia() {
    AttheBL auxiliar = this.inicio;

    if(auxiliar == null){
      return true;
    }

    return false;
  }
}
