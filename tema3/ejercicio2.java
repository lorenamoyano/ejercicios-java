import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    double euros;
    double pesetasxeuro;
    double resultado;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca el importe en euros: ");
    euros = s.nextDouble();
    pesetasxeuro = 166.386;
    
    resultado = euros * pesetasxeuro;
    
    System.out.printf ("%.2f * %.3f = %.0f\n" , euros, pesetasxeuro, resultado);
  }
}
