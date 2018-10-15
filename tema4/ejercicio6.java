public class ejercicio6 {
  public static void main(String[] args) {
    
    System.out.print("Este programa dira cuanto tiempo tarda un objeto en caer \n");
    System.out.print("Introduzca la altura en metros: ");
    Double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    double s = Math.sqrt(2*h/g);
    
    System.out.printf("Tarda %.2f segundos en caer" , s);
  }
}
