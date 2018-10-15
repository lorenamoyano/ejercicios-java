public class ejercicio16 {
  public static void main(String [] args) {
    
    System.out.print("Este test le dira si su pareja le es infiel \n");
    System.out.print("Introduce v para verdadero o f para falso \n");
    
    System.out.print("Tu pareja es hombre o mujer? \n");
    String genero = System.console().readLine();
    
    String respuesta;
    int puntos = 0;
    
    
    System.out.print("1. Tu pareja parece estar mas inquieta de los normal sin ningún motivo aparente \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("2. Ha aumentado sus gastos de vestuario \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("3. Ha perdidio el interes que mostraba anteriormente por ti \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    if (genero.equals("hombre")) {
      System.out.print("4. Ahora se afeita y se asea con mas frecuencia \n");
      respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    } else {
      System.out.print("4. Ahora se arregla el pelo y se asea con mas frecuencia \n");
      respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    }
    System.out.print("5. No te deja que mires la agenda de su telefono movil \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estas tu delante \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("7. Ultimamente se preocupa mas en cuidar la linea y/o estar bronceado \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("8. Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("9. Has notado que ultimamente se perfuma mas \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo \n");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    System.out.print("El resultado de tu test es: \n");
    
    if (puntos <=10) {
    System.out.print("Puntuacion de 0 a 10: ¡Enhorabuena! Tu pareja parece ser bastante fiel \n");
    }
    
    if ((puntos >=11) && (puntos <=22)) {
    System.out.print("Puntuacion entre 11 y 22: Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia \n");
    }
    
    if (puntos >=23) {
    System.out.print("Puntuacion entre 23 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigües que es lo que esta pasando por su cabeza. \n");
    }
  }
}
