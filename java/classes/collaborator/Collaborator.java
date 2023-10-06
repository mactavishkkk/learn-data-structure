package classes.collaborator;

public abstract class Collaborator {
    protected String nome;
    protected String departamento;

    public Collaborator(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public abstract double salario();

    @Override
    public String toString() {
        return String.format("Colaborador: %s\nDepartamento: %s\n---\nCódigo: %s", this.getNome(),
                this.getDepartamento(), this.hashCode());
    }

    @Override
    public int hashCode() {
        return 7 * this.nome.hashCode() + 11 * this.departamento.hashCode();
    }
}