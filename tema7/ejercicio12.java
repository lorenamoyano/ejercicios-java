public class ejercicio12 {
  public static void main(String[] args) {
    
    int [] numeroIntroducido = new int[10];
    int [] numeroDos = new int[10];
    System.out.println("Este programa muestra el contenido de un array");
    
    for (int i = 0; i <10; i++) {
      System.out.print("Introduce un número: ");
      numeroIntroducido[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("");
    
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println(" ");
    System.out.print("Valor ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d" , numeroIntroducido[i]);
    }
    
    
    int valorInicial = 0;
    int valorFinal = 0;
    boolean valor;
    
    
    do {
      
      valor = true;
      
      System.out.print("\nIntroduzca un numero inicial: ");
      valorInicial = Integer.parseInt(System.console().readLine());
      if ((valorInicial < 0) || (valorFinal > 9)) {
        System.out.print("El número introducido es incorrecto");
        valor = false;
      }
      
      System.out.print("\nIntroduzca un numero final: ");
      valorFinal = Integer.parseInt(System.console().readLine());
      if ((valorFinal < 0 || valorFinal > 9)) {
        System.out.print("El numero introducido es incorrecto");
        valor = false;
      }
      
      if (valorInicial >= valorFinal) {
        System.out.print("El valor inicial debe ser más pequeño que el valor final");
        valor = false;
      }
      
    } while (!valor);
    
    for (int i = 0; i <10; i++) {
      numeroDos [i] = numeroIntroducido [i];
    }
    
      numeroDos[valorFinal] = numeroIntroducido[valorInicial];
      
      for (int i = valorFinal + 1; i <10; i++) {
        numeroDos [i] = numeroIntroducido[i-1];
      }
      
      numeroDos[0] = numeroIntroducido[9];
      
      for (int i = 0; i < valorInicial; i++) {
        numeroDos[i+1] = numeroIntroducido[i];
      }
      
      
      System.out.println("");
      
    System.out.print("Indice ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println(" ");
    System.out.print("Valor ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d" , numeroDos[i]);
    }
    
  }
}
    
    
    
