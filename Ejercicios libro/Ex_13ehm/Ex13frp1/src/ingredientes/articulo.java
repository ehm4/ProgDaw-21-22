package ingredientes;

public class articulo extends ingrediente_base {
  public articulo(String nombre, int cantidad){
    super(nombre, cantidad);
  }
  public int stock(){
    return super.obtenerCantidad();
  }
  public boolean gastar(int n){
    boolean gastar=true;
    if(this.stock()>n){
      gastar=false;
    } 
    else{
      super.ponerCantidad(this.stock()-n);
      gastar=true;
    }
    return gastar;
  }
}
