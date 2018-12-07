import matematicas.varias;

public class ejercicio1_14 {
  public static void main(String[] args) {
    
    int num;
    int resultado;
    
    System.out.print("Introduce un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    
    if(matematicas.varias.esPrimo(num)) {
      System.out.println("El número " + num + " es primo");
    } else {
      System.out.println("El número " + num + " no es primo");
    }
    
    System.out.println("El número " + num + " volteado es: " + matematicas.varias.volteo(num));
    
    if (matematicas.varias.capicua(num)) {
      System.out.println("El numero " + num + " es capicua");
    } else {
      System.out.println("El número " + num + " no es capicua");
    }
    
    
    System.out.println("El siguiente número primo es: " + matematicas.varias.siguientePrimo(num));
    
    /*
    System.out.print("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("\nIntroduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    System.out.println("La potencia es: " + base + exponente + matematicas.varias.potencia(resultado));*/
    
    System.out.println("El número de dígitos es: " + matematicas.varias.cuentaDigitos(num));
    
    System.out.println("¿Qué posición quiere saber?");
    int posicion = Integer.parseInt(System.console().readLine());
    
    System.out.println("El número es: " + matematicas.varias.posicionDigito(num));
  }
}
