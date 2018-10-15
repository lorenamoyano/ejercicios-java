public class ejercicio22 {
  public static void main (String[] args) {
    
    System.out.print("Cuanto queda para el fin de semana? \nIntroduce el dia de la semana en el que estas, horas y minutos. \n");
    
    System.out.print("Introduce el dia de la semana de lunes a viernes \n");
    String dia = System.console().readLine();
    int diaSemana = 0;
    
    switch (dia) {
      case "lunes":
      diaSemana = 0;
      break;
      
      case "martes":
      diaSemana = 1;
      break;
      
      case "miercoles":
      diaSemana = 2;
      break;
      
      case "jueves":
      diaSemana = 3;
      break;
      
      case "viernes":
      diaSemana = 4;
      break;
      
      default:
      System.out.print("Por favor, introduce un dia valido");
    }
    System.out.print("Introduce la hora de 0 a 24 \n");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos \n");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int tiempoTotal = (24 * 4 * 60) + (15 * 60); //15 horas que tiene el viernes hasta las 15:00
    int tiempoFalta = (diaSemana * 24 * 60 ) + (hora * 60) + minutos;
    
    System.out.printf("Fantan " + (tiempoTotal - tiempoFalta) + " minutos");
    
  }
}
