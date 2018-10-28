public class ejercicio1 {
  public static void main(String[] args) {
    
    int tiradaDados = 0;
    int suma = 0;
    
    for (int i = 1; i<=3; i++) {
      tiradaDados = (int)(Math.random()*6) + 1;
      System.out.print(tiradaDados + " ");
      suma += tiradaDados;
    }
    System.out.print("\nLa suma es: " + suma);
  }
}
