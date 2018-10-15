public class ejercicio5 {
  public static void main(String[] args) {
    
    System.out.print("Vamos a resolver una ecuación de primer grado \n");
    System.out.print("Introduce el valor de a: \n");
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de b: \n");
    Double b = Double.parseDouble(System.console().readLine());
    
    double resultado = (-b/a);
    
    if (a == 0) {
      System.out.print("El problema no tiene solucion");
      
    } else {
      System.out.printf("x= " + resultado);
    }
  }
}
