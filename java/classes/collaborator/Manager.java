package classes.collaborator;

import java.util.List;
import java.util.stream.Collectors;

import interfaces.Authenticate;

public class Manager extends Collaborator implements Authenticate {

    private double salarioBase;
    private List<Collaborator> colaboradores;
    private String senha;

    public Manager(String nome, String departamento,
            double salarioBase, List<Collaborator> colaboradores) {
        super(nome, departamento);
        this.salarioBase = salarioBase;
        this.colaboradores = colaboradores;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public List<Collaborator> getColaboradores() {
        return colaboradores;
    }

    private double getBonus() {
        List<Collaborator> colaboradores = this.colaboradores
                .stream()
                .filter(colaborador -> colaborador instanceof Commissioned)
                .collect(Collectors.toList());

        double total = colaboradores
                .stream()
                .mapToDouble(Collaborator::salario)
                .sum();

        return total * 0.1;
    }

    @Override
    public boolean estaAutenticado(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }

    @Override
    public double salario() {
        return salarioBase + getBonus();
    }

    @Override
    public String toString() {
        return String.format("%s\nSalário: R$ %.2f",
                super.toString(), this.salario());
    }

}
