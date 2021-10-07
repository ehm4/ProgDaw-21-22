public class Ejercicio10{
    public static void main(String[]args){
      
      String b, v, r, az, n, a;
      r="\033[31m";
      v="\033[32m";
      b="\033[37m";
      az="\033[34m";
      n="\033[30m";
      a="\033[33m";
      
      System.out.println(a+"████"+az+"█████████████████████");
      System.out.println(a+"████"+az+"██████"+r+"████"+az+"███████████");
      System.out.println(az+"████████"+r+"████████"+az+"█████████");
      System.out.println(az+"██████"+r+"████████████"+az+"███████");
      System.out.println(az+"████"+r+"████████████████"+az+"█████");
      System.out.println(az+"████"+b+"████████████████"+az+"█████");
      System.out.println(az+"████"+b+"██"+az+"███"+b+"██████"+az+"███"+b+"██"+az+"█████");
      System.out.println(az+"████"+b+"███████"+n+"██"+b+"███████"+az+"█████");
      System.out.println(az+"████"+b+"███████"+n+"██"+b+"███████"+az+"█████");
      System.out.println(v+"█████████████████████████");
      System.out.println(v+"█████████████████████████");
      System.out.println(v+"█████████████████████████");
    }
  }
