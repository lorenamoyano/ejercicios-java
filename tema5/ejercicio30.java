public class ejercicio30 {
  public static void main(String[] args) {
    
    int diaSemana1;
    int hora1;
    int diaSemana2;
    int hora2;
    int diaSemana;
    
    System.out.print("Introduce el primer dia de la semana con numeros: ");
    diaSemana1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la hora: ");
    hora1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo dia de la semana: ");
    diaSemana2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la hora: ");
    hora2 = Integer.parseInt(System.console().readLine());
    
    switch (diaSemana1) {
      case 1:
      diaSemana = lunes;
      break;
      case 2:
      diaSemana = martes;
      break;
      case 3:
      diaSemana = miercoles;
      break;
      case 4:
      diaSemana = jueves;
      break;
      case 5:
      diaSemana = viernes;
      break;
      case 6:
      diaSemana = sabado;
      break;
      case 7:
      diaSemana = domingo;
      break;
    }
    
    switch (diaSemana2) {
      case 1:
      diaSemana = lunes;
      break;
      case 2:
      diaSemana = martes;
      break;
      case 3:
      diaSemana = miercoles;
      break;
      case 4:
      diaSemana = jueves;
      break;
      case 5:
      diaSemana = viernes;
      break;
      case 6:
      diaSemana = sabado;
      break;
      case 7:
      diaSemana = domingo;
      break;
    }
      
    
  }
}
