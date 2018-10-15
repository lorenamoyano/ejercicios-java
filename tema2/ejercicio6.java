public class ejercicio6 {
  public static void main(String[] args) {
    double baseImporte = 234.56;
    int porcentajeIVA = 21;
    
    double incrementoIVA;
    double totalIVAincluido;
    
    incrementoIVA = baseImporte*porcentajeIVA/100;
    totalIVAincluido = baseImporte + incrementoIVA;
    

    System.out.printf("El precio total correspondiente a base imponible %.2f es %.2f\n",baseImporte, totalIVAincluido);
  }
}
