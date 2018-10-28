public class ejercicio9 {
  public static void main(String[] args) {
    
    int numero = 0;
    int contador = 0;
    
    do {
      numero = (int)(Math.random()*51)*2; //51 con los numeros pares entre el 0 y el 100 y sacamos los pares con el 2
      System.out.print(numero + " ");
      contador++;
    } while(numero != 24);
    
    System.out.print("\nEl total de numeros es: " + contador);
    
  }
}
