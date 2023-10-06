package classes.distance;

public class Distance {
    private int paiVertice;
    private int distancia;

    public Distance(int p, int d) {
        this.paiVertice = p;
        this.distancia = d;
    }

    public void setDistancia(int d) {
        this.distancia = d;
    }

    public int getDistancia() {
        return this.distancia;
    }

    public void setPaiVertice(int p) {
        this.paiVertice = p;
    }

    public int getPaiVertice() {
        return this.paiVertice;
    }
}