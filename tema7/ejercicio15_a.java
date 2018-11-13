public class ejercicio15_a {
  public static void main(String[] args) {
    
    int tamanio = 10;
    int comensalesPorMesa = 4;
    int[] mesas = new int[tamanio];
    
    for (int i = 0; i<tamanio; i++) {
      mesas[i] = (int)(Math.random()*(comensalesPorMesa+1));
    }
    
    int grupoEntrante;
    
    do {
      
      System.out.print("Mesa nº:  ");
      //pintar las  mesas
      for (int i=0; i<tamanio; i++) {
        System.out.printf("%3d" , i+1);
      }
      System.out.println("");
      
      System.out.print("Ocupación ");
      //pintar las  mesas ocupadas
      for (int i=0; i<tamanio; i++) {
        System.out.printf("%3d" , mesas[i]);
      }
      System.out.printf("\n\n");
      
      System.out.print("¿Cuántos sois? \n");
      grupoEntrante = Integer.parseInt(System.console().readLine());
      if (grupoEntrante != -1) {
        if ((grupoEntrante > comensalesPorMesa) || (grupoEntrante == 0)) {
          System.out.print("Lo siento, no aceptamos grupos de " + grupoEntrante + ". \nHaga grupos de " + comensalesPorMesa + ", por favor.\n");
        } else {
          //buscar mesa vacia
          boolean grupoSentado = false;
          for (int i = 0; (i<tamanio) && (grupoSentado == false); i++) { //hasta cuando se tiene que ejecutar el bucle
            if (mesas[i] == 0) {  //encontrado mesa vacia 
              mesas[i] = grupoEntrante; //en la mesa vacia metemos al grupo
              grupoSentado = true; //cambiamos la condicion a verdadero para saber si se han sentado
              System.out.println("Por favor, siententese en la mesa " + (i+1));
            }
          }
          
          //buscar un hueco si no le hemos asignado una mesa vacia. ¿como se si le he asignado una mesa?
          //si boolean estan en false significa que nunca ha estado en el if y por tanto no se han sentado
          //en caso de no estar sentados, buscar un hueco
          
          if (grupoSentado == false) {
            for (int i = 0; (i<tamanio) && (grupoSentado == false); i++) { //hasta cuando se tiene que ejecutar el bucle
            if (mesas[i] + grupoEntrante <= comensalesPorMesa) {  //encontrar un hueco 
              mesas[i] += grupoEntrante; //en la mesa añadimos el nuevo grupo
              grupoSentado = true; //cambiamos la condicion a verdadero para saber si se han sentado
              System.out.println("Lo siento, tendrán que compartir mesa, sientesen en " + (i+1));
            }
          }
          
          //si no lo hemos podido sentar es que no hay hueco para ellos
          
            if(grupoSentado == false) {
              System.out.println("Lo siento, en estos momentos no queda sitio");
            }
          }
        }
      }
    }while (grupoEntrante !=-1);
  }
}
