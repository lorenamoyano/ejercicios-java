public class ejercicio18 {
  public static void main(String[] args) {
    
    int numero = 0;
    int primerNumero = 0;
    
    System.out.print("Introduzca un numero para saber la primera cifra. \nCinco cifras como maximo: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero <10) {
      primerNumero = numero; //si el numero solo tiene una cifra.
    }
    
    if ((numero >=10) && (numero <100)) {
      primerNumero = numero/10; //si el numero tiene 2 cifras.
    }
    
    if ((numero >=100) && (numero <1000)) {
      primerNumero = numero/100;
    }
    
    if ((numero >=1000) && (numero <10000)) {
      primerNumero = numero/1000;
    }
    
    if ((numero >=10000) && (numero <100000)) {
      primerNumero = numero/10000;
    } 
    
    System.out.print("El primer numero es: " + primerNumero);
  }
}
