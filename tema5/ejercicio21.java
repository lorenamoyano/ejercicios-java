public class ejercicio21 {
  public static void main(String[] args) {
    
    int numeros = 0;
    int contador = 0;
    int media = 0;
    int impares = 0;
    int mayor = 0;
    
    System.out.print("Introduce numeros. \nPara detener el programa, introduce un numero negativo\n");
    
    do {
      numeros=Integer.parseInt(System.console().readLine());
    
    if (numeros >=0) {
      contador ++;
      if ((numeros%2)==1) {
        impares += numeros;
        media++;
    } else {
      if (numeros > mayor)
      mayor = numeros;
    }
  }
  } while (numeros >=0);
  
    System.out.println("El numero de numeros introducido es: " + (contador));
    System.out.println("La media de los numeros impares es: " + (impares/media));
    System.out.println("El numero par mayor es: " + mayor);
  }
}
    
