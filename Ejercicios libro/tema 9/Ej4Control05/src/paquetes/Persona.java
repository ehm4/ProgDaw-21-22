package paquetes;

public class Persona {
  private String email;
  private String nombre;
  public Persona(String email, String nombre){
    this.email = email;
    this.nombre = nombre;
  }
  public String obtenerEmail(){
    return email;
  }
  public String obtenerNombre(){
    return nombre;
  }
  public void compra(Vendedor vendedor, Articulos t){
    vendedor.vende(t);
  }

  
}
