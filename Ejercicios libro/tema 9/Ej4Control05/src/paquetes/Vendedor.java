package paquetes;

public class Vendedor extends Persona {
  private String cargo;
  private Articulos[] genero=new Articulos[100];
  private int codigo=0;
  public Vendedor(String nombre, String email, String cargo){
    super(nombre, email);
    this.cargo = cargo;
  }
// genero[codigo++]=new Articulos( nombre,  cantidad);
  public void vende(Articulos t){
    for(int i=0;i<codigo;i++){
      if(t.obtenerNombre().equals(genero[i].obtenerNombre())){
        genero[i].ponerCantidad(genero[i].obtenerCantidad()+t.obtenerCantidad());
      }
      else{
      genero[codigo++]=t;
      }
    }
  }
  @Override
  public String toString(){
    String string= "Nombre: "+super.obtenerEmail()+"\nCorreo electrónico: "+super.obtenerNombre()+"\nCargo: "+this.cargo+"\nVentas realizadas\n===============\n";
    for(int i=0;i<codigo;i++){
      string= string + genero[i].obtenerNombre()+", "+genero[i].obtenerCantidad()+"\n";
    }
    return string;
  }
}
