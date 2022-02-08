package paquetes;

public class Pizza {
    private static int totalPizzaPedida=0;
    private static int totalPizzaServida=0;

    private String tamaño;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamaño){
      this.tipo=tipo;
      this.tamaño=tamaño;
      this.estado="pedida";
      totalPizzaPedida++;
    }
    public String toString(){
      return "pizza "+this.tipo+" "+this.tamaño+", "+this.estado;
    }
    public static int obtenerTotalPedida(){
      return totalPizzaPedida;
    }
    public static int obtenerTotalServida(){
      return totalPizzaServida;
    }
    public void sirve(){
      if(this.estado.equals("pedida")){
        this.estado="servida";
      totalPizzaServida++;
      }
      else{
        System.out.println("esa pizza ya se ha servido");
      }
    }
}
