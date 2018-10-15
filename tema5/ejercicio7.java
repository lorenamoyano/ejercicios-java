public class ejercicio7 {
  public static void main(String[] args) {
    
    int codigoIntroducido;
    int numeroIntentos = 4;
    boolean aciertos = false; //sirve para ver si he acertado o no y que muestre el mensaje
    
    do {
    
      System.out.print("Este programa abrirá una caja fuerte\n");
      System.out.print("Introduce una combinacion de 4 digitos para abrirla \n");
      codigoIntroducido = Integer.parseInt(System.console().readLine());
      //comprobar si hemos adivinado el numero
    

    
      if (codigoIntroducido==3103) {
        aciertos = true;
        System.out.print("Enhorabuena. Ese es el código correcto\n");
      
      } else { 
        System.out.print("Lo siento. No es el codigo correcto.\n");
      }
      
      numeroIntentos --;
    
      } while ((aciertos == false) && (numeroIntentos >0));
      if (aciertos) {
        System.out.print("Caja fuerte abierta\n");
      } else {
        System.out.print("Caja bloqueada\n");
      }
  }
}

