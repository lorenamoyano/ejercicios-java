public class ejercicio14 {
  public static void main (String[] args) {
    
    
    System.out.print("Introduce un numero y veras si es divisible por 2 y/o por 5 \n");
    int x = Integer.parseInt(System.console().readLine());
    
    int divisionPorDos = x%2;
    int divisionPorCinco = x%5;
    
    if (divisionPorDos == 0) {
      System.out.print("El numero es par\n");
    } else {
      System.out.print("El numero es impar\n");
    }
    
    if (divisionPorCinco == 0) {
      System.out.print("El numero es divisible por 5");
    } else {
      System.out.print("El numero no es divisible por 5");
    }
  }
}
