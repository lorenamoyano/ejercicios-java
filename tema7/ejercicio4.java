public class ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra un número, su cuadrado y su cubo.");
    
    int [] numero = new int[20];
    int [] cuadrado = new int[20];
    int [] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i]*numero[i];
      cubo[i] = numero[i]*numero[i]*numero[i];
    }
    
    
    
    System.out.println("Numero | Cuadrado |   Cubo");
    for (int i = 0; i <20; i++) { //con este for generamos las 20 filas que necesitamos para mostrar los numeros
      System.out.printf("%6d | %8d | %8d\n", numero[i] , cuadrado[i] , cubo[i]);
    }
  }
}

