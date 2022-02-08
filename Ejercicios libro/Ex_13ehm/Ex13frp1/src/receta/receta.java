package receta;

import ingredientes.*;

public class receta {
  private String nombre;
  private ingrediente [] ingrediente;
  private String instrucciones;
  private int cantidadIngredientes;
  public receta(String nombre, int maxcantidad){
    this.nombre = nombre;
    this.ingrediente=new ingrediente[maxcantidad];
    this.cantidadIngredientes=0;
  }
  public boolean aniadirIngrediente(ingrediente t){
    boolean capacidad=false;
    if(cantidadIngredientes>=ingrediente.length){
      return capacidad;
    }
    else{
      ingrediente[cantidadIngredientes]=t;
      capacidad=true;
    }
    return capacidad;
  }
  public void escribirReceta(String receta){
    this.instrucciones=receta;
  }
  @Override
  public String toString(){
    String result="";
    result+="Receta: "+this.nombre+"\n--------------------"+"\n*Ingredientes:\n";
    for(int i=0;i<this.cantidadIngredientes;i++){
       result+="- "+this.ingrediente[i]+"\n"; 
    }
    result+="Instrucciones: "+this.instrucciones;
    return result;
  }
  public int numeroIngredientes(){
    return this.cantidadIngredientes;
  }
  public ingrediente obtenerIngrediente(int n){
    if(n<0||n>= cantidadIngredientes){
      return null;
    }
    else{
      return this.ingrediente[n];
    }
  }
}
