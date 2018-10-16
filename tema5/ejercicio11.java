public class ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("En este programa se muestra el cuadrado y el cubo de los 5 primeros numeros \n");
    System.out.print("Introduce un numero: \n");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = numero;  i <numero+5; i++); {
      System.out.printf ("%-15s %15s %15s \n" , "Numero Original" , "Cuadrado" , "Cubo");
      System.out.printf ("%-10d %15d %20d\n" , numero , numero*numero , numero*numero*numero);
    
    }
    
  }
}
