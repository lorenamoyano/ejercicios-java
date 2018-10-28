public class ejercicio5 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int numero;
    
    for (int i = 0; i<= 50; i++) {
      numero = ((int)(Math.random()*100)+100);
      System.out.print(numero + " ");
      suma += numero;
      if (numero < minimo) {
        minimo = numero;
      } 
      
      if (numero > maximo) {
        maximo = numero;
      }
      
    }
    
    System.out.print("\nLa media es: " + (suma/50));
    System.out.print("\nEl maximo es: " + maximo);
    System.out.print("\nEl minimo es: " + minimo);
  }
}
