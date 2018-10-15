import java.util.Scanner;
public class ejercicio8 {
  public static void main(String[] args) {
    
    Scanner salario = new Scanner (System.in);
    
    System.out.print("Introduce el numero de horas trabajadas: ");
    
    double numeroHoras = salario.nextDouble();
    
    
    double horas = (numeroHoras*12);
    
    System.out.printf("El salario es: " + horas);
  }
}
    
