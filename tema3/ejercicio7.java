public class ejercicio7 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca los numeros: ");
    
    Double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.printf("baseImponible %8.2f \n" , baseImponible);
    System.out.printf("IVA           %8.2f \n" , baseImponible * 0.21);
    System.out.print("-----------------------\n");
    System.out.printf("baseImponible %8.2f \n" , baseImponible * 1.21);
  }
}
