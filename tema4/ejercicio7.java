public class ejercicio7 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce la primera nota: ");
    Double x1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la segunda nota: ");
    Double x2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la tercera nota: ");
    Double x3 = Double.parseDouble(System.console().readLine());
    
    double media = (x1 + x2 + x3)/3;
    
    System.out.printf("La media de las notas es: %.2f\n" , media);

  }
}
