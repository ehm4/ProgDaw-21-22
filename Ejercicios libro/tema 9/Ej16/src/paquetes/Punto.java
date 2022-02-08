package paquetes;

public class Punto {
  private double coord1;
  private double coord2;
  public Punto(double coord1, double coord2){
    this.coord1 = coord1;
    this.coord2 = coord2;
    
  }
  public String toString(){
    return "(" + coord1 + ", " +coord2+ ")";
  }
}
