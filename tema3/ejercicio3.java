public class ejercicio3 {
  public static void main(String[] args) {
    
    
    System.out.println("Introduce el importe en pesetas");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double euros = pesetas / 166.386;
    
    System.out.printf("%d pesetas son %.2f euros." , pesetas, euros);
    
  }

}
