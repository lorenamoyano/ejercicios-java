public class ejercicio13 {
  public static void main(String[] args) {
    
    
    System.out.print("Este programa lee los diez primeros numeros \n");
    System.out.print("y dira cuales son positivos y cuales negativos. \n");
    
    int negativo = 0;
    int positivo = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) <0) {
        negativo++;
      } else {
        positivo++;
      }
    }
      
      System.out.println("El numero de positivos introducidos es: " + positivo + " y negativos: " + negativo);
  }
}
