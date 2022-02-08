package paquetes;

public class Gato {
  private String nombre;
  private String color;
  private String raza;
  public Gato(String nombre, String raza, String color){
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
  }
  public String obtenerNombre(){
    return nombre;
  }
  public void ponerNombre(String nombre){
    this.nombre = nombre;
  }
  public String obtenerColor(){
    return color;
  }
  public void ponerColor(String color){
    this.color=color;
  }
  public String obtenerRaza(){
    return raza;
  }
  public void ponerRaza(String raza){
    this.raza = raza;
  }
}
