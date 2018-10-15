import java.util.Scanner;
public class ejercicio6 {
  public static void main(String [] args) {
    
    Scanner area = new Scanner(System.in);
    
    System.out.print("Introduce dos numeros separados por espacio para calcular el area de un triangulo: ");
    
    double x1 = area.nextInt();
    double x2 = area.nextInt();
    
    double areaTriangulo = (x1 * x2)/2;
    
    System.out.printf("El area del triangulo es: " + areaTriangulo);
  }
}
