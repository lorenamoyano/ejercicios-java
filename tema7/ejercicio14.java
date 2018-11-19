public class ejercicio14 {
  public static void main(String[] args) {
    
    String [] color =  { "verde" , "rojo" , "azul" , "amarillo" , "naranja" , "rosa" , "negro" , "blanco" , "morado"};
    String [] palabra = new String[8];
    String [] resultado = new String[8];
    int r = 0;
    
    
    System.out.print("Introduce 8 palabras y colores: \n");
    for (int i = 0; i < 8; i++) {
      palabra[i] = System.console().readLine();
    
      //comprobar que la palabra introducida es un color
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[r++] = c;
        }
      }
    }
    
    //comprobamos las palabras que no son colores
    for (int i = 0; i < 8; i++) {
      boolean esColor = true;
      
      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = false;
        }
      }
      
      if (esColor) {
        resultado[r++] = palabra[i];
      }
    }
    
    for (int i = 0; i < 8; i++) {
      System.out.print(i + "\n");
    }
    
    for (String resul:resultado) {
      System.out.print(resul + "\n");
    }
  }
}
