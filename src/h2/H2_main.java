package h2;

public class H2_main {
	public static void main(String[] args) { 
		
		int n = 67;
		int digits;
		int [] a = {0,0,0,0,0,0,0,0,0};
		
		digits = String.valueOf(n).length();
		
		for (int j = 0; j<digits; j++) {
			a[8-j] = n % 10;
			n = n/10;
		}
		
		for (int i=0;i<9; i++) {
			System.out.println(a[i]);
			
		}
	}
}

