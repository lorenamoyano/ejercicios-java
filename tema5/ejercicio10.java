public class ejercicio10 {
  public static void main (String[] args) {
    
    System.out.print("Este programa muestra una media\n");
    System.out.print("Para parar el programa, introduzca un numero negativo\n");
    
    double numeroTotalesIntroducidos= 0; //cuenta los numeros que vamos introduciendo por teclado
    double numerosIntroducidosMedia = 0; //la media de los numeros introducidos
    double suma = 0; // la suma de los numeros introducidos
    
    while (numerosIntroducidosMedia >=0) { //para que se de la condicion, le media ha de ser siempre mayor o igual que 0
      numerosIntroducidosMedia = Double.parseDouble(System.console().readLine());
      numeroTotalesIntroducidos++; // sumamos 1 a los numeros totales introducidos por teclado para saber cuantos llevamos
      suma += numerosIntroducidosMedia; // la suma de los numeros introducidos ha de ser mayor o igual para que el programa vea que no hemos
      // metido ningun numero negativo. Por lo tanto, el programa al introducir un numero en negativo y ver que la suma no coincide
      // siendo mayor o igual, dara por finalizado el bucle y nos llevara a la parte final del programa
    }
    
    System.out.printf ("La media es: " + (suma - numerosIntroducidosMedia) / (numeroTotalesIntroducidos - 1));
    //restamos los numeros introducidos por teclado a los numeros de la media y eso lo dividimos entre los numeros totales que hayamos
    //introducido y le restamos el ultimo numero que seria el negativo que hemos usado para parar el programa
      
  }
}
