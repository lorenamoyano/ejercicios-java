public class ejercicio1_bidimensinal {
  public static void main(String[] args) {
    
    System.out.println("El programa muestra una tabla con numeros");
    
    int [] [] num = new int [3] [6]; //tres filas por columnas
    
    num [0] [0] = 0;
    num [1] [0] = 75;
    num [0] [1] = 30;
    num [0] [2] = 2;
    num [2] [2] = -2;
    num [2] [3] = 9;
    num [1] [4] = 0;
    num [0] [5] = 5;
    num [2] [5] = 11;
    
    int fila = 0;
    int columna = 0;
    
    //pintar filas
    for (fila = 0; fila < 3; fila++) {
    
    //pintar columnas
      for (columna = 0; columna < 6; columna++) {
        System.out.printf("%8d" , num[fila][columna]);
      }
      
      System.out.println("");
    }
    
    
  }
}
