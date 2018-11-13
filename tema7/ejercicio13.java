public class ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra números aleatorios");
    
    int [] numeroAleatorio = new int[500];
    int minimo = 500;
    int maximo = 0;
    int destacar = 0;
    
    for (int i = 0; i <=100; i++) {
      numeroAleatorio[i] = ((int)(Math.random()*501));
      System.out.print(numeroAleatorio[i] + " ");
      if (numeroAleatorio[i] < minimo) {
        minimo=numeroAleatorio[i];
      }
      if (numeroAleatorio[i] > maximo) {
        maximo = numeroAleatorio[i];
      }
    }
    
    System.out.println("");
    
    System.out.println("¿Qué quiere destacar?\n1-Mínimo\n2-Máximo?");
    int decision = Integer.parseInt(System.console().readLine());
    
    switch (decision) {
      case 1:
      destacar = minimo;
      break;
      
      case 2:
      destacar = maximo;
      break;
      
      default:
      
    }
    
    for (int i = 0; i <100; i++){
      if (numeroAleatorio[i] == destacar) {
        System.out.print("**" + numeroAleatorio[i] + "** ");
      } else {
        System.out.print(numeroAleatorio[i] + " ");
      }
    }
  }
}
