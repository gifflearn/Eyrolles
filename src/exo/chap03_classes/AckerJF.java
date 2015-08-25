package exo.chap03_classes;
import tools.Clavier;

class Tool1 {
	
	public static int AckerJF(int m,int n) {
		if ( (m<0) || (n<0) ) return 0;
		else if (m==0) return n+1;
		else if (n==0) return AckerJF(m-1,1);
		else return AckerJF(m-1, AckerJF(m, n-1));
	}
	
}
public class AckerJF {

	public static void main (String args[])
	  { int m, n ;
	    System.out.print ("Premier parametre : ") ;
	    m = Clavier.lireInt() ;
	    System.out.print ("Second parametre  : ") ;
	    n = Clavier.lireInt() ;
	    System.out.println ("acker (" + m + ", " + n + ") = " + Tool1.AckerJF(m, n)) ;
	  }
}
