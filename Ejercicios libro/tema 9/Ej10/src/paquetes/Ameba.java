package paquetes;

public class Ameba {
    private int peso;
    public Ameba(){
      this.peso=3;
    }

    public int obtenerPeso(){
      return peso;
    }
    public void ponerPeso(int n){
      this.peso=n;
    }

    public void come(Ameba a){
      this.peso+=a.peso-1;
      a.peso=0;
    }
    public void come(int n){
      this.peso+=n-1;
    }
    public String toString(){
      return "Soy una ameba y peso "+this.peso+" microgramos.";
    }
}
