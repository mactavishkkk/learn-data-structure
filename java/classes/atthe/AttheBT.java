package classes.atthe;

import classes.tree.Tree;

public class AttheBT {

  private Long id;
  private Object elemento;
  private AttheBT esquerdo;
  private AttheBT direito;
  private AttheBT pai;
  private long balanceio;

  public AttheBT(long id, Object elemento, AttheBT esquerdo, AttheBT direito) {
    this.id = id;
    this.elemento = elemento;
    this.esquerdo = esquerdo;
    this.direito = direito;
    this.balanceio = 0;
    this.pai = null;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setElemento(Object elemento) {
    this.elemento = elemento;
  }

  public Object getElemento() {
    return elemento;
  }

  public void setEsquerdo(AttheBT esquerdo) {
    this.esquerdo = esquerdo;
  }

  public AttheBT getEsquerdo() {
    return esquerdo;
  }

  public void setDireito(AttheBT direito) {
    this.direito = direito;
  }

  public AttheBT getDireito() {
    return direito;
  }

  public AttheBT getPai() {
    return pai;
  }

  public void setPai(AttheBT pai) {
    this.pai = pai;
  }

  public long getBalanceio() {
    return balanceio;
  }

  public void setBalanceio(long balanceio) {
    this.balanceio = balanceio;
  }
}
