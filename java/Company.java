
// Class
import classes.collaborator.Collaborator;
import classes.collaborator.Horly;
import classes.collaborator.Manager;
import classes.collaborator.Monthly;
import classes.collaborator.PayRoll;
import classes.collaborator.Commissioned;

import java.util.List;
import java.util.Scanner;

import classes.collaborator.BaseCommissioned;

public class Company {

    public static void main(String... args) {
        Horly horista = new Horly("Avery Jordan", "Desenvolvimento", 75.5);
        horista.setHorasTrabalhadas(220);

        Commissioned comissionado = new Commissioned("Charlene Butler", "Comercial", 25);
        comissionado.setTotalVendas(350000);

        BaseCommissioned baseComissionado = new BaseCommissioned("Terrance Wallace", "Venda", 5, 3000);
        baseComissionado.setTotalVendas(150000);

        List<Collaborator> colaboradores = List.of(
                horista,
                new Monthly("Christian Cunningham", "Infraestrutura", 7000),
                new Monthly("Taylor Griffin", "Agile", 8500),
                comissionado,
                baseComissionado,
                new Monthly("Brennan Sims", "Engenharia", 15600));

        Manager gerente = new Manager("Juliana", "Tecnologia", 20000, colaboradores);
        gerente.setSenha("1234");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Informe sua senha:\n> ");
            String senha = scanner.next();

            if (gerente.estaAutenticado(senha)) {
                PayRoll folha = new PayRoll(gerente);
                folha.geraRelatorio();
            } else {
                System.err.println("Falha ao autenticar colaborador");
            }
        }
    }
}
