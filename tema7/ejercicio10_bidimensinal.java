public class ejercicio10_bidimensinal {
  
  static final String jugador = "•";
  static final String ordenador = "X";
  
  public static void main(String[] args) {
    
    System.out.println("Juego de 3 en raya");
    
    
    //declaración de las variables
    
    String [][] tablero = new String[3][3];
    int fila;
    int columna;
    String coordenadas;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    String nombreFila = "cba";
    
    
    for (fila = 0; fila <3; fila++) {
      for (columna = 0; columna <3; columna++) {
        tablero[fila][columna] = " ";
      }
    }
    
    
    //iniciamos el juego
    do {
      System.out.println(" □□□□□□□□□□□□");
      
      
      //pintamos el tablero
      for (fila = 0; fila <3; fila++) {
        for (columna = 0; columna <3; columna++) {
          System.out.print("□ " + tablero [fila][columna] + " ");
        }
        System.out.print("□□");
        System.out.println(" □□□□□□□□□□□□");
      }
      System.out.println("  1   2   3\n");
      
      
      //le pedimos al usuario las coordenadas
      System.out.print("Introduce las coordenadas (p.e: a1): ");
      coordenadas = System.console().readLine();
      int filas = nombreFila.indexOf(coordenadas.charAt(0)); //cogemos el primer valor de las coordenadas introducidas por el usuario y lo guardamos en una variable filas
      int columnas = coordenadas.charAt(1)-1-48; //hacemos lo mismo con las columnas que serían el segundo valor
      tablero[filas][columnas] = jugador; //igualamos las coordenadas a la variable jugador
      movimientos++; //y sumamos un movimiento que nos hará falta más adelante
      
      
      //ponemos todas las coordenadas que puede introducir el usuario
      jugadorGana = ((tablero[0][0] == jugador) && (tablero [0][1] == jugador) && (tablero [0][2] == jugador)
      || (tablero [1][0] == jugador) && (tablero [1][1] == jugador) && (tablero [1][2] == jugador) 
      || (tablero [2][0] == jugador) && (tablero [2][1] == jugador) && (tablero [2][2] == jugador)
      || (tablero [0][0] == jugador) && (tablero [1][0] == jugador) && (tablero [2][0] == jugador)
      || (tablero [0][1] == jugador) && (tablero [1][1] == jugador) && (tablero [2][1] == jugador)
      || (tablero [0][2] == jugador) && (tablero [1][2] == jugador) && (tablero [2][2] == jugador)
      || (tablero [0][0] == jugador) && (tablero [1][1] == jugador) && (tablero [2][2] == jugador)
      || (tablero [0][2] == jugador) && (tablero [1][1] == jugador) && (tablero [2][0] == jugador));
      
      
      //si el jugador no ha ganado y el numero de movimientos es inferior de 9 (el numero total de casillas del tablero) juga el ordenador
      if(!jugadorGana && (movimientos < 9)) {
        do {
          //inicamos un bucle que nos dé números aleatorios en las filas y columnas para que juegue el ordenador y se ejecutará hasta que no haya casillas en blanco
          fila=(int)(Math.random()*3);
          columna=(int)(Math.random()*3);
        } while (!tablero[fila][columna].equals(" "));
            
        tablero[fila][columna] = ordenador;
        movimientos++;
        
        
        //posiciones en las que puede ponerse el ordenador
        ordenadorGana = ((tablero[0][0] == ordenador) && (tablero [0][1] == ordenador) && (tablero [0][2] == ordenador)
        || (tablero [1][0] == ordenador) && (tablero [1][1] == ordenador) && (tablero [1][2] == ordenador) 
        || (tablero [2][0] == ordenador) && (tablero [2][1] == ordenador) && (tablero [2][2] == ordenador)
        || (tablero [0][0] == ordenador) && (tablero [1][0] == ordenador) && (tablero [2][0] == ordenador)
        || (tablero [0][1] == ordenador) && (tablero [1][1] == ordenador) && (tablero [2][1] == ordenador)
        || (tablero [0][2] == ordenador) && (tablero [1][2] == ordenador) && (tablero [2][2] == ordenador)
        || (tablero [0][0] == ordenador) && (tablero [1][1] == ordenador) && (tablero [2][2] == ordenador)
        || (tablero [0][2] == ordenador) && (tablero [1][1] == ordenador) && (tablero [2][0] == ordenador));
      }
        
        
    
    //el bucle se ejecuta hasta que el ordenador o el jugador ganan o en su defecto hasta que se llenen todas las casillas (9 movimientos)  
    } while (!jugadorGana && !ordenadorGana && (movimientos < 9));
    
    
    //volvemos a pintar el programa para que nos muestre el final
    System.out.println(" □□□□□□□□□□□□");
      for (fila = 0; fila <3; fila++) {
        for (columna = 0; columna <3; columna++) {
          System.out.print("□ " + tablero [fila][columna] + " ");
        }
        System.out.print("□□");
        System.out.println(" □□□□□□□□□□□□");
      }
      System.out.println("  1   2   3\n");
      
      
      //sacamos por pantalla los mensajes para cada una de las 3 opciones que se pueden dar.
      if (jugadorGana) {
        System.out.print("¡Bien, has ganado!");
      } else if (ordenadorGana) {
        System.out.print("Lo siento, has perdido. Gana el ordenador");
      } else {
        System.out.print("Habéis empatado.");
      }
    
  }
}
    
