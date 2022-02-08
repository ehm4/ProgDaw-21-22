package paquetes;

public class tirada {
  private dado[] dado;
  private int numcaras;
  private int dados;
  private int privilegiado;
  public tirada(int n, int n2, int privilegiado){
    dado=new dado[n];
    this.numcaras=n2;
    this.dados=n;
    if(privilegiado>=1&&privilegiado<=n2){
      this.privilegiado=privilegiado;
    }
    else{
      // Como no está cerrado se elige uno aleatorio
      this.privilegiado=(int)(Math.random()*(this.numcaras+1)+1);
    }
  }
  @Override
  public String toString() {
    String string="";
    boolean repeticion=true;
    do{
      int repeticiones=0;
      for(int i=0;i<this.dados;i++){
        int opcion=(int)(Math.random()*2);
        if(opcion==0){
          this.dado[i]=new dado((int)(Math.random()*(this.numcaras+1)+1));
        string+=this.dado[i]+" ";
        }
        else if(opcion==1){
          this.dado[i]=new dado(this.privilegiado);
        }
      }
      string+="\n";
      for(int i=this.dados;i>this.dados;i--){
        if(this.dado[i].obtenerValor()==this.dado[i-1].obtenerValor()){
          repeticiones++;
        }
      }
      if(repeticiones==this.dados-1){
        repeticion=false;
      }
    }while(repeticion);
    return string;
  }
}
