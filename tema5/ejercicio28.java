public class ejercicio28 {
  public static void main(String[] args) {
    
    //factorial = suma de todos los productos de un numero desde 1
    
    int numero = 0;
    int factorial = 1;
    
    System.out.print("Introduce el numero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    for (int i = numero; i >0; i--) { //restamos porque vamos disminuyendo los numeros por los que multiplicamos
      factorial = factorial*i; 
    }
    System.out.print("El numero es: " + numero + "! = " + factorial);
  }
}
