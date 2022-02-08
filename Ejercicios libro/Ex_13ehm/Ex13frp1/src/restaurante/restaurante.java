package restaurante;

import ingredientes.*;
import receta.*;

public class restaurante {
    private String nombre;
    private articulo [] articulo;
    private int numeroarticulo;
    public restaurante(String nombre, int maxcapacidad){
        articulo=new articulo[maxcapacidad];
        this.nombre = nombre;
        this.numeroarticulo = 0;
    }
    public boolean provisionArticulo(articulo t){
        boolean capacidad=false;
            if(numeroarticulo>=articulo.length){
             return false;  
            }
            else{
              articulo[numeroarticulo]=t;
              capacidad=true;
            }
        return capacidad;
      }
      public boolean cocinaReceta(receta r){
        for(int i=0;i<this.numeroarticulo;i++){
          boolean sepuede=false;
          for(int j=0;j<this.numeroarticulo;j++){
            if((articulo[i].obtenerNombre()).equals(r.obtenerIngrediente(j).obtenerNombre()) && (articulo[i].stock() < r.obtenerIngrediente(j).obtenerCantidad())){
              return false;
            }
            if((articulo[i].obtenerNombre()).equals(r.obtenerIngrediente(j).obtenerNombre())){
              sepuede=true;
            }
          }
          if(!sepuede){
            return false;
          }
        }
          for(int i=0;i<this.numeroarticulo;i++){
            for(int j=0;j<r.numeroIngredientes();j++){
              if((articulo[i].obtenerNombre()).equals(r.obtenerIngrediente(j).obtenerNombre())){ 
                articulo[i].gastar(r.obtenerIngrediente(j).obtenerCantidad());
              }
            }
          }
          return true;
      }
      public String listadoAlmacen(){
        String string="";
        string+="Listado de artículos del almacén del restaurante '"+this.nombre+"':";
        for(int i=0;i<this.numeroarticulo;i++){
             string+="- "+this.articulo[i].obtenerNombre()+" -> Cantidad: "+this.articulo[i].stock()+"\n"; 
          }
        return string; 
      }
}
