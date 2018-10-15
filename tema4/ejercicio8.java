public class ejercicio8 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce la primera nota: ");
    Double x1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la segunda nota: ");
    Double x2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la tercera nota: ");
    Double x3 = Double.parseDouble(System.console().readLine());
    
    double media = (x1 + x2 + x3)/3;
    
    System.out.printf("La media de las notas es: %.2f\n" , media);
    
    if (media < 5) {
      System.out.print("Tienes un insuficiente. Debes estudiar mucho mas.");
    } 
    if ((media >= 5) && (media < 6)) {
      System.out.print("Tienes un suficiente. ¡Por los pelos! A estudiar un poco mas.");
    } 
    if ((media >=6) && (media < 7)) {
      System.out.print("Has logrado un bien. Seguro que puedes hacerlo mejor.");
    }
    if ((media >=7) && (media <9)) {
      System.out.print("Muy bien, un notable. Sigue asi.");
    }
    if ((media >=9) && (media <=10)) {
      System.out.print("¡Enhorabuena! Un sobresaliente. Sigue asi.");
    }

  }
}
