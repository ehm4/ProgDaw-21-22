package paquetes;

public class Articulo {
  private String descripcion;
  private String codigo="LIBRE";
  private int preciocompra;
  private int precioventa;
  private int stock=0;

  public String obtenerCodigo(){
    return codigo;
  }
  public String obtenerDescripcion(){
    return descripcion;
  }
  public int obtenerPreciocompra(){
    return preciocompra;
  }
  public int obtenerPrecioventa(){
    return precioventa;
  }
  public int obtenerStock(){
    return stock;
  }

  public void ponerCodigo(String codigo){
    this.codigo = codigo;
  }
  public void ponerPreciocompra(int preciocompra){
    this.preciocompra = preciocompra;
  }
  public void ponerPrecioventa(int precioventa){
    this.precioventa = precioventa;
  }
  public void ponerDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
  public void ponerStock(int stock){
    this.stock = stock;
  }
  public String toString(){
    String listado= "\n------------------------------------------";
            listado += "\nCódigo: " + this.codigo;
            listado += "\nPrecio de compra: " + this.preciocompra;
            listado += "\nPrecio de venta: " + this.precioventa;
            listado += "\nDescripción: " + this.descripcion;
            listado += "\nStock: " + this.stock;
            listado += "\n------------------------------------------";

    return listado;
  }
}
