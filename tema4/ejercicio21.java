public class ejercicio21 {
  public static void main(String[] args) {
    
    System.out.print("Dime tus notas de los examenes y te dire tu media \n");
    System.out.printf("Nota del primer examen \n");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Nota del segundo examen \n");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    Double nota = (nota1 + nota2)/2;
    
    if (nota >=5) {
      System.out.printf("Tu media es: " + nota);
    } else {
      System.out.print("Recuperacion apto o no apto?");
      String recuperacion = System.console().readLine();
        if (recuperacion.equals("apto")) {
          System.out.print("Tu media en programacion es un: 5 \n");
        } else {
          System.out.printf("Tu media en programacion es un: \n" + nota);
        }
    } 
        
  }
}
