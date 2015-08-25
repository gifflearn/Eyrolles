package exo.chap03_classes;
class ABC { 
	
	public ABC (int nn) {n = nn ; } 
	public int getn () { return n ; } 
	public void setn (int nn) { n = nn ; } 
	private int n ; 
	
} 

class Uttil { 
	public static void incre (ABC a, int p) { 
		a.setn (a.getn() + p); 
		} 

	public static void incre (int n, int p) { 
		n += p ;
		}

}

public class JF_40 {
	
	public static void main (String args[]) {
		
		ABC a = new ABC( 2) ;
		int n = 2 ;
		System.out.println (" valeur de a avant : " + a.getn()) ;
		Uttil.incre (a, 5) ; 
		System.out.println (" valeur de a apres : " + a.getn()) ; 
		System.out.println (" valeur de n avant : " + n) ; 
		Uttil.incre (n, 5) ; 
		System.out.println (" valeur de n apres : " + n) ; 
		
	}

}
