package paquetes;

public class Usuario extends Persona{
  private String email;
  public Usuario(String nombre, String email, String tel){
    super(tel, nombre);
    this.email = email;
  }
  public void compra(Vendedor vendedor, Articulos t){
    vendedor.vende(t);
  }
}
