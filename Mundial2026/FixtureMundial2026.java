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
				"Argentina",
				"Argelia",
				"16/06/2026",
				"Kansas City"
				);
				
		 Partido partido3 = new Partido(
				 "Portugal",
				 "RD Congo",
				 "17/06/2026",
				 "Houston"
				 );
		 
		 partido1.jugarPartido();
		 partido2.jugarPartido();
		 partido3.jugarPartido();
		 
		 partido1.mostrarResultado();
		 partido2.mostrarResultado();
		 partido3.mostrarResultado();
		 
		}
	}

