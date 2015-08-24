package exo.chap03_classes;
class Pointff 
{ 
	public Pointff (int abs, int ord) { x = abs ; y = ord ; } 
	public void affiche () { System.out.println (" Coordonnees " + x + " " + y) ; } 
	private double x ; // abscisse 
	private double y ; // ordonnee 
	
	public Pointff MaxNorme (Pointff a) {
		double na = a.x* a.x + a.y* a.y ; 
		double nb = this.x* this.x + this.y* this.y ; 
		if (na > nb) return a ; else return this ;
	}
	
}
public class Norme2JF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pointff a = new Pointff(2,5);
		Pointff b = new Pointff(3,5);
		a.MaxNorme(b).affiche();
		
	}

}
