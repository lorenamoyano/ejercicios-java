public class ejercicio6 {
  public static void main(String[] args) {
    
    int numeroAdivinar;
    int vidas = 5;
    int numeroIntroducido = 0;
    
    for (int i = 1; i<=1; i++) {
      numeroAdivinar = (int)(Math.random()*101+10);
      
      while (vidas >0) {
        System.out.print("\nAdivine el numero (del 0 al 100): ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
          if (numeroIntroducido == numeroAdivinar) {
            System.out.print("\nNumero acertado");
            break;
          } else {
            System.out.print("\nNumero incorrecto");
            vidas--;
            if (numeroIntroducido < numeroAdivinar) {
              System.out.print("\nEl numero que tienes que introducir es mayor");
            } else {
              System.out.print("\nEl numero que tienes que introducir es menor");
            }
          }
        }
        System.out.print("\nSe acabaron las vidas. \nEl numero era: " + numeroAdivinar);
      }
    }
  }

