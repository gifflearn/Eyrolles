package exo.chap05_heritage;
class Point62
{ public Point62 (int x, int y)  { this.x = x ; this.y = y ; }
  public void affCoord()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
class PointNom62 extends Point62 {
	
	public PointNom62 (int x,int y,char nom){
		super(x, y);	
		this.nom =nom;
	}
	
	public void affCoordNom() {
		super.affCoord();
		System.out.println(" Mon nom est : " + this.nom);
	}
	
	private char nom;
}

public class JF_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PointNom62 pp = new PointNom62(3, 3,'A');
		pp.affCoordNom();
		
	}

}
