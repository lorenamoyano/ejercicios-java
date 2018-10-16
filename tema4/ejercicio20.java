public class ejercicio20 {
  public static void main(String[] args) {
    
    
    System.out.print("El programa muestra si un numero es capicua");
    
    int numero = 0;
    boolean capicua = false;
    
    System.out.print("Introduce un numero de 5 cifras máximo: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero <10) {
      System.out.println("El numero es demasiado pequeño.");
    }
    
    if ((numero>=10) && (numero <100)) { //dos cifras
      if ((numero/10) == (numero %10)) {
        capicua = true;
      }
    }
    if ((numero>=100) && (numero<1000)) { //tres cifras
      if ((numero/100) == (numero %10)) { //el resto de 10 porque cogemos el ultimo numero
        capicua = true;
      }
    }
    
    if ((numero>=1000) && (numero<10000)) { //cuatro cifras
      if (((numero/1000) == (numero %10)) && (((numero/100) %10) == ((numero/10)%10))) { //la cuarta y ultima cifra & la segunda y la penultima tienen que ser iguales
        capicua = true;
      }
    }
    
    if ((numero>=10000) && (numero<100000)) { //cinco cifras
      if (((numero/10000) == (numero %10)) && (((numero/1000)%10) == ((numero/10)%10))) {
        capicua = true;
      }
    }
    
    if (capicua == true) {
      System.out.print("El numero es capicua");
    } else {
      System.out.print("El numero no es capicua");
    }
    
  }
}
