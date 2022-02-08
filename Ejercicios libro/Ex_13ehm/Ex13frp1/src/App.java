// Ernesto Hernández Mangas opcion A

import ingredientes.*;
import receta.*;
import restaurante.*;



public class App {
    public static void main(String[] args) throws Exception {
        restaurante miRestaurante = new restaurante ("La cocina del programador",100);
miRestaurante.provisionArticulo(new articulo("Huevo",12));
miRestaurante.provisionArticulo(new articulo("Patata",20));
miRestaurante.provisionArticulo(new articulo("Aceite",1000));
miRestaurante.provisionArticulo(new articulo("Tomate",20));
receta miReceta = new receta("Tortilla de patatas",3);
miReceta.escribirReceta("Freir patatas, batir huevo, mezclar, cuajar.");
miReceta.aniadirIngrediente(new ingrediente("Huevo",2));
miReceta.aniadirIngrediente(new ingrediente("Patata",3));
miReceta.aniadirIngrediente(new ingrediente("Aceite",50));
System.out.println(miRestaurante.listadoAlmacen());
System.out.println(miReceta);
miRestaurante.cocinaReceta(miReceta);
System.out.println("Después de cocinar la receta ...");
System.out.println(miRestaurante);
    }
}
