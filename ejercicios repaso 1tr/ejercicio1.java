/* Realice un programa que maneje un array de enteros cuyo tamaño se le indique al usuario,
 * para almacenar tantos enteros como se hayan reservado. Muéstrelos en pantalla en orden
 * inverso al que se han introducido. Sólo puede utilizar un array.*/

public class ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("El programa muestra un array de forma inversa");
    
    int tamanioArray = 10;
    int [] tamanio = new int [10];
    
    System.out.println("El tamaño del array es de " + tamanioArray + " elementos");
    
    //introducir los números y mostrarlos en orden
    System.out.println("Introduzca números enteros hasta completar el array");
    for (int i = 0; i < tamanioArray; i++) {
      tamanio[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    //mostrar el array de forma inversa
    for (int i = tamanioArray-1; i >= 0; i--) {
      System.out.println(tamanio[i]);
    }
    
  }
}  
