package exo.chap03_classes;
class Pointf 
{ 
	public Pointf (int abs, int ord) { x = abs ; y = ord ; } 
	public void affiche () { System.out.println (" Coordonnees " + x + " " + y) ; } 
	private double x ; // abscisse 
	private double y ; // ordonnee 
	
	public static Pointf MaxNorme (Pointf a,Pointf b) {
		double na = a.x* a.x + a.y* a.y ; 
		double nb = b.x* b.x + b.y* b.y ; 
		if (na > nb) return a ; else return b ;
	}
	
}
public class normeJF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pointf a = new Pointf(2,5);
		Pointf b = new Pointf(3,5);
		Pointf.MaxNorme(a,b).affiche();
		
	}

}
