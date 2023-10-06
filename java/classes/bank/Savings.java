package classes.bank;

public class Savings extends Account {
    private Double taxaRendimento;

    // Construtor
    public Savings(String cliente, Double saldo, Double taxa) {
        super(cliente, saldo);
        this.taxaRendimento = taxa;
    }

    public Double getTaxaRendimento() {
        return this.taxaRendimento;
    }

    public void setTaxaRendimento(Double taxa) {
        this.taxaRendimento = taxa;
    }

    public Double consultaSaldoTotal() {
        return taxaRendimento * super.consultaSaldo();
    }
}