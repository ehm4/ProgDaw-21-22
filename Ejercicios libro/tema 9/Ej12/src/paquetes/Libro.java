package paquetes;

public class Libro extends Publicacion {
    private boolean prestado=false;
    public Libro(String isbn, String titulo, int anio){
      super(isbn, titulo, anio);
    }
    public void presta(){
      if(this.prestado) {
        System.out.println("Lo siento, este libro ya está prestado");
      }
      else{
        this.prestado=true;
      }
    }
    public void devuelve(){
      this.prestado=false;
    }
    public String toString(){
      return super.toString()+" ("+(this.prestado ? "prestado" : "no prestado") + ")";
    }
    public boolean estaPrestado(){
      return this.prestado;
    }
}
