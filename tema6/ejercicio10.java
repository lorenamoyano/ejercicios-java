public class ejercicio10 {
  public static void main(String[] args) {
    
    String simbolo ="";
    
    for (int i = 1; i<=10; i++) { //pintar las 10 lineas
    
      int longitudLinea = (int)(Math.random()*40+1); //longitud de las lineas aleatorio
      int caracter = (int)(Math.random()*6+1); //caracter aleatorio
      
      switch (caracter) {
        case 1:
        simbolo = "*";
        break;
        
        case 2:
        simbolo = "-";
        break;
        
        case 3:
        simbolo = "=";
        break;
        
        case 4:
        simbolo = ".";
        break;
        
        case 5:
        simbolo = "|";
        break;
        
        case 6:
        simbolo = "@";
        break;
        
        default:
      }
      
      for (int j = 1; j<=longitudLinea; j++) { //longitud linea aleatorio
        System.out.print(simbolo);
        
      }
      System.out.println();
    }
  }
}
