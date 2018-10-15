public class ejercicio14 {
  public static void main(String[] args) {
    
      int base;
      int exponente;
      int solucion =1;
      
      System.out.print("Introduce la base y el exponente positivos \n");
      System.out.print("Introduce la base: ");
      base = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce el exponente: ");
      exponente = Integer.parseInt(System.console().readLine());
      
      for (int i = 1; i<=exponente; i++) {
        solucion = solucion * base;
      } 
      System.out.println("El resultado de " + base + "^" + exponente + " es: " + solucion);
      
  }
}
