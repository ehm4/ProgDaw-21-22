package paquetes;

public class Monton implements ConjuntoDeFichas{
  private Ficha [] monton;
  private int numerofichas=0;
  public Monton(int longitud){
    monton=new Ficha[longitud];
  }
  public void aniadeFicha(Ficha t){
    this.monton[this.numerofichas++]=t;
  }
  @Override
  public String toString(){
    String tostring="";
      for(int j=0;j<this.numerofichas;j++){
        tostring+=this.monton[j]+"  ";
        if((j+1)%10==0){
          tostring+="\n";
        }
      }
      tostring+="\n";
    return tostring;
  }
  public Ficha sacaFichaAlAzar(){
    if(numerofichas==0){
      return null;
    }
    else{
      return monton[(int)(Math.random()*this.numerofichas)];
    }
  }
  public void juntaMontones(Monton m){
    for(int i=this.numerofichas;i<this.numerofichas+m.numerofichas;i++){
      this.monton [i]=m.monton[i-this.numerofichas];
    }
    this.numerofichas+=m.numerofichas;
  }
  public void inicializaMonton(){
    for(int i=0;i<7;i++){
      for(int j=0;j<7;j++){
        this.monton[i+j]=new Ficha(i,j);
      }
    }
  }
}
