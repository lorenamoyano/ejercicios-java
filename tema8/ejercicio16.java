import matematicas.varias;

public class ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números capicula del 1 al 99999");
    
    for (int i = 10; i <= 99999; i++) {
      if (matematicas.varias.capicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
