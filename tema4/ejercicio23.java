public class ejercicio23 {
  public static void main(String[] args) {
    
    
    System.out.print("Este programa te calculara el precio de un producto con el IVA y el descuento \n");
    System.out.print("Introduce la base importe (producto sin IVA)\n");
    double baseImporte = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un numero para elegir el IVA: \n 1 Superreducido \n 2 Reducido \n 3 General \n");
    int tipoIVA = Integer.parseInt(System.console().readLine());
            
    System.out.print("Introduzca el codigo promocional \n 1. nopro\n 2. mitad\n 3. meno5\n 4. 5porc \n");
    int tipoPromocion = Integer.parseInt(System.console().readLine());
    
    switch (tipoIVA) {
      
      case 1:
      tipoIVA=4;
      break;
      
      case 2:
      tipoIVA=10;
      break;
      
      case 3:
      tipoIVA=21;
      break;
    }
    
    double iva = (baseImporte * tipoIVA)/100;
    double precioSinDescuento = (iva + baseImporte);
    
    double promocion = 0;
    
    switch (tipoPromocion) {
      case 1:
      break;
      
      case 2:
      promocion = precioSinDescuento/2;
      break;
      
      case 3:
      promocion = precioSinDescuento = 5;
      break;
      
      case 4:
      promocion = precioSinDescuento*0.05;
      break;
      
      default:
      System.out.print("El codigo promocional no es correcto");
    }
    
    double total = precioSinDescuento - promocion;
    
    System.out.printf("Base Importe...........%.2f\n" , baseImporte);
    System.out.printf("IVA....................%.2f\n" , iva);
    System.out.printf("Precio con IVA.........%.2f\n" , precioSinDescuento);
    System.out.printf("Codigo promocional....-%.2f\n" , promocion);
    System.out.printf("total..................%.2f\n" , total);
    
  }
}
