package classes.sensor;

public class Sensor {

  private String tempo;
  private Double folga;

  public Sensor(String tempo, Double folga) {
    this.tempo = tempo;
    this.folga = folga;
  }

  public String getTempo() {
    return tempo;
  }

  public Double getFolga() {
    return folga;
  }

  public String toString() {
    return "Tempo: " + tempo + " | Folga: " + folga;
  }
}
