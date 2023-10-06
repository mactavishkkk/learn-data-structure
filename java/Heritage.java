
// Class
import classes.collaborator.Collaborator;
import classes.collaborator.Horly;
import classes.collaborator.Monthly;
import classes.collaborator.Commissioned;
import classes.collaborator.BaseCommissioned;

public class Heritage {

    public static void main(String[] args) throws Exception {
        System.out.println("\n|---- Horista ---------------------");
        Horly horista = new Horly("Avery Jordan", "Desenvolvimento", 75.5);
        horista.setHorasTrabalhadas(220);
        System.out.println(horista);

        System.out.println("\n|---- Mensalista ------------------");
        Monthly mensalista = new Monthly("Taylor Griffin", "Agile", 8500);
        System.out.println(mensalista);

        System.out.println("\n|---- Comissionado ----------------");
        Commissioned comissionado = new Commissioned("Charlene Butler", "Comercial", 25);
        comissionado.setTotalVendas(350000);
        System.out.println(comissionado);

        System.out.println("\n|---- Base Comissionado -----------");
        BaseCommissioned baseComissionado = new BaseCommissioned("Terrance Wallace", "Venda", 5, 3000);
        baseComissionado.setTotalVendas(350000);
        System.out.println(baseComissionado);

    }
}
