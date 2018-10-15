public class ejercicio3 {
  public static void main(String[] args) {
    
    String semana;
    
    System.out.print("Introduce un numero del 1 al 7 para ver el dia de la semana: ");
    semana = System.console().readLine();
    
    if(semana.equals("1")) {
      System.out.println("Lunes");
    }
    
    if(semana.equals("2")) {
      System.out.println("Martes");
    }
    
    if(semana.equals("3")) {
      System.out.println("Miercoles");
    }
    
    if(semana.equals("4")) {
      System.out.println("Jueves");
    }
    
    if(semana.equals("5")) {
      System.out.println("Viernes");
    }
    
    if(semana.equals("6")) {
      System.out.println("Sabado");
    }
    
    if(semana.equals("7")) {
      System.out.println("Domingo");
    }
    
  }
}
