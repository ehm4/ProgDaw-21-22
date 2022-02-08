package paquetes;
import java.text.DecimalFormat;
public class Movil extends Terminal{
  private String tarifa;
  private double totalTarificado;
  public Movil (String numero, String tarifa){
    super(numero);
    this.tarifa=tarifa;
    this.totalTarificado=0;
  }

  public void llama(Terminal t, int segundosDeLLamada){
    super.llama(t, segundosDeLLamada);
    double minutos=(double) segundosDeLLamada/60;
    switch(this.tarifa){
      case "rata":
      this.totalTarificado+=minutos*0.06;
      break;
      case"mono":
      this.totalTarificado+=minutos*0.16;
      break;
      case"bisonte":
      this.totalTarificado+=minutos*0.30;
      break;
    }
  }
  public String toString(){
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº " + this.obtenerNumero()
    + " - " + this.obtenersegundos()
    + "s de conversación - tarificados "
    + formatoEuros.format(this.totalTarificado) + " euros";
    
  }

}
