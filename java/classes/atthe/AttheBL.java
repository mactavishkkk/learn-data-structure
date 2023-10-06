package classes.atthe;

public class AttheBL {

  private AttheBL proximo;
  private Object elemento;

  public AttheBL(Object elemento, AttheBL proximo) {
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public void setProximo(AttheBL proximo) {
    this.proximo = proximo;
  }

  public AttheBL getProximo() {
    return proximo;
  }

  public void setElemento(Object elemento) {
    this.elemento = elemento;
  }

  public Object getElemento() {
    return elemento;
  }
}
