public class ejercicio11 {
  public static void main(String[] args) {
    
    int[] numeros = new int[10];
    
    for (int i=0; i<10; i++) {
      System.out.print("Introduzca valor posicion " +i +": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
      
    //presentar array por pantalla
    
    System.out.println("");
    System.out.print("Posicion: ");
    for (int i = 0; i<10; i++) {
      System.out.printf("%3d" , i);
    }
    
    System.out.println("");
      
    System.out.print("Valor:    ");
    for (int i = 0; i<10; i++) {
      System.out.printf("%3d" , numeros[i]);
    }
    
    System.out.println("");
      
    //colocar los primeros al principio
      
    int[]numerosPrimos = new int[10];
    int[]numerosNoPrimos = new int[10];
    //como no sé los primos que va a haber, tengo que llevar una cuenta para luego saber el tamaño del array
    int numPrimos = 0;
    int numNoPrimos = 0;
      
    for (int i = 0; i<10; i++) {
      boolean esPrimo = true;
      for (int j = 2; (j<=(numeros[i]/2)) && esPrimo; j++) {
        if (numeros[i] % j == 0) { // no es primo
          esPrimo = false;
        }
    }
        
      if (esPrimo) {
        numerosPrimos[numPrimos] = numeros[i];
        numPrimos++;
      } else {
        numerosNoPrimos[numNoPrimos] = numeros[i];
        numNoPrimos++;
        }
    }
      
      
    //pasamos al vector original los primos
    for (int i=0; i<numPrimos; i++) {
      numeros[i] = numerosPrimos[i];
    }
      
      
    //ahora pasamos los no primos
    for (int i=0; i<numNoPrimos; i++) {
      numeros[numPrimos+i] = numerosNoPrimos[i];
    }
    
    //sacar array en pantalla
    System.out.print("\n\n");
    System.out.print("Posicion: ");
    for (int i = 0; i<10; i++) {
      System.out.printf("%3d" , i);
    }
    
    System.out.println("");
      
    System.out.print("Valor:    ");
    for (int i = 0; i<10; i++) {
      System.out.printf("%3d" , numeros[i]);
    }
  }
}
