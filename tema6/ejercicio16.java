public class ejercicio16 {
  public static void main(String[] args) {
    
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    
    for (int i = 1; i<=1; i++) {
      figura1 = (int)(Math.random()*5)+1;
      switch (figura1) {
        case 1:
        System.out.print("corazon");
        break;
        
        case 2:
        System.out.print("diamante");
        break;
        
        case 3:
        System.out.print("herradura");
        break;
        
        case 4:
        System.out.print("campana");
        break;
        
        case 5:
        System.out.print("limon");
        break;
        
        default:
      }
      
      
      for (int j = 1; j<=1; j++) {
        figura2 = (int)(Math.random()*5)+1;
        switch (figura2) {
          case 1:
          System.out.print(" corazon");
          break;
          
          case 2:
          System.out.print(" diamante");
          break;
          
          case 3:
          System.out.print(" herradura");
          break;
          
          case 4:
          System.out.print(" campana");
          break;
          
          case 5:
          System.out.print(" limon");
          break;
          
          default:
        }
      
        for (int n = 1; n<=1; n++) {
          figura3 = (int)(Math.random()*5)+1;
          switch (figura3) {
            case 1:
            System.out.print(" corazon");
            break;
            
            case 2:
            System.out.print(" diamante");
            break;
            
            case 3:
            System.out.print(" herradura");
            break;
            
            case 4:
            System.out.print(" campana");
            break;
            
            case 5:
            System.out.print(" limon");
            break;
            
            default:
          }
        }
      }
    }
    if ((figura1 == figura2) && (figura1 == figura3) && (figura2 == figura3)) {
      System.out.print("\nEnhorabuena, ha ganado 10 monedas");
      } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)) {
      System.out.print("\n¡Bien! Ha recuperado su moneda");
      } else {
      System.out.print("\nLo siento, ha perdido");
      }
  }
}
      
      
