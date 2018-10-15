public class ejercicio10 {
  public static void main (String[] args) {
    
    System.out.print("Veamos cuál es tu horóscopo \n");
    
    System.out.print("Introduce tu mes de nacimiento (1 - 12): \n");
    int mesNacimiento = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el dia de tu nacimiento (1 - 31): \n");
    int diaNacimiento = Integer.parseInt(System.console().readLine());
    
    switch (mesNacimiento) {
      
      case 1:
        if (diaNacimiento <=20) {
        System.out.print("Capricornio");
      } else {
        System.out.print("Acuario");
      }
      break;
      
      case 2:
        if (diaNacimiento <=19) {
        System.out.print("Acuario");
      } else {
        System.out.print("Piscis");
      }
      break;
      
      case 3:
        if (diaNacimiento <=20) {
        System.out.print("Piscis");
      } else {
        System.out.print("Aries");
      }
      
      break;
      
      case 4:
        if (diaNacimiento <=20) {
        System.out.print("Aries");
      } else {
        System.out.print("Tauro");
      }
      break;
      
      case 5:
        if (diaNacimiento <=21) {
        System.out.print("Tauro");
      } else {
        System.out.print("Geminis");
      }
      break;
      
      case 6:
        if (diaNacimiento <=21) {
        System.out.print("Geminis");
      } else {
        System.out.print("Cáncer");
      }
      break;
      
      case 7:
        if (diaNacimiento <=22) {
        System.out.print("Cáncer");
      } else {
        System.out.print("Leo");
      }
      break;
      
      case 8:
        if (diaNacimiento <=22) {
        System.out.print("Leo");
      } else {
        System.out.print("Virgo");
      }
      break;
      
      case 9:
        if (diaNacimiento <=22) {
        System.out.print("Virgo");
      } else {
        System.out.print("Libra");
      }
      break;
      
      case 10:
        if (diaNacimiento <=22) {
        System.out.print("Libra");
      } else {
        System.out.print("Escorpio");
      }
      break;
      
      case 11:
        if (diaNacimiento <=22) {
        System.out.print("Escorpio");
      } else {
        System.out.print("Sagitario");
      }
      break;
      
      case 12:
        if (diaNacimiento <=21) {
        System.out.print("Sagitario");
      } else {
        System.out.print("Capricornio");
      }
      break;
    }
  
  }
}
