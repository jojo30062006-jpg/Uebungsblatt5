package h1;

public class H1_main {
	public static void main(String[] args) { 
		
		int [] myArray = {7,8,9,10};
		int [] myHilfsArray = new int [myArray.length];
		int b = myArray.length-1;
		
		for (int i = 0; i<=myArray.length -1; i ++) {
			myHilfsArray[i]=myArray[b];
			b--;
			System.out.println(myHilfsArray[i]);
			
		}
		myArray = myHilfsArray;
	}
}
