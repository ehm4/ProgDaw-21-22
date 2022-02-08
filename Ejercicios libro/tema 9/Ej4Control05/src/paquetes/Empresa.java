package paquetes;

public class Empresa {
  private String cif;
  private String nombre;
  private String tel;
  public Empresa(String cif, String nombre, String tel){
    this.nombre = nombre;
    this.tel = tel;
    this.cif = cif;
  }
  public void compra(Vendedor vendedor, Articulos t){
    vendedor.vende(t);
  }
}
