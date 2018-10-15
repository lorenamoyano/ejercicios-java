public class ejercicio24 {
  public static void main(String[] args) {
    
    int alturaIntroducida;
    
    
    System.out.print("Introduce la altura de la piramide: ");
    alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1; // tenemos que declararla despues porque todavia no hemos introducido un valor a alturaIntroducida
    
    while (altura <= alturaIntroducida) { //mientras que la altura sea menor que la alturaIntroducida se ejecutara el programa
      
      for (i = 1; i <=espacios; i++) { //pinta los espacios
        System.out.print(" ");
      }
      
      for (i = 1; i <altura; i++) { //pinta las lineas hasta que i es menor de la altura
        System.out.print(i);
      }
      
      for (i = altura; i >0; i--) { //pinta las lineas mientras i sea diferente de 0. Le restamos a i 1 cada vez que se cumple
        System.out.print(i);
      }
      System.out.println ();
      
      altura ++; //cada vez que se ejecuta, añadimos una linea mas a la altura
      espacios --; // y perdemos un espacio
    
    }
  }
}
