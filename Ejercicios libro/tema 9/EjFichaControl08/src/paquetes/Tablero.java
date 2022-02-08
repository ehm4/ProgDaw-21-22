package paquetes;
import java.util.ArrayList;
public class Tablero implements ConjuntoDeFichas{
  private Ficha [] tablero;
  private int numfichas=0;
  public Tablero(int longitud){
    tablero=new Ficha[longitud];
  }
  public void aniadeFicha(Ficha t){
    if(numfichas==0){
      this.tablero[numfichas++]=t;
    }
    else{
    if(valorDerecha(t)==valorDerecha(this.tablero[numfichas++])){
      
    }
    }
  }
  @Override
  public String toString(){
    String tostring="";
      for(int j=0;j<this.numfichas;j++){
        tostring+=this.tablero[j];
        if((j+1)%10==0){
          tostring+="\n";
        }
      }
      tostring+="\n";
    return tostring;
  }
}
