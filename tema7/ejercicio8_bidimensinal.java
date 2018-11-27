public class ejercicio8_bidimensinal {
  public static void main(String[] args) {
    
    final String reset ="\033[0m";
    final String inverso = "\033[7m";
    final String blanca = " ";
    final String negra = inverso + blanca + reset;
    final String alfil = "□ ";
    final String movimientoBlanco = "• ";
    final String movimientoNegro = inverso + movimientoBlanco + reset;
    
    
    System.out.println("Este programa muestra los movimientos de un alfil en un tablero de ajedrez.");
    
    String [][] tablero = new String[9][9];
    int fila;
    int columna;
    String casilla;
    
    //pintar el tablero
    System.out.println("\n □□□□□□□□□□□□□□");
    casilla = blanca;
    for(fila=8; fila>=1; fila--) {
      System.out.print(fila + " □□");
      for (columna=1; columna<=8; columna++) {
        if ((fila%2) == 1) {
          if ((columna % 2) == 1) {
            casilla = blanca;
          } else {
            casilla = negra;
          }
        } else {
          if ((columna % 2) == 1) {
            casilla = negra;
          } else {
            casilla = blanca;
            }
          }
          
          System.out.print(casilla);
          tablero[fila][columna] = casilla;
        }
        
        System.out.println("□□");
      }
      System.out.println(" □□□□□□□□□□□□□□");
      System.out.println("    abcdefgh");
      
      
      //pedir las coordenadas
      System.out.print("Introduzca la posicion del alfil (p.e: d5): ");
      String posicionAlfil = System.console().readLine();
      int columnaAlfil = (int)(posicionAlfil.charAt(0))-96; //con charAt nos devuelve la primera letra (0) que le hayamos introducido en las coordenadas del usuario
      int filaAlfil = (int)(posicionAlfil.charAt(1))-48; //nos devuelve el segundo caracter que le hayamos introducido en los datos de usuario
      
      
      if ((((filaAlfil % 2) + (columnaAlfil % 2)) % 2) == 0) {
        tablero[filaAlfil][columnaAlfil] = alfil;
      } else {
        tablero[filaAlfil][columnaAlfil] = inverso + alfil + reset;
      }
      
      //pintar el tablero y las posiciones hacia donde puede moverse
      
      System.out.println("\n □□□□□□□□□□□□□□");
      for (fila = 8; fila >=1; fila--) {
        System.out.print(fila + " □□");
        for (columna = 1; columna <=8; columna++) {
          if((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (!((filaAlfil == fila) && (columnaAlfil == columna)))) {
            if (tablero[fila][columna] == blanca) {
              tablero[fila][columna] = movimientoBlanco;
            } else {
              tablero[fila][columna] = movimientoNegro;
            }
          }
          System.out.print(tablero[fila][columna]);
        }
        System.out.println("□□");
      }
      
      System.out.println(" □□□□□□□□□□□□□□");
      System.out.println("    abcdefgh");
      
      System.out.print("El alfil se puede mover en estas direcciones: ");
      
      for (fila = 8; fila >=1; fila--) {
        for (columna = 1; columna <=8; columna++) {
          if((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (!((filaAlfil == fila) && (columnaAlfil == columna)))) {
            System.out.print((char)(columna+96) + "" + fila + " ");
          }
        }
      }
    }
  }
