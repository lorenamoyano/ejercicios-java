public class ejercicio24 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca su cargo con numero del 1 al 3 \n");
    System.out.print("1. Programador junior \n");
    System.out.print("2. Programador senior \n");
    System.out.print("3. Jefe de proyecto \n");
    
    int puestoEmpleado = Integer.parseInt(System.console().readLine());
    
    double salarioBase = 0;
    
    switch (puestoEmpleado) {
      case 1:
      salarioBase = 950;
      break;
      
      case 2:
      salarioBase = 1200;
      break;
      
      case 3:
      salarioBase = 1600;
      break;
    }
    
    System.out.print("Cuantos dias ha estado de viaje? \n");
    int diasViaje = Integer.parseInt(System.console().readLine());
    
    double dietas = diasViaje * 30;
    double salarioBruto = salarioBase + dietas;
    
    System.out.print("Estado civil \n");
    System.out.print("1. Casado \n");
    System.out.print("2. Soltero \n");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    double IRPF = 0;
    
    switch (estadoCivil) {
      case 1:
      IRPF = 20;
      break;
      
      case 2:
      IRPF = 25;
      break;
    }
    
    double totalIRPF = (salarioBruto * IRPF)/100;
    
    System.out.print("*************************************\n");
    System.out.printf("Sueldo base                  %7.2f\n" , salarioBase);
    System.out.printf("Dietas (%2d viajes)           %7.2f\n" , diasViaje , dietas);
    System.out.print("*************************************\n");
    System.out.printf("Salario bruto                %7.2f\n" , salarioBruto);
    System.out.printf("Retension de IRPF (%.0f%%)      %7.2f\n" , IRPF , totalIRPF);
    System.out.print("*************************************\n");
    System.out.printf("Salario neto                 %7.2f\n" , salarioBruto - totalIRPF);
    System.out.print("*************************************\n");
    
  }
}
