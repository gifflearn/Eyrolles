package exo.chap05_heritage;
class Point61
{ public void setPoint (int x, int y)  { this.x = x ; this.y = y ; }
  public void deplace (int dx, int dy) { x += dx ; y += dy ; }
  public void affCoord ()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
class PointNom61 extends Point61 {
	
  public void setPointNom (int x,int y,String nom) {
	  super.setPoint(x,y);
	  setNom(nom);
  }
  
  public void setNom (String nom) {
	  this.nom = nom;
  }
  
  public void affCoordNom() {
	  super.affCoord();
	  System.out.println("Nom : " + nom);
  }
  
  private String nom;	
}
public class JF_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PointNom61 pp = new PointNom61();
		pp.setPointNom(6, 8, "sixhuit");
		pp.affCoordNom();
	}

}
