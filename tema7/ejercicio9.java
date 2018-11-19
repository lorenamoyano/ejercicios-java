public class ejercicio9 {
  public static void main(String[] args) {
    
    int [] numeroIntroducido = new int[8];
    
    for (int i = 0; i <8; i++) {
      System.out.print("Introduzca un numero: ");
      numeroIntroducido[i] = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido[i] % 2 == 0) {
        System.out.print(numeroIntroducido[i] + " par\n");
      } else {
        System.out.print(numeroIntroducido[i] + " impar\n");
      }
    }
  }
}
