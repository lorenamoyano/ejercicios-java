public class ejercicio17 {
  public static void main(String[] args) {
    
    int numero = 0;
    int suma = 0;
    
    System.out.print("Este programa suma los siguientes 100 numeros al numero introducido. \n");
    System.out.print("El numero debe ser positivo y entero.");
    
    do {
      
      System.out.print("Introduce el numero: ");
      numero = Integer.parseInt(System.console().readLine());
    
      if (numero <0) {
      System.out.print("El numero no es correcto. \n");
      }
    } while (numero <0);
      
      
      for (int i = numero; i<numero+100; i++){
      suma +=i;
      }
    System.out.printf("El numero es: " + suma);
  }
}
