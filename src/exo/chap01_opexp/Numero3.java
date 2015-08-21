package exo.chap01_opexp;

public class Numero3 {

	public static void main(String[] args) {
		
		double x1 = 1e200, x2 = 1e210;
		double y,z;
		y = x1*x2;
		
		System.out.println(" Valeur de y : " + y);

		//
		x2 = x1;
		z = y/(x2-x1);
		System.out.println(y +" divisé par " + (x2-x1) + " = " + z);
		
		//
		y =15;
		z = y/(x2-x1);
		System.out.println(y +" divisé par " + (x2-x1) + " = " + z);
		
		//
	int i=10,j=6;
	if ( i<15 || j++<10) {
	System.out.println("i= "+i+" j = "+ j);
		
	}
	
	}
}
	
