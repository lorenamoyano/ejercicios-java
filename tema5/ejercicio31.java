public class ejercicio31 {
  public static void main(String[] args) {
    
    
    int altura;
    
    System.out.println("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i<altura; i++) {
      System.out.println("*");
    }
    for (int i = 0; i<(altura/2+1); i++) {
      System.out.print("* "); //si ponemos println nos saldra hacia abajo, así que debemos usar print
    }
  }
}
