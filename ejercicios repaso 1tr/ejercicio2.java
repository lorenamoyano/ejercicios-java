/* Modifique el programa anterior para invertir el orden de los elementos en el array, y 
 * presente los elementos tanto en el orden original en el que se introdujeron como en el orden 
 * inverso al que se introdujeron. Puede utilizar todos los arrays que desee. */
 
public class ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra un array original y su inverso");
    
    int tamanio = 10;
    int [] arrayOriginal = new int [10];
    int [] arrayInverso = new int [10];
    
    System.out.println("El tamaño del array es de " + tamanio + " elementos");
    
    System.out.println("Introduzca números enteros para rellenar el array");
    for (int i = 0; i < tamanio; i++) {
      arrayOriginal[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i < tamanio; i++) {
      System.out.println(arrayOriginal[i]);
    }
    
    for (int i = 0; i < tamanio; i++) {
      arrayInverso[i] = arrayOriginal[i];
    }
    
    System.out.println();
    
    for (int i = tamanio-1; i >= 0; i--) {
      System.out.println(arrayInverso[i]);
    }
  }
}
