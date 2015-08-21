package exo.chap01_opexp;

public class ErrConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n,p;
	float x;
	
	n= 1234;
	x = n;
	System.out.println("n : " + n + " x : " + x );
	//
	n= 123456789;
	x =n;
	System.out.println("n : " + n + " x : " + x );
	//
	int na = (int) x;
	System.out.println("ecart : " + (na-n));
	
	// Cast	
	n =10;
	p = 3;
	System.out.println("Resultat (double)(n/p) : " + (double)(n/p));
	// c'est le resultat de n/p qui est converti
	System.out.println("Resultat (double)n/p : " + (double)n/p);
	// n est converti puis on fait la division par p
	}

}
