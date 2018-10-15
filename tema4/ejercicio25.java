public class ejercicio25 {
  public static void main(String[] args) {
    
    double altura;
    double anchura;
    double precioTotal;
    double gastosDeEnvio = 3.50;
    double total;
    
    System.out.print("Introduzca la altura de la bandera en cm: \n");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la anchura de la bandera en cm: \n");
    anchura = Integer.parseInt(System.console().readLine());
    
    precioTotal = altura * anchura * 0.01;
    
    System.out.println("¿Desea un bordado? (s/n): \n" );
    String bordadoPrecio = System.console().readLine();
    double bordado;
    
    if (bordadoPrecio.equals("s")) {
      bordado = 2.50;
    } else {
      bordado = 0;
    }
    
    gastosDeEnvio = 3.25;
    total = (precioTotal + bordado + gastosDeEnvio);
    
    System.out.println("Muchas gracias por su compra. Aquí tiene la factura \n");
    System.out.printf("Precio de la bandera: %.2f \n" , precioTotal);
    System.out.printf("Precio con bordado: %.2f \n", bordado);
    System.out.printf("Gastos de envio: %.2f \n" , gastosDeEnvio);
    System.out.printf("Total: %.2f \n" , total);

      
  }
}
