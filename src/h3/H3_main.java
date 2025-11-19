package h3;

public class H3_main {
	public static void main(String[] args) { 
	
		int [][] einheiten = {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int input = 6767676;
		
		System.out.println("Betrag: " + input + " Cent");
		

	     for (int i = 0; i < einheiten[0].length; i++) {
	          int wert = einheiten[0][i];
	          int anzahl = input / wert;
	          einheiten[1][i] = anzahl;
	          input = input % wert;
	        }
	    
	    for (int j = 0; j < einheiten[0].length; j++) {
	         if (einheiten[1][j] > 0) {
	         System.out.println(einheiten[1][j] + " x " + einheiten[0][j] + " Cent");
	         }
	        
		}
	}
}

