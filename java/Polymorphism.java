
// Class
import classes.bulletin.Bulletin;

// Java
import javax.swing.JOptionPane;

public class Polymorphism {

    public static void main(String[] args) throws Exception {
        Bulletin boletimJoao = new Bulletin(10, 20, false);
        Bulletin boletimPedro = new Bulletin(5, 10, true);

        double mediaJoaoGraduacao = boletimJoao.calcularMedia(3.5, 4.0, 3);
        double mediaPedroPosGraduacao = boletimPedro.calcularMedia(5.0, 4.0);

        JOptionPane.showMessageDialog(
                null, "A média do aluno de graduação é: " + mediaJoaoGraduacao
                        + "\nA média do aluno de pós graduação é: " + mediaPedroPosGraduacao,
                "Boletim", JOptionPane.INFORMATION_MESSAGE);

    }
}
