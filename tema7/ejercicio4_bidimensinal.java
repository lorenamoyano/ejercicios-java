public class ejercicio4_bidimensinal {
  public static void main(String[] args) 
    throws InterruptedException {
    
    System.out.println("Este programa sumara las filas y columnas");
    
    int [] [] numeroIntroducido = new int [4] [5];
    int fila = 0;
    int columna = 0;
    
    System.out.println("Introduce un numero entero: ");
    
    for (fila = 0; fila < 4; fila ++) {
      for (columna = 0; columna < 5; columna++) {
        numeroIntroducido[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    
    int sumaFilas = 0;
    
    for (fila = 0; fila < 4; fila++) {
      sumaFilas = 0; //ponemos la variable a 0 porque sino nos seguira sumando el valor de la ultima fila
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%5d" , numeroIntroducido[fila][columna]);
        sumaFilas += numeroIntroducido[fila][columna];
        Thread.sleep(100);
      }
      System.out.printf("%5d\n" , sumaFilas);
      Thread.sleep(500);
    }
      
    for (columna = 0; columna < 5; columna++) {
      System.out.print("-----------");
    }
    
    System.out.println("------------");
    
    
    
    int sumaColumnas = 0;
    int sumaTotal = 0;
    
    //pintar suma filas
    
    for (columna = 0; columna < 5; columna++) {
      sumaColumnas = 0; //ponemos la variable a 0 para que no nos sume las columnas anteriores
      for (fila = 0; fila < 4; fila++) {
        sumaColumnas += numeroIntroducido[fila][columna];
        Thread.sleep(200);
      }
    
      sumaTotal += sumaColumnas;
      Thread.sleep(200);
      System.out.printf("%5d" , sumaColumnas);
    }
    Thread.sleep(200);
    System.out.printf("%5d" , sumaTotal);
    
  }
}
