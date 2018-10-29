public class ejercicio25 {
  public static void main(String[] args) {
    
    int rango = 0;
    
    for (int i = 0; i<=100; i++) {
      rango = (int)(Math.random()*191)+10;
      
      boolean primo = true;
      for (int j = 2; j <rango; j++) {
        if (rango %j == 0) {
          primo = false;
        }
    }
    
      if (primo) {
        System.out.print("#" + rango + "# ");
      } else if ((rango % 5) == 0) {
        System.out.print("[" + rango + "] ");
      } else {
        System.out.print(rango + " ");
      }
    }
  }
}
      
