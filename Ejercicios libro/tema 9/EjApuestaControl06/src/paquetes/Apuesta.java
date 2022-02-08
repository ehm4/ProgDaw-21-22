package paquetes;

public class Apuesta {

  private int[] numeros=new int[6];
  
  public Apuesta(int n1,int n2, int n3, int n4, int n5, int n6){
    boolean valido=true;
    this.numeros[0]=n1;
    this.numeros[1]=n2;
    this.numeros[2]=n3;
    this.numeros[3]=n4;
    this.numeros[4]=n5;
    this.numeros[5]=n6;	
    for(int i=0;i<6;i++){
      if(this.numeros[i]>49||this.numeros[i]<1){
        valido=false;
      }
      for(int j=0;j<i;j++){
        if(this.numeros[i]==this.numeros[j]){
          valido=false;
        }
      }
    }
    if(!valido){
      for(int i=0;i<6;i++){
        this.numeros[i]=0;
      }
    }
  }
  public Apuesta(){
    for(int i=0;i<6;i++){
      boolean repetir=false;
      do{
       this.numeros[i]=(int)(Math.random()*49)+1;
       for(int j=0;j<i&&repetir==false;j++){
         if(this.numeros[i]==this.numeros[j]){
          repetir=true;
         }
       } 
      }while(repetir);
    }
  }

  public boolean apuestaValida(Apuesta t){
    return this.numeros[0]!=0;
  }
  @Override
  public String toString(){
    String string="";
    if(this.numeros[0]==0){
      string="Error: Apuesta no válida.";
    }
    else{
    for(int i=0;i<6;i++){
      string+=this.numeros[i]+" ";
    }  
    }
    return string;
  }
}
