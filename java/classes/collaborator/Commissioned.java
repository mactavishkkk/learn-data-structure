package classes.collaborator;

import interfaces.DigitalSignature;

public class Commissioned extends Collaborator implements DigitalSignature {
    private double totalVendas;
    private double comissao;
    private int senha;

    public Commissioned(String nome, String departamento, double comissao) {
        super(nome, departamento);
        this.comissao = comissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public double salario() {
        return this.totalVendas * (this.comissao / 100.);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("%s\nTotal de Vendas: %s\nComissão por Venda: %.2f\nSalário: %.2f",
                super.toString(), this.getTotalVendas(), this.getComissao(), this.salario());
    }

    @Override
    public long hash() {
        long hash = (senha % 3) * super.hashCode();
        return hash;
    }

    @Override
    public boolean estaAutenticado(String senhaDigitada) {
        return senha == Integer.parseInt(senhaDigitada);
    }

}
