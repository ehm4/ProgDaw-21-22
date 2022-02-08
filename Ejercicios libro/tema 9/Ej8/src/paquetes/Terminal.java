package paquetes;

public class Terminal {
  private String numero;
  private int segundos;
  public Terminal(String numero) {
  this.numero = numero;
  this.segundos = 0;
  }
  public String obtenerNumero() {
  return numero;
  }
  public void ponerNumero(String numero) {
  this.numero = numero;
  }
  public int obtenersegundos() {
  return segundos;
  }
  public void ponersegundos(int segundos) {
  this.segundos = segundos;
  }

    public void llama(Terminal t, int segundos){
      this.segundos+=segundos;
      t.segundos+=segundos;
    }
    public String toString(){
      return "Nº "+this.numero+" - "+this.segundos+"s de conversacion"; 
    }
}
