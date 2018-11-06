public class ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números introducidos en orden inverso. ");
    
    int [] numero = new int [10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce el número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("El número al revés es: ");
    
    for (int i = 9; i>=0; i--) {
      System.out.print(numero[i]);
    }    
  }
}
