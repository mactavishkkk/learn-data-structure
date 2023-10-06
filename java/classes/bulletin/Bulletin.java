package classes.bulletin;

public class Bulletin {
    private float nota;
    private float frequencia;
    private boolean status;

    public Bulletin(int n, int f, boolean s) {
        setBoletim(n, f, s);
    }

    public Bulletin(boolean s) {
        this(10, 100, s);
    }

    public Bulletin() {
        this(0, 0, false);
    }

    public void setBoletim(float nota, float frequencia, boolean status) {
        setNota(nota);
        setFrequencia(frequencia);
        setStatus(status);
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getFrequencia() {
        return this.frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void obterBoletim(String proprietario) {
        String statusString = this.status ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + proprietario + " | " + "Nota: " + this.nota + " | Frequência: " + this.frequencia
                + "%" + " | Status: " + statusString);
    }

    public void inserirNota(float nota) {
        this.nota = nota;
    }

    public void excluirNota() {
        this.nota = 0;
    }

    // public void alterarNota(float novaNota) {
    // }

    public void inserirFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public void alterarStatus() {
        this.status = !this.status;
    }

    public double calcularMedia(double AM, double AC, double AS) {
        double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
        return media;
    }

    public double calcularMedia(double PM, double AS) {
        double media = PM * 0.4 + AS * 0.6;
        return media;
    }
}