package classes.vertex;

public class Vertex {
    private String rotulo;
    private boolean visitado;

    public Vertex(String rotulo) {
        this.rotulo = rotulo;
        this.visitado = false;
    }

    public String toString() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public Object getRotulo() {
        return rotulo;
    }

    public void foiVisitado() {
        this.visitado = true;
    }

    public void naoFoiVisitado() {
        this.visitado = false;
    }

    public boolean getVisitado() {
        return visitado;
    }
}
