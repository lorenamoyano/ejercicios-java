public class ejercicio13 {
  public static void main(String [] args) {
    
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int mayor = 0;
    
    System.out.print("Introduce tres numeros cualquiera y saldran ordenados de menor a mayor \n");
    
    System.out.print("Introduce el primer numero: ");
    x1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo numero: ");
    x2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el tercer numero: ");
    x3 = Integer.parseInt(System.console().readLine());
    
    
    if (x1 > x2) {
      mayor = x1;
    } else {
      mayor = x2;
    }
    
    if (mayor < x3) {
      mayor = x3;
    } else {
      mayor = mayor;
    }
    
    System.out.print("El numero mayor es: " + mayor);
    
  }
}
