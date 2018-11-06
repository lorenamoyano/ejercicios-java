public class ejercicio5 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra 10 números por teclado con su máximo y mínimo. ");
    
    int [] numeroIntroducido = new int[10];
    int minimo = 9999;
    int maximo = 0;
    
    System.out.println("Introduzca el número: ");
    
    for (int i = 0; i<10; i++) {
      numeroIntroducido[i] = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido[i] < minimo) {
         minimo = numeroIntroducido[i];
      } 
      if (numeroIntroducido[i] > maximo) {
        maximo = numeroIntroducido[i];
      }
    }
    
    System.out.println();
    
    for (int i = 0; i <10; i++) { //para mostrar las 10 filas
      System.out.print(numeroIntroducido[i]);
      if (numeroIntroducido[i] == minimo) {
        System.out.print(" minimo");
      }
      if (numeroIntroducido[i]==maximo) {
        System.out.print(" maximo");
      }
      System.out.println();
    }
  }
}
      
