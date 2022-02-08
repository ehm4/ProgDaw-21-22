package ingredientes;



public class ingrediente_base {
  private String nombre;
  private int cantidad;
  public ingrediente_base(String nombre, int cantidad){
    this.nombre= nombre;
    this.cantidad= cantidad;
  }

  public String obtenerNombre(){
    return this.nombre;
  }
  protected int obtenerCantidad(){
    return this.cantidad;
  }
  protected void ponerCantidad(int n){
    this.cantidad = n;
  }
  public String toString(){
    return this.nombre+" -> Cantidad: "+this.cantidad;
  }
}
