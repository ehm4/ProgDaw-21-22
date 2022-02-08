package paquetes;

public class Linea {
  private Punto origen;
  private Punto fin;
  public Linea(Punto origen, Punto fin){
    this.origen = origen;
    this.fin=fin;
  }
  public String toString(){
    return "Línea formada por los puntos "+this.origen+" y "+this.fin;
  }
}
