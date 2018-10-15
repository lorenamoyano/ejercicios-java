import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    
    int numero1;
    int numero2;
    int resultado;
    
    Scanner escanerMultiplicacion = new Scanner(System.in);
    
    System.out.println("Introduzca los numeros separados por espacio:");
    numero1 = escanerMultiplicacion.nextInt();
    numero2 = escanerMultiplicacion.nextInt();
    
    resultado = numero1 * numero2;
    
    System.out.printf ("%d * %d = %d\n" , numero1,numero2,resultado);
  }
}
