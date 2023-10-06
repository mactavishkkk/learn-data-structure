import classes.list.List;
import classes.person.Person;
import classes.sensor.Sensor;

public class BoundList {

  public static void main(String[] args) {
    // List personList = new List();
    // Person person = new Person();

    // person.setName("Pedro");
    // person.setEmail("Pedro@gmail.com");
    // person.setCpf("12345678900");

    // Person personTwo = new Person();

    // personTwo.setName("Marcos");
    // personTwo.setEmail("Marcos@gmail.com");
    // personTwo.setCpf("12345678900");

    // personList.insereInicio(person);
    // personList.insereInicio(personTwo);
    // personList.imprimeLista();

    // personList.liberaLista();
    // personList.imprimeLista();

    List sensorList = new List();

    Sensor sensorBeltA = new Sensor("23/08/10 20:34", 134.74);
    Sensor sensorBeltB = new Sensor("23/08/10 20:51", 324.74);
    Sensor sensorBeltC = new Sensor("23/08/10 21:14", 214.74);
    Sensor sensorBeltD = new Sensor("23/08/10 21:44", 534.74);
    Sensor sensorBeltE = new Sensor("23/08/10 22:04", 734.74);

    sensorList.insereInicio(sensorBeltA);
    sensorList.insereInicio(sensorBeltB);
    sensorList.insereInicio(sensorBeltC);
    sensorList.insereInicio(sensorBeltD);
    sensorList.insereInicio(sensorBeltE);

    sensorList.imprimeLista();

    System.out.println("Sensores que registraram uma folgas incorretas: ");

    Sensor a;
    while (!sensorList.listaVazia()) {
      a = (Sensor) sensorList.removeInicio();
      if ((a.getFolga() > 300) && (a.getFolga() < 500)) {
        System.out.println(a + "\n");
      }
    }

    sensorList.imprimeLista();
  }
}
