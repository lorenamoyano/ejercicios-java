public class ejercicio11 {
  public static void main(String[] args) {
    
    String kb;
    
    System.out.println("Introduce el numero en kb para pasar a mb");
    kb = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(kb);
    
    int mb;
    mb = (primerNumero / 1024);
    
    System.out.println ("El numero introducido en kb es: " + kb);
    System.out.print ("El total es: " + mb + "mb");
  }
}
