package classes.collaborator;

public class BaseCommissioned extends Commissioned {
    private double salarioBase;

    public BaseCommissioned(String nome, String departamento, int comissao, double salario) {
        super(nome, departamento, comissao);
        this.salarioBase = salario;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    @Override
    public double salario() {
        return this.salarioBase + super.salario();
    }

    @Override
    public String toString() {
        return String.format("%s\nSalário Base: %.2f\n", super.toString(), this.getSalarioBase());
    }
}
