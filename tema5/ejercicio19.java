public class ejercicio19 {
  public static void main(String[] args) {
      
      String caracter;
      int altura = 1;
      int espacio;
      
      System.out.print("Este programa pinta una piramide. \n");
      System.out.print("Elige el caracter. \n");
      caracter = System.console().readLine();
      
      System.out.print("Introduce la altura de la piramide: \n");
      altura = Integer.parseInt(System.console().readLine());
      
      
      //bucle para pintar cada linea
      for (int i = 1; i<=altura; i++) {
        //bucle para pintar los espacios en blanco
        for (int j=1; j<=(altura-i); j++) {
          System.out.print(" ");
        }
        //bucle para pintar los caracteres de la piramide
        
        
      for (int j=1; j<=(2*i-1); j++){
        System.out.print(caracter);
      }
      
      System.out.println("");
    
  }
}
}
