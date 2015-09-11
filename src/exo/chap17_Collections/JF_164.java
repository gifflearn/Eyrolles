package exo.chap17_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cercl { 
	public Cercl (int x, int y, double rayon) { 
		this.x = x ; 
		this.y = y ; 
		this.rayon = rayon ; } 
	public void affiche () { 
		System.out.println (" Coordonnees : " + x + ", " + y + " ; rayon : " + rayon) ; } 
	public double getRayon () { return rayon ; } 
	public int getX () { return x ; } private int x, y ; double rayon ; 
}

class compCerclRayon implements Comparator<Cercl> {
	public int compare(Cercl pcer1,Cercl pcer2) {
		if (pcer1.getRayon()==pcer2.getRayon()) return 0;
		else if  (pcer1.getRayon()>pcer2.getRayon()) return 1;
		else return -1;
		// On  pourrait aussi utiliser compareTo de la classe Double ( moyennant conversion de double en Double ):
		// return (( Double)( c1. getRayon())). compareTo(( Double)( c2. getRayon())) ;
	}
}
	
class compCerclAbs implements Comparator<Cercl> {
		public int compare(Cercl pcer1,Cercl pcer2) {
			if (pcer1.getX()==pcer2.getX()) return 0;
			else if  (pcer1.getX()>pcer2.getX()) return 1;
			else return -1;
		}
}

public class JF_164 {
	



		public static void main (String args[])
		  { ArrayList <Cercl> liste = new ArrayList <Cercl> () ;
		    Cercl c1 = new Cercl (5, 3, 5.0) ; 
		    Cercl c2 = new Cercl (1, 9, 3.5) ;
		    Cercl c3 = new Cercl (2, 9, 2.5) ; 
		    liste.add (c1) ; liste.add (c2) ; liste.add (c3) ;
	
    // tri suivant le rayon du cercle
		    Collections.sort (liste, new compCerclRayon () ) ; // la liste est alors triée
		    System.out.println ("-- Cercles tries par rayon croissant") ;
		    for (Cercl c : liste) c.affiche () ;
		    
		    
	// tri suivant l'abcisse du cercle
		    Collections.sort (liste, new Comparator <Cercl> ()  // Utilisation d'une classe anonyme !!
		         { public int compare (Cercl c1, Cercl c2)
		           { double x1 = c1.getX () ; double x2 = c2.getX () ;
		             if (x1 < x2) return -1 ;
		               else if (x1 == x2) return 0 ;
		                 else return 1 ;
		           }
		         } ) ;
		    System.out.println ("-- Cercles tries par abscisse croissante") ;
		    for (Cercl c : liste) c.affiche () ;
		  }
	}

