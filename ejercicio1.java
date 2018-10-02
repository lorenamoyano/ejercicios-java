public class ejercicio1 {
  public static void main(String[] args) {
    
    String dia;
    
    System.out.print("Introduce un día de la semana\n");
    dia = System.console().readLine();
    
    //if (dia.equals("lunes")) {
      //System.out.println("SISTEMAS INFORMATICOS");
    //}
    //if (dia.equals("martes")) {
      //System.out.println("PROGRAMACION");
    //}
    //if (dia.equals("miercoles")) {
      //System.out.println("ENTORNOS DE DESARROLLO");
    //}
    //if (dia.equals("jueves")) {
      //System.out.println("ENTORNOS DE DESARROLLO");
    //}
    //if (dia.equals("viernes")) {
      //System.out.println("SISTEMAS INFORMATICOS");
    //}
    //if (dia.equals("sabado")) {
      //System.out.println("¡NO HAY CLASE!");
    //}
    //if (dia.equals("domingo")) {
      //System.out.println("¡NO HAY CLASE!");
    //}
    
    
//if (dia.equals("lunes")) {
  //System.out.println("Sistemas informaticos");
//} else if (dia.equals("martes")) {
//} else {
  //System.out.println("No tengo ni idea");
//}

switch (dia) {
  case "lunes":
  System.out.println("Sistemas informaticos");
  break;
  
 case "martes":
 System.out.println("Programacion");
  break;
  default:
  System.out.println("No tengo ni idea");
}

  }
}


