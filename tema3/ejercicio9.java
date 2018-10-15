public class ejercicio9 {
  public static void main(String[] args) {
    
    double radio =0;
    double altura = 0;
    
    
    System.out.print("Introduce el radio del cono: ");
    radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la altura: ");
    altura = Double.parseDouble(System.console().readLine());
    
    double volumen = (0.33*3.14*(radio*radio)*altura);
    
    System.out.printf("El volumen es: " + volumen);
    
    
  }
}
