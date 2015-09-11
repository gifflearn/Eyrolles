package exo.chap17_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cerc implements Comparable<Cerc>{ 
	public Cerc (int x, int y, double rayon) { 
		this.x = x ; 
		this.y = y ; 
		this.rayon = rayon ; } 
	public void affiche () { 
		System.out.println (" Coordonnees : " + x + ", " + y + " ; rayon : " + rayon) ; } 
	public double getRayon () { return rayon ; } 
	public int getX () { return x ; } private int x, y ; double rayon ; 
	public int compareTo(Cerc pcer){
		// On  pourrait aussi utiliser compareTo de la classe Double ( moyennant conversion de double en Double ):
		return (( Double)( rayon)). compareTo(( Double)( pcer. rayon)) ;
		
	}
	
}


public class JF_165 {
	



		public static void main (String args[])
		  { ArrayList <Cerc> liste = new ArrayList <Cerc> () ;
		    Cerc c1 = new Cerc (5, 3, 5.0) ; 
		    Cerc c2 = new Cerc (1, 9, 3.5) ;
		    Cerc c3 = new Cerc (2, 9, 2.5) ; 
		    liste.add (c1) ; liste.add (c2) ; liste.add (c3) ;
		    
		    // Tri
		    Collections.sort(liste);
		    System.out.println ("-- Cercles tries par rayon croissant") ; 
		    for (Cerc c : liste) c.affiche () ;
	}
}