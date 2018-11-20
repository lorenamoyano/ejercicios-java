public class ejercicio17 {
  public static void main(String[] args) {
    
    int [] numeros = new int [10];
    
    System.out.println("Este programa muestra 10 numeros aleatorios del 0 al 100");
    
    for (int i = 0; i < 10; i++) {
      numeros[i] = (int)(Math.random()*101);
    
      System.out.print(numeros[i] + " ");
    }
    
    //comprobar si el numero se encuentra en el array
    
    boolean numeroCorrecto = false;
    int numeroUsuario = 0;
    
    
    //hacemos un do porque le seguiremos preguntando al usuario tantas veces como sean necesarias hasta que introduzca un numero
    //que se encuentre dentro
    
    do {
      System.out.print("\nIntroduce un número: ");
      numeroUsuario = Integer.parseInt(System.console().readLine());
      
      //usamos foreach porque asi no tenemos que recorrernos el array entero
      
      for (int comprobarNumero : numeros) {
        if (comprobarNumero == numeroUsuario) {
          numeroCorrecto = true;
        }
      }
      
      if (!numeroCorrecto) {
          System.out.println("Introduzca un numero correcto que se encuentre en los mostrados");
        }
    } while (!numeroCorrecto);
    
    
    //dar la vuelta al array
    
    
    /*usamos un while porque un para usar un for no sabemos el numero de vueltas que vamos a dar. Un do while tenemos que tener
     * en cuenta que el usuario puede entrar el primer numero que se muestra y por tanto no tendría que entrar en el bucle, así que la mejor
     * opcion es un while ya que entrará al bucle si se cumple la condición.
     * Ejecutamos while mientras que el numero del array sea distinto del numero introducido por el usuario. A continuación hacemos una
     * variable auxiliar que igualamos a la 9 posicion porque ahí será donde guardemos el valor del numero
     * a continuación vamos restando una posición a los numeros hasta que lleguemos a la última e igualamos la posición 0 al numero que
     * habiamos guardado en la variable auxiliar.
     * 
     * Por último hacemos un bucle for para que nos muestre el array por pantalla.*/
    
    while (numeros[0] != numeroUsuario) {
      int auxiliar = numeros[9];
      for (int i = 9; i > 0; i--) {
        numeros[i] = numeros[i-1];
      }
        numeros[0] = auxiliar;
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}
