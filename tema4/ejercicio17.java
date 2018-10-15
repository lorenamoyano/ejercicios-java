public class ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("La ultima cifra del numero anteriormente introducido es: " + (numero %10));
    /* el 10 divide el numero que hayamos introducido en la variable haciendo que el resto (%) 
     * de la división sea la última cifra del número que hemos introducido*/
  }
}
    
    
