package paquetes;

public class Articulos {
  private String nombre;
  private int cantidad;
  public Articulos(String nombre, int cantidad){
    this.nombre = nombre;
    this.cantidad = cantidad;
  }
  public String obtenerNombre(){
    return this.nombre;
  }
  public int  obtenerCantidad(){
    return this.cantidad;
  }
  public void ponerCantidad(int n){
    cantidad=n;
  }
}
