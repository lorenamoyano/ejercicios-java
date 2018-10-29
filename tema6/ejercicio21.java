public class ejercicio21 {
  public static void main(String[] args) {
    
    int moneda = 0;
    String monedaValor = "";
    int CaraCruz = 0;
    String posicion = "";
    
    for (int i = 1; i<=5; i++) {
      moneda = (int)(Math.random()*8)+1;
      
      switch (moneda) {
        case 1:
        monedaValor = "1 centimo";
        break;
        
        case 2:
        monedaValor = "2 centimos";
        break;
        
        case 3:
        monedaValor = "5 centimos";
        break;
        
        case 4:
        monedaValor = "10 centimos";
        break;
        
        case 5:
        monedaValor = "20 centimos";
        break;
        
        case 6:
        monedaValor = "50 centimos";
        break;
        
        case 7:
        monedaValor = "1 euro";
        break;
        
        case 8:
        monedaValor = "2 euros";
        break;
        
        default:
        
      }
      
      CaraCruz = (int)(Math.random()*2)+1;
      
      switch (CaraCruz) {
        case 1:
        posicion = "cara";
        break;
        
        case 2:
        posicion = "cruz";
        break;
        
        default:
        
      }
      
    System.out.println(monedaValor + " - " + posicion);
    
    }
  }
}
        
