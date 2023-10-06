
// Class
import classes.bulletin.Bulletin;

// Java
import java.util.Scanner;

public class PolymorphismTwo {

    public static void main(String[] args) throws Exception {
        int nota;
        int frequencia;
        boolean status;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a nota inicial: ");
        nota = ler.nextInt();
        System.out.println("Insira a frequência inicial: ");
        frequencia = ler.nextInt();
        System.out.println("Insira o status inicial: ");
        status = ler.nextBoolean();

        Bulletin B1 = new Bulletin(nota, frequencia, status);
        B1.obterBoletim("Joao");

        Bulletin B2 = new Bulletin(true);
        B2.obterBoletim("Pedro");

        Bulletin B3 = new Bulletin();
        B3.obterBoletim("Paulo");
    }
}
