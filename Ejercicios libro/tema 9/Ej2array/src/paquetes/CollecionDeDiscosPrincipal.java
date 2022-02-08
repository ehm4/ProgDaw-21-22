package paquetes;
import java.util.Scanner;
public class CollecionDeDiscosPrincipal {
  
  
  static int N=100;
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Disco[] album=new Disco[N];
    for(int i=0;i<N;i++){
      album[i]=new Disco();
    }
    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      switch(opcion){
        case 1:
        int opcion2=0;
        System.out.println("\n¿Qué listado desea visualizar?");
        System.out.println("1.Listado completo.");
        System.out.println("2.Por autor.");
        System.out.println("3.Por genero.");
        System.out.println("4.Por duracion.");
        opcion2=Integer.parseInt(System.console().readLine());
        switch(opcion2){
          case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for(i = 0; i < N; i++) {
          if (!album[i].obtenerCodigo().equals("LIBRE")) {
          System.out.println(album[i]);
          }
          }
          break;
          case 2:
          String autorpedido="";
          System.out.println("¿De qué autor desea ver el listado?");
          autorpedido=System.console().readLine();
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for(i=0;i<N;i++){
            if(album[i].obtenerAutor().equals(autorpedido)){
              System.out.println(album[i]);
            }
          }
          break;
          case 3:
          String generopedido="";
          System.out.println("¿De qué género desea ver el listado?");
          autorpedido=s.nextLine();
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for(i=0;i<N;i++){
            if(album[i].obtenerAutor().equals(generopedido)){
              System.out.println(album[i]);
            }
          }
          break;
          case 4:
          int duracionpedida1;
          int duracionpedida2;
          System.out.println("¿Entre que duración desea ver el listado?");
          duracionpedida1=Integer.parseInt(System.console().readLine());
          duracionpedida2=Integer.parseInt(System.console().readLine());
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for(i=0;i<N;i++){
            if(duracionpedida1>=album[i].obtenerDuracion()&&album[i].obtenerDuracion()<=duracionpedida2){
              System.out.println(album[i]);
            }
          }
          break;
        }
        break;
        case 2: 
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        primeraLibre=-1;
        int contador=0;
        boolean espacio=false;
        do{
          primeraLibre++;
          if(!((album[primeraLibre].obtenerCodigo()).equals("LIBRE"))){
            contador++;
            if(contador>0){
            espacio=false;
          }
          else if(contador==0){
            espacio=true;
          }
          }
        }
        while(!((album[primeraLibre].obtenerCodigo()).equals("LIBRE")));
        if(espacio){
          System.out.println("Lo siento, deber borrar un disco antes de meter otro, no hay espacio");
        }
        else{
        System.out.println("Por favor, introduzca los datos del disco.");
        System.out.print("Código: ");
        codigoIntroducido = System.console().readLine();
        album[primeraLibre].ponerCodigo(codigoIntroducido);
        System.out.print("Autor: ");
        autorIntroducido = System.console().readLine();
        album[primeraLibre].ponerAutor(autorIntroducido);
        System.out.print("Título: ");
        tituloIntroducido = System.console().readLine();
        album[primeraLibre].ponerTitulo(tituloIntroducido);
        System.out.print("Género: ");
        generoIntroducido = System.console().readLine();
        album[primeraLibre].ponerGenero(generoIntroducido);
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(System.console().readLine());
        album[primeraLibre].ponerDuracion(duracionIntroducida);
        }
        break;
        case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar:");
        codigoIntroducido = System.console().readLine();
        i = -1;
        do {
        i++;
        } while (!((album[i].obtenerCodigo()).equals(codigoIntroducido)));
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
        System.out.println("Código: " + album[i].obtenerCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
        album[i].ponerCodigo(codigoIntroducido);
        }
        System.out.println("Autor: " + album[i].obtenerAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = System.console().readLine();
        if (!autorIntroducido.equals("")) {
        album[i].ponerAutor(autorIntroducido);
        }
        System.out.println("Título: " + album[i].obtenerTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = System.console().readLine();
        if (!tituloIntroducido.equals("")) {
        album[i].ponerTitulo(tituloIntroducido);
        }
        System.out.println("Género: " + album[i].obtenerGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = System.console().readLine();
        if (!generoIntroducido.equals("")) {
        album[i].ponerGenero(generoIntroducido);
        }
        System.out.println("Duración: " + album[i].obtenerDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = System.console().readLine();
        if (!duracionIntroducidaString.equals("")) {
        album[i].ponerDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        break;
        case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = System.console().readLine();
        boolean existe=true;
        i = -1;
        do {
        i++;
        if(!((album[i].obtenerCodigo()).equals(codigoIntroducido))){
          existe=false;
        }
        } while (!((album[i].obtenerCodigo()).equals(codigoIntroducido)));
        if(existe){
          System.out.println("Lo siento, no existe el código introducido");
        }
        else{
        album[i].ponerCodigo("LIBRE");
        System.out.println("Album borrado.");
        }
        break;
        default:
        }
      }
      while (opcion != 5);  
      s.close();  
  }
}
