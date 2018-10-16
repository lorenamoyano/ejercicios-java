public class ejercicio15 {
  public static void main(String[] args) {
    
    int base =0;
    double exponente =0;
    
    System.out.print("Este programa muestra potencias. Para detenerlo, introduzca un numero negativo \n");
    
    System.out.print("Introduce la base con un numero entero: ");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el exponente con un numero entero: ");
    exponente = Double.parseDouble(System.console().readLine());
    
    while ((base >=0) || (exponente >=0)) {
      System.out.printf("La potencia es: %2f %2f" , base , exponente);
    }
    
    
  }
}
