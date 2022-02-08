package paquetes;

public class Piramide {
  private int altura;
  private static int piramidesCreadas;
  public Piramide(int altura){
    this.altura=altura;
    piramidesCreadas++;
  }
  public static int obtenerPiramidesCreadas(){
    return piramidesCreadas;
  }
  public String toString(){
    String piramide="";
    int espacios=this.altura-1;
    int caracteres=1;
    for(int i=0;i<this.altura;i++){
      for(int j=0;j<espacios;j++){
        piramide+=" ";
      }
      for(int j=0;j<caracteres;j++){
        piramide+="*";
      }
      espacios--;
      caracteres+=2;
      piramide+="\n";
    }

    return piramide;
  }
}
