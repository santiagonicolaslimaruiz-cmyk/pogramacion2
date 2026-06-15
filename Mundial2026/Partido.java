package Mundial2026;

public class Partido implements Jugable {
    
          private String equipoLocal;
          private String equipoVisitante;
          private String fecha;
          private String estadio;
          private int golesLocal;
          private int golesVisitante;
          
          // Constructor
          public Partido (String equipoLocal, String equipoVisitante, String fecha, String estadio) {
        	  this.equipoLocal = equipoLocal;
        	  this.equipoVisitante = equipoVisitante;
        	  this.fecha = fecha;
        	  this.estadio = estadio;
        	  this.golesLocal = 0;
        	  this.golesVisitante = 0;
        	  
          }
          
          // Método para cargar el resulatado del partido
          @Override
          public void jugarPartido()  {
        	  // resultado de ejemplo
        	  golesLocal = (int) (Math.random() * 6);
        	  golesVisitante = (int) (Math.random() * 6);
        	  
          }
          
          // Método para cargar el resultado del partido
          @Override
          public void mostrarResultado() {
              System.out.println("-----------------------------------------");
              System.out.println("Partido del Mundial 2026");
              System.out.println("Fecha: " + fecha);
              System.out.println("Estadio: " + estadio);
              System.out.println(equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);
              
              if (golesLocal > golesVisitante) {
            	  System.out.println("Ganador; " + equipoLocal);
              } else if (golesVisitante > golesLocal) {
            	  System.out.println ("Ganador: " + equipoVisitante);
              } else {
            	  System.out.println("Resultado: Empate");
      }
    }
}
