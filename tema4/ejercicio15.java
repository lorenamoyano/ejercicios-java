public class ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un caracter de relleno para la piramide \n");
    String caracter = System.console().readLine();
    
    System.out.print("Elige hacia donde quieres apuntar la piramide \n");
    System.out.println("1. Con el vertice hacia arriba \n");
    System.out.println("2. Con el vertice hacia abajo \n");
    System.out.println("3. Con el vertice hacia la derecha \n");
    System.out.println("4. Con el vertice hacia la izquierda \n");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    switch (numero) {
      case 1:
      System.out.println ("  " + caracter);
      System.out.println (" " + caracter + caracter + caracter);
      System.out.println (caracter + caracter + caracter + caracter + caracter);
      
      break;
      
      case 2:
      System.out.println (caracter + caracter + caracter + caracter + caracter);
      System.out.println (" " + caracter + caracter + caracter);
      System.out.println ("  " + caracter);
      
      break;
      
      case 3:
      System.out.println (caracter + " ");
      System.out.println (caracter + caracter + " ");
      System.out.println (caracter + caracter + caracter);
      System.out.println (caracter + caracter + " ");
      System.out.println (caracter + " ");
      
      break;
      
      case 4:
      
      System.out.println (" " + " " + caracter);
      System.out.println (" " + caracter + caracter);
      System.out.println (caracter + caracter + caracter);
      System.out.println (" " + caracter + caracter);
      System.out.println (" " + " " + caracter);
      
      break;
      
      default: 
      System.out.print ("¡ERROR! Introduce un numero de 1-4.");
    }
  }
}
