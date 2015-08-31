package exo.chap05_heritage;
class Point63
{ public Point63 (int x, int y)  { this.x = x ; this.y = y ; }
  public void affiche()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
class PointNom63 extends Point63 {

	 public PointNom63 (int x,int y,char nom) {
		 super(x,y);
		 this.nom = nom;
	 }
	 
	 public void affiche() {
		 super.affiche();
		 System.out.println("Nom = " + nom);
	 }
	 private char nom;
}
public class JF_63 {

	public static void main(String[] args) {
		
		PointNom63 pp = new PointNom63(5, 5, 'K');
		pp.affiche();
	}
}
