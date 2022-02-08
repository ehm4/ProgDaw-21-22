package paquete;
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos){
      this.hora=hora;
      this.minutos=minutos;
      this.segundos=segundos;
    }
    public String toString(){
      return this.hora+"h "+this.minutos+"m "+this.segundos+"s. ";
    }

    public void suma(Tiempo t){
      int aux=this.segundos+t.segundos;
      int aux2=this.minutos+t.minutos;
      int aux3=this.hora+t.hora;
      this.segundos=(aux)%60;
      this.minutos=(aux2)%60+aux/60;
      this.hora=aux3+aux2/60;
    }
    public void resta(Tiempo t){
      int aux=this.segundos-t.segundos;
      int aux2=this.minutos-t.minutos;
      int aux3=this.hora-t.hora;
      this.segundos=aux;
      this.minutos=aux2;
      this.hora=aux3;
      if(this.segundos<0){
        this.segundos+=60;
        this.minutos--;
      }
      if(this.minutos<0){
        this.hora--;
        this.minutos+=60;
      }
    }
}
