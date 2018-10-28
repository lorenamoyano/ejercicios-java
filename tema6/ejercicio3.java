public class ejercicio3 {
  public static void main(String[] args) {
    
    String carta = " ";
    String palo = " ";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch (numeroPalo) {
      case 1:
      System.out.print("espadas ");
      break;
      
      case 2:
      System.out.print("oros ");
      break;
      
      case 3:
      System.out.print("bastos ");
      break;
      
      case 4:
      System.out.print("copas ");
      break;
      
      default:
      palo = String.valueOf(numeroPalo);
    }
    
    int numeroCarta = (int)(Math.random()*11) + 1;
    
    switch (numeroCarta) {
      case 1:
      System.out.print("As");
      break;
      
      case 8:
      System.out.print("Sota");
      break;
      
      case 9:
      System.out.print("Caballo");
      break;
      
      case 10:
      System.out.print("Rey");
      break;
      
      default:
      carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(palo + carta);
  }
}
