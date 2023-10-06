package classes.collaborator;

// Java
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PayRoll {

    private List<Collaborator> colaboradores;
    private LocalDate hoje;

    public PayRoll(Manager gerente) {
        this.colaboradores = new ArrayList<Collaborator>(gerente.getColaboradores());
        this.colaboradores.add(gerente);
        this.hoje = LocalDate.now();
    }

    public void geraRelatorio() {
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printTitulo();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printColaboradores();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        printTotalFolha();
        System.out.println("|" + repeteCaracter('-', 80) + "|");
    }

    private void printTitulo() {
        String titulo = String.format("Folha de Pagamento - Mês: %s Ano: %d",
                hoje.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")),
                hoje.getYear());
        System.out.printf("| %-79s|\n", titulo);
    }

    private void printColaboradores() {
        System.out.printf("| %-39s| %-37s |\n", "Nome", "Salário");
        System.out.println("|" + repeteCaracter('-', 80) + "|");
        colaboradores.forEach(
                colaborador -> System.out.printf("| %-39s|%38s |\n",
                        colaborador.getNome(),
                        String.format("R$ %.2f", colaborador.salario())));
    }

    private void printTotalFolha() {
        double total = colaboradores
                .stream()
                .mapToDouble(Collaborator::salario)
                .sum();
        System.out.printf("| %-40s%38s |\n",
                "Total de pagamentos",
                String.format("R$ %.2f", total));
    }

    private String repeteCaracter(char c, int tamanho) {
        char[] caracteres = new char[tamanho];
        Arrays.fill(caracteres, c);
        return new String(caracteres);
    }
}
