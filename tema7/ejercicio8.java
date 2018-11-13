public class ejercicio8 {
  public static void main(String[] args) {
    
    int [] temperatura = new int[12];
    String [] mes = { "enero" , "febrero" , "marzo" , "abril" , "mayo" , "junio" , "julio" , "agosto", "septiembre" , 
      "octubre", "noviembre", "diciembre"};
    
    
    for (int i = 0; i <12; i++) {
      System.out.print("Introduzca la temperatura del media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("");
    
    System.out.println("La temperatura media es:");
    
    //nos muestra las temperaturas en linea
    for (int i = 0; i <12; i++) {
      System.out.printf(mes[i]);
      for (int j = 0; j<temperatura[i]; j++) {
        System.out.print("*");
      }
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
}
