public class ejercicio2 {
  public static void main(String[] args) {
      
      String carta = "";
      String palo = "";
    
      int numeroPalo = (int)(Math.random()*4) + 1;
      
      switch (numeroPalo) {
        case 1:
        System.out.print("picas");
        break;
        
        case 2:
        System.out.print("corazones");
        break;
        
        case 3:
        System.out.print("diamantes");
        break;
        
        case 4:
        System.out.print("trebol");
        
        default:
        palo = String.valueOf(numeroPalo);
      }
      
      int numeroCarta = (int)(Math.random()*13) +1;
      
      switch (numeroCarta) {
        case 1:
        System.out.print("As");
        break;
        
        case 11:
        System.out.print("J");
        break;
        
        case 12:
        System.out.print("Q");
        break;
        
        case 13:
        System.out.print("K");
        break;
        
        default:
        carta = String.valueOf(numeroCarta);
      }
      
      System.out.println(carta + palo);
  }
}
