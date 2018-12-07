  package matematicas;
  
  public class varias {


    /*muestra si el número introducido es primo o no
     * hacemos un bucle empezando desde el 2 porque un número entre 1 siempre va a ser divisible.
     * si al dividir el número por cada uno de los números del bucle nos da 0 en cualquier momento, 
     * significa que cuenta con más de un divisor y por tanto no es primo y nos devuelve falso.
     * Si es el caso contrario, nos devuelve el valor verdadero y por tanto sería primo*/
     
    public static boolean esPrimo (long num) {
      

      
      for (long i = 2; i < num; i++) {
        if (num % i  == 0) {
          return false;
        }
      }
      return true;
    }
    
    
    /* para darle la vuelta a un número primero necesitamos declarar dos variables que serán donde iremos guardando las cifras (o números)
     * y otra para el número volteado.
     * Iniciamos un bucle while para que en caso de que el número introducido sea distinto de 0, se ejecute el bucle.
     * El bucle nos divide primero el número que hemos introducido y nos guarda el resto de 10 en la variable número.
     * Ahora para poner los números en orden inverso, multiplicamos los números que tenemos en la variable inverso por 10 y le sumamos
     * la cifra (número) que teníamos guardada.
     * Por último dividimos el número que hemos introducido entre 10 y nos quedamos con su cociente.*/
     
    public static long volteo (long num) {
      long numero = 0;
      long inverso = 0;
      while(num !=0) {
        numero = num%10;
        inverso = (inverso*10) + numero;
        num/=10;
      }
      return inverso;
    }
    
    
    /* para saber si un número es capicua usamos la función que hemos creado antes para darle la vuelta al número
     * y sólo tenemos que ver si el número inverso es igual que el número introducido por teclado*/
    
    public static boolean capicua (long num) {
    return num == volteo(num);
  }
  
  /* Ayudándonos de la función esPrimo, lo único que tenemos que hacer es un bucle nuevo donde el se ejecute siempre que el número
   * sea diferente del número introducido y a ese nos vaya sumando uno*/
  
    public static long siguientePrimo (long num) {
      while (!esPrimo(++num))
      {
      };
      
      return num;
    }
    
    /*public static int potencia (int base, int exponente) {
      int resultado = 1;
      int num = 1;
      
      if (exponente == 0) {
        resultado = 1;
      }
      if (exponente < 0) {
        resultado = 1/potencia (base, -exponente);
      }
      
      
      for (int i = 0; i < Math.abs(exponente); i++) {
        resultado = num * base;
      }
      
      return resultado;
    }
    * */
    
    public static long cuentaDigitos (long num) {
      if (num == 0) {
        return 1;
      }
      int contador = 0;
      while (num > 0) {
        num = num/10;
        contador++;
      }
      
      return contador;
    }
    
    public static int posicionDigito (int num) {
      num = (int)volteo(num);
      int posicion = 0;
      while (posicion-- > 0) {
        num = num/10;
      }
        return (int)num%10;
      }
}

