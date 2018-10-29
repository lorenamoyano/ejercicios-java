public class ejercicio18 {
  public static void main(String[] args) {
    
    int dormitorio1 = 0;
    int dormitorio2 = 0;
    int dormitorio3 = 0;
    String color1 = "";
    String color2 = "";
    String color3 = "";
    
    do {
      dormitorio1 = (int)(Math.random()*6)+1;
      dormitorio2 = (int)(Math.random()*6)+1;
      dormitorio3 = (int)(Math.random()*6)+1;
      
    } while ((dormitorio1 == dormitorio2) || (dormitorio1 == dormitorio3) || (dormitorio2 == dormitorio3));
    
    /*ejecuta el bucle hasta que el numero sea distinto.
     * Una vez lo es, busca en el switch el color correspondiente
     * */
    
    switch (dormitorio1) {
      case 1:
      color1 = "rojo";
      break;
      
      case 2:
      color1 = "azul";
      break;
      
      case 3:
      color1 = "verde";
      break;
      
      case 4:
      color1 = "amarillo";
      break;
      
      case 5:
      color1 = "violeta";
      break;
      
      case 6:
      color1 = "naranja";
      break;
      
      default:
    }
    
    
    switch (dormitorio2) {
      case 1:
      color2 = "rojo";
      break;
      
      case 2:
      color2 = "azul";
      break;
      
      case 3:
      color2 = "verde";
      break;
      
      case 4:
      color2 = "amarillo";
      break;
      
      case 5:
      color2 = "violeta";
      break;
      
      case 6:
      color2 = "naranja";
      break;
      
      default:
    }
    
    switch (dormitorio3) {
      case 1:
      color3 = "rojo";
      break;
      
      case 2:
      color3 = "azul";
      break;
      
      case 3:
      color3 = "verde";
      break;
      
      case 4:
      color3 = "amarillo";
      break;
      
      case 5:
      color3 = "violeta";
      break;
      
      case 6:
      color3 = "naranja";
      break;
      
      default:
    }
    
    System.out.print("Dormitorio 1: " + color1 + "\nDormitorio 2: " + color2 + "\nDormitorio 3: " + color3);
  }
}
