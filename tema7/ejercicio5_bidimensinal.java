public class ejercicio5_bidimensinal {
  public static void main(String[] args) {
    
    System.out.println("El programa muestra el maximo y el minimo");
    
    int [] [] numero = new int [6] [10];
    int fila = 0;
    int columna = 0;
    int minimo = 1000;
    int maximo = 0;
    int posicionFilaMinimo = 0;
    int posicionColumnaMinimo = 0;
    int posicionFilaMaximo = 0;
    int posicionColumnaMaximo = 0;
    
    
    
    for (fila = 0; fila < 6; fila++) {
      System.out.println();
      for (columna = 0; columna < 10; columna++) {
        numero[fila][columna] = (int)(Math.random()*1001);
        System.out.printf("%5d" , numero[fila][columna]);
      
        if(numero[fila][columna] < minimo) {
          minimo = numero[fila][columna];
          posicionFilaMinimo = fila; //guardamos la fila en la que esta
          posicionColumnaMinimo = columna; //guardamos la columna en la que esta
        }
        
        if (numero[fila][columna] > maximo) {
          maximo = numero[fila][columna];
          posicionFilaMaximo = fila;
          posicionColumnaMaximo = columna;
        }
      }
    }
    
    System.out.println("");
    
    System.out.print("El minimo es: " + minimo + " y esta en la fila: " + (posicionFilaMinimo+1) + " y en la columna: " + (posicionColumnaMinimo+1));
    System.out.print("\nEl maximo es: " + maximo + " y esta en la fila: " + (posicionFilaMaximo+1) + " y en la columna: " + (posicionColumnaMaximo+1));
  }
}
