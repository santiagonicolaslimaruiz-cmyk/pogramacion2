package Mundial2026;

public class FixtureMundial2026 {

	public static void main(String[] args) {
		
		Partido partido1 = new Partido(
			"Uruguay",
			"Arabia Saudita",
			"15/06/2026",
			"Miami Gardens"
			);
		
		Partido partido2 = new Partido(
				"Irak",
				"Noruega",
				"16/06/2026",
				"Foxborough"
				);
				
		 Partido partido3 = new Partido(
				 "Portugal",
				 "RD Congo",
				 "17/06/2026",
				 "Houston"
				 );
		 Partido partido4 = new Partido(
				 "Mexico",
				 "Corea del Sur",
				 "18/06/2026",
				 "Zapopan"
				 );
		 Partido partido5 = new Partido(
				 "Brasil",
				 "Haití",
				 "19/06/2026",
				 "Filadelfia"
				 );
		 Partido partido6 = new Partido(
				 "Ecuador",
				 "Curazao",
				 "20/06/2026",
				 "Kansas City"
				 );
		 
		 partido1.jugarPartido();
		 partido2.jugarPartido();
		 partido3.jugarPartido();
		 partido4.jugarPartido();
		 partido5.jugarPartido();
		 partido6.jugarPartido();
		 
		 partido1.mostrarResultado();
		 partido2.mostrarResultado();
		 partido3.mostrarResultado();
		 partido4.mostrarResultado();
		 partido5.mostrarResultado();
		 partido6.mostrarResultado();
		}
	}

