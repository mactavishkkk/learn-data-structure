package classes.collaborator;

public class Monthly extends Collaborator {
    private double salarioMensal;

    public Monthly(String nome, String departamento, double salario) {
        super(nome, departamento);
        this.salarioMensal = salario;
    }

    public double salario() {
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return String.format("%s\nSalário Mensal: %.2f", super.toString(), this.salarioMensal);
    }
}
