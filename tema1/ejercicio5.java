public class ejercicio5 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";


    System.out.println("Lunes Martes Miercoles Jueves Viernes");
    System.out.println("----------------------------------------");
    System.out.printf("%-5s %10s %13s %12s %12s\n", rojo + "SINF", naranja + "PRO", morado + "EED", morado + "EED", rojo + "SINF");
    System.out.printf("%-5s %10s %13s %12s %12s\n", rojo + "SINF", naranja + "PRO", blanco + "LM", naranja + "PRO", rojo + "SINF");
    System.out.printf("%-5s %10s %13s %12s %12s\n", rojo + "SINF", naranja + "PRO", blanco + "LM", naranja + "PRO", rojo + "SINF");
    System.out.printf("%-5s %11s %13s %12s %12s\n", verde + "FOL", azul + "BBDD", naranja + "PROG", azul + "BBDD", morado + "EED");
    System.out.printf("%-5s %11s %13s %12s %12s\n", verde + "FOL", azul + "BBDD", naranja + "PROG", azul + "BBDD", blanco + "LM");
    System.out.printf("%-5s %11s %13s %12s %12s\n", verde + "FOL", azul + "BBDD", naranja + "PROG", azul + "BBDD", blanco + "LM");
  }
}
