public class ejercicio4 {
  public static void main(String[] args) {
    
    int sueldo;
    
    System.out.print("Introducta las horas semanales trabajadas: ");
    
    int numeroHora = Integer.parseInt(System.console().readLine());
    
    
    if (numeroHora < 40) {
      sueldo = 12 * numeroHora;
    } else {
      sueldo = (40 * 12) + ((numeroHora - 40)*16);
    }
      System.out.println("El sueldo es: " + sueldo + "€");
  }
}
    
