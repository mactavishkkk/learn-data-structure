package classes;

public class No {
    private int id;
    private Object elemento;
    private No esquerdo;
    private No direito;

    public No(int id, Object elemento, No esquerdo, No direito) {
        this.id = id;
        this.elemento = elemento;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public boolean isFestivo() {
        if (direito == null) {
            return true;
        }
        return false;
    }
}