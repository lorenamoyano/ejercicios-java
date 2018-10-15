public class ejercicio10 {
  public static void main(String[] args) {
    
    String mb;
    
    System.out.println("Introduce el numero en mb para pasar a kb");
    mb = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(mb);
    
    int kb;
    kb = (primerNumero * 1024);
    
    System.out.println ("El numero introducido en mb es: " + mb);
    System.out.print ("El total es: " + kb + "kb");
  }
}
