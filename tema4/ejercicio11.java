public class ejercicio11 {
  public static void main(String [] args) {
    
    System.out.print("Introduce la hora y los minutos\n");
    
    System.out.print("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int tiempoPasado = (hora * 3600) + (minutos * 60);
    int tiempoFalta = (24 * 3600) - tiempoPasado;
    
    System.out.print("Faltan: " + tiempoFalta + " segundos");
  }
}
