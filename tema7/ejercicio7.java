public class ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra numeros aleatorios del 0 al 20");
    
    int [] numeroAleatorio = new int[100];
    int i = 0;
    
    for (i = 0; i <100; i++) {
      numeroAleatorio[i] = ((int)(Math.random()*21));
      System.out.print(numeroAleatorio[i] + " ");
    }
    
    System.out.println("");
    
    System.out.print("¿Que numero desea cambiar?: \n");
    int numeroCambiar = Integer.parseInt(System.console().readLine());
    
    System.out.print("Di un numero por el que desea cambiarlo: ");
    int nuevoValor = Integer.parseInt(System.console().readLine());
    
    System.out.println("");
    
    //igualamos los numeros
    
    for (i = 0; i<100; i++) {
      if (numeroAleatorio[i] == numeroCambiar) {
        numeroAleatorio[i] = nuevoValor;
        System.out.print("**" + numeroAleatorio[i] + "** ");
      } else {
        System.out.print(numeroAleatorio[i] + " ");
      }
    }
    System.out.println(""); 
  }
}
