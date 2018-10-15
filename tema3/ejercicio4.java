public class ejercicio4 {
  public static void main(String[] args) {
    
    int x;
    int y;
    
    String cuenta;
    
    System.out.println("Por favor, introduzca el primer numero");
    x = Integer.parseInt(cuenta = System.console().readLine());
    
    System.out.println("Por favor, introduzca el segundo numero");
    y = Integer.parseInt(cuenta = System.console().readLine());
    
    System.out.println("x = " +x);
    System.out.println("y = " +y);
    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    System.out.println("x * y = " + (x*y));
    System.out.println("x / y = " + (x/y));
    
  }
}
