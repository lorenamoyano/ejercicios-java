import java.util.Scanner;
public class ejercicio5 {
  public static void main (String[] args) {
    
    Scanner area = new Scanner(System.in);
    
    System.out.print("Introduce dos numeros para calcular el area: ");
    
    int x1 = area.nextInt();
    int x2 = area.nextInt();
    
    int areaRectangulo = (x1*x2);
    
    System.out.print("El area del rectangulo es: " + areaRectangulo);
  }
}
