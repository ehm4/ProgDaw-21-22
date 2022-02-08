package paquetes;

public class Disco {
  private String codigo="LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public String obtenerCodigo(){
    return codigo;
  }
  public String obtenerAutor(){
    return autor;
  }
  public String obtenerTitulo(){
    return titulo;
  }
  public String obtenerGenero(){
    return genero;
  }
  public int obtenerDuracion(){
    return duracion;
  }
  public void ponerCodigo(String codigo){
    this.codigo = codigo;
  }
  public void ponerAutor(String autor){
    this.autor = autor;
  }
  public void ponerTitulo(String titulo){
    this.titulo = titulo;
  }
  public void ponerGenero(String genero){
    this.genero = genero;
  }
  public void ponerDuracion(int duracion){
    this.duracion = duracion;
  }
  public String toString(){
    String cadena= "\n------------------------------------------";
            cadena += "\nCódigo: " + this.codigo;
            cadena += "\nAutor: " + this.autor;
            cadena += "\nTítulo: " + this.titulo;
            cadena += "\nGénero: " + this.genero;
            cadena += "\nDuración: " + this.duracion;
            cadena += "\n------------------------------------------";
            return cadena;
  }

}
