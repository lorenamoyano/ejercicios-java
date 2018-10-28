public class ejercicio7 {
  public static void main(String[] args) {
    
    
    for (int i = 1; i <=15; i++) {
    int quinielaNumero = (int)(Math.random()*3+1);
      switch (quinielaNumero) {
        case 1:
        System.out.print("1");
        break;
        
        case 2:
        System.out.print ("x");
        break;
        
        case 3:
        System.out.print("2");
        break;
        
        default:
      }
      System.out.println();
    }
    
  }
}
