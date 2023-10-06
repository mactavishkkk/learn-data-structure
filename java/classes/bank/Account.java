package classes.bank;

public class Account {
    private String cliente;
    private Long numero;
    private Double saldo;
    private static Long totalContas = 1L;

    // Construtor
    public Account (String cliente, Double saldo){
        this.cliente = cliente;
        // this.numero++; // This not work
        this.numero = Account.totalContas++; // But this, yes
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getCliente(){
        return this.cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public Long getNumero(){
        return this.numero;
    }

    public void setNumero(Long numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public final Double consultaSaldo() {
        return saldo;
    }
}
