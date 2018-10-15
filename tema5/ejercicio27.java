public class ejercicio27 {
  public static void main(String[] args) {
    
    
    System.out.println("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    int contar = 0;
    
    for (int i = 1; i <numero; i++) {
      if ((i%3)==0) {
        contar++;
        suma += i;
      }
    }
    
    System.out.println("El total de numeros introducidos es: " + contar);
    System.out.println("La suma total es: " + suma);
  }
}
