public class ejercicio18 {
  public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    int menor;
    
    System.out.print("Este programa obtiene numeros enteros entre dos numeros dados. \n");
    System.out.print("Introduzca el primer numero: \n");
    primerNumero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo numero: ");
    segundoNumero = Integer.parseInt(System.console().readLine());
    
    if (primerNumero != segundoNumero) {
      if (primerNumero > segundoNumero){
        menor = segundoNumero;
      } else {
        menor = primerNumero;
      }
      for (int i=1; i<=menor; i++) {
        System.out.printf("Los numeros son: %d" , (menor+7));
      }
    } else {
      System.out.print("El numero introducido no es valido");
    
    }
  }
}
