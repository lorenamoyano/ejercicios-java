import matematicas.varias;

public class ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra todos los números primos del 1 al 1000");
    
    
    for(int i = 1; i <= 1000; i++) {
      if (matematicas.varias.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }      
  }
}
