public class ejercicio12 {
  public static void main(String[] args) {
    
    
    System.out.print("Test sobre DAW \n");
    System.out.print("Elige una de las 3 opciones escribiendo su numero \n");
    
    String respuesta;
    int respuestaPuntos = 0;
    
    System.out.print("1 - Cual es el lenguaje de programacion que mas se usa actualmente? \n");
    System.out.print("1. java\n 2. cobol\n 3. c++\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("1")) {
      respuestaPuntos +=1;
    }

    System.out.print("2 - Cual es una base de datos? \n");
    System.out.print("1. base de datos\n 2. java\n 3. MySQL\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("3")) {
      respuestaPuntos +=1;
    }
    System.out.print("3 - Cual es un lenguaje de marcas? \n");
    System.out.print("1. Unix\n 2. HTML\n 3. Unix\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("2")) {
      respuestaPuntos +=1;
    }
     
    System.out.print("4 - Que es java? \n");
    System.out.print("1. Un lenguaje de programacion\n 2. Un lenguaje de marcas\n 3. Una base de datos\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("1")) {
      respuestaPuntos +=1;
    }
    
    System.out.print("5 - Para que sirve 'select * from' en una base de datos? \n");
    System.out.print("1. Para escribir un nombre \n 2. para seleccionar una parte de un documento\n 3. Para buscar en una tabla\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("3")) {
      respuestaPuntos +=1;
    }
    
    System.out.print("6 - Cual se corresponde con un binario? \n");
    System.out.print("1. FFFFFF \n 2. 124 \n 3. 010101\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("3")) {
      respuestaPuntos +=1;
    }

    System.out.print("7 - Representa el 10 en binario \n");
    System.out.print("1. 0101 \n 2. 1010 \n 3. 1001\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("2")) {
      respuestaPuntos +=1;
    }
    
    System.out.print("8 - Cual no es un sistema de codificacion? \n");
    System.out.print("1. HTML \n 2. Binario \n 3. ASCII\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("1")) {
      respuestaPuntos +=1;
    }
         
    System.out.print("9 - Cual es el comando para limpiar la pantalla en Windows \n");
    System.out.print("1. clear \n 2. cls\n 3. csl \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("2")) {
      respuestaPuntos +=1;
    }
    
    System.out.print("10 - Cual es el estandar de las redes inalambricas bluetooth? \n");
    System.out.print("1. 802.11 \n 2. 802.16\n 3. 802.15\n");
    respuesta = System.console().readLine();
    if (respuesta.equals("3")) {
      respuestaPuntos +=1;
    }
    
    System.out.print("Tu resultado es: " + respuestaPuntos + " puntos");
  }   
}
