public class ejercicio7_bidimensinal {
  
  static final int vacio = 0;
  static final int mina = 1;
  static final int tesoro = 2;
  static final int intento = 3;
  
  public static void main(String[] args) {
    
    int [] [] cuadrante = new int[5][4];
    int x;
    int y;
    
    //pintamos el tablero con un array
    
    for (x = 0; x < 4; x++) {
      for (y = 0; y < 3; y++) {
        cuadrante[x] [y] = vacio;
      }
    }
    
    //ponemos la mina
    int minaX = (int)(Math.random()*4); //colocamos la mina de la x
    int minaY = (int)(Math.random()*3); //colocamos la mina de la y
    cuadrante[minaX][minaY] = mina;
    
    //ponemos el tesoro
    int tesoroX;
    int tesoroY;
    
    do {
      tesoroX = (int)(Math.random()*4); //colocamos el tesoro en la x
      tesoroY = (int)(Math.random()*3);
    } while ((minaX == tesoroX) && (minaY == tesoroY)); //ejecutamos el bucle mientras que las celdas de la mina sean iguales que las celdas del tesoro
    cuadrante[tesoroX][tesoroY] = tesoro; //una vez que tenemos las celdas, las guardamos en el array de tesoro
    
    System.out.println("Busca el tesoro");
    
    boolean fin = false;
    String c = "";
    do {
      for (y=3; y>=0; y--) { //restamos porque queremos pintar de arriba a abajo quitando uno
        System.out.print(y + "|");
        for (x=0; x<5; x++) {
          if(cuadrante[x][y] == intento) {
            System.out.print("X ");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
        System.out.println(" -----------\n 0 1 2 3 4\n");
        /*pintamos todo el cuadrante y si las coordenadas del cuadrante coinciden con las que el usuario introduzca
         * pintamos una X, sino pintamos un espacio en blanco*/
      
      //pedir las coordenadas al usuario
      System.out.print("Introduzca la coordenada de x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la coordenada de y: ");
      y = Integer.parseInt(System.console().readLine());
      
      //saber que tiene que pintar el programa en cada coordenada
      switch (cuadrante[x][y]) {
        case vacio:
        cuadrante[x][y] = intento;
        //comprobamos las coordenadas para saber si tenemos una mina cerca
        if ((Math.abs(x-minaX) < 2) && (Math.abs(y-minaY) < 2)) {
          System.out.print("Cuidado, hay una mina cerca\n");
        }
        break;
        
        case mina:
        System.out.print("Lo siento, has perdido\n");
        fin = true; //ponemos el boolean en true para que nos saque del juego
        break;
        
        case tesoro:
        System.out.print("Enhorabuena, has encontrado el tesoro\n");
        fin = true; //si encontramos el tesoro, el boolean se vuelve verdadero y también nos saca del juego
        break;
        
      }
    } while (!fin); //ejecutamos el bucle mientras que el boolean sea falso, una vez que sea verdadero, nos salimos
    
    //pintamos el cuadrante con todo ya
    
    for (y=3; y>=0; y--) {
      System.out.print(y + " ");
      for (x= 0; x<5; x++) {
        switch(cuadrante[x][y]) {
          case vacio:
          c = " ";
          break;
          
          case mina:
          c = "* ";
          break;
          
          case tesoro:
          c = "E ";
          break;
          
          case intento:
          c = "x ";
          break;
          
        }
        System.out.print(c); //hacemos que se imprima por pantalla la variable c
      }
      System.out.println();
    }
    System.out.println(" -----------\n 0 1 2 3 4\n");
  }
}
