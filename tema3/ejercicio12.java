public class ejercicio12 {
  public static void main(String[] args) {
    
    double notaExamen1;
    double notaExamen2;
    double media;
    double total;
    
    System.out.print("Introduce la nota del primer examen: ");
    notaExamen1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Qué nota quieres en programacion?: ");
    media = Double.parseDouble(System.console().readLine());
    
    double notaFinal = notaExamen1 * 0.40; //
    
    notaExamen2 = media - notaExamen1;
    total = notaExamen2 *0.6;
    
    
    System.out.printf("Para tener un " + media + "en el trimestre tienes que sacar un " + notaExamen2 + "en el segundo examen");
    
    
  }
}
