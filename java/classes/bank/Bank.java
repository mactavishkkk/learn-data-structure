package classes.bank;

public class Bank {

    private final Long NUMERO;
    private String nome;
    private String nomePresidente;

    public Bank(Long numero, String nome, String nomePresidente) {
        this.NUMERO = numero;
        this.nome = nome;
        this.nomePresidente = nomePresidente;
    }

    public long getNumero() {
        return this.NUMERO;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePresidente() {
        return this.nomePresidente;
    }

    public void setNomePresidente(String nome) {
        this.nomePresidente = nome;
    }
}
