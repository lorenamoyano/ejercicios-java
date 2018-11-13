public class ejercicio6 {
  public static void main(String[] args) {
    
    int [] numeroIntroducido = new int[15];
    int i = 0;
    int j = 0;
    
    System.out.println("Este programa muestra los números cambiados de posición");
    
    System.out.println("Introduzca el número: ");
    for (i = 0; i < 15; i++) {
      numeroIntroducido[i] = Integer.parseInt(System.console().readLine());      
    }
    
    int aux = numeroIntroducido[14]; 
    for (i = 14; i > 0; i--) {
      numeroIntroducido[i] = numeroIntroducido[i-1];
    }
    
    numeroIntroducido[0] = aux;
      
    for (i = 0; i < 15; i++) {
      System.out.print(numeroIntroducido[i] + " ");
    }
  }
}
