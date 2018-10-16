public class ejercicio19 {
  public static void main(String[] args) {
    
    int numero;
    
    System.out.print("Introduce un numero para ver cuantos digitos tiene: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero <10) {
      System.out.print("El numero tiene 1 digito");
    }
    
    if ((numero >=10) && (numero <100)) {
      System.out.print("El numero tiene 2 digitos");
    }
    
    if ((numero >=100) && (numero <1000)) {
      System.out.print("El numero tiene 3 digitos");
    }
    
    if ((numero >=1000) && (numero <10000)) {
      System.out.print("El numero tiene 4 digitos");
    }
    
    if ((numero >=10000) && (numero <100000)) {
      System.out.print("El numero tiene 5 digitos");
    } 
  }
}
