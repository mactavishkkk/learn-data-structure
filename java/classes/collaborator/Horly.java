package classes.collaborator;

public class Horly extends Collaborator {
    private int horasTrabalhadas;
    private double valorPorHora;

    public Horly(String nome, String Departamento, double valorHora) {
        super(nome, Departamento);
        this.valorPorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horas) {
        this.horasTrabalhadas = horas;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public double getValorPorHora() {
        return this.valorPorHora;
    }

    public double salario() {
        return this.horasTrabalhadas * this.valorPorHora;
    }

    @Override
    public String toString() {
        return String.format("%s\nHoras Trabalhadas: %s\nValor Hora: %.2f\nSalário: R$ %.2f",
                super.toString(), this.getHorasTrabalhadas(), this.getValorPorHora(), this.salario());
    }
}
