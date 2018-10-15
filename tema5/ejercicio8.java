public class ejercicio8 {
  public static void main(String[] args) {
  
  System.out.print("Introduce un numero para saber si tabla de multiplicar: ");
  int numeroMultiplicar = Integer.parseInt(System.console().readLine());
  
  
    for (int i = 0; i <=10; i++) {
  
      System.out.println (numeroMultiplicar + " x " + i + " = " + numeroMultiplicar * i);
    }
  }
}
