public class ejercicio11 {
  public static void main(String[] args) {
    
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;
    
    
    for (int i = 1; i <=20; i++) {
    
      int nota = (int)(Math.random()*5+1);
      
      switch (nota) {
        case 1:
        System.out.print("Suspenso");
        contadorSuspenso++;
        break;
        
        case 2:
        System.out.print("Suficiente");
        contadorSuficiente++;
        break;
        
        case 3:
        System.out.print("Bien");
        contadorBien++;
        break;
        
        case 4:
        System.out.print("Notable");
        contadorNotable++;
        break;
        
        case 5:
        System.out.print("Sobresaliente");
        contadorSobresaliente++;
        break;
        
      }
      System.out.println();
    }
    System.out.print("\nEl numero de suspensos es: " + contadorSuspenso);
    System.out.print("\nEl numero de suficientes es: " + contadorSuficiente);
    System.out.print("\nEl numero de bienes es: " + contadorBien);
    System.out.print("\nEl numero de notables es: " + contadorNotable);
    System.out.print("\nEl numero de sobresalientes es: " + contadorSobresaliente);
  }
}
