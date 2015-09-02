package exo.chap05_heritage;
class Point73
{ public Point73 (double x, double y) { this.x=x ; this.y=y ; }
  public void deplace (double dx, double dy) { x+=dx ; y+=dy ; }
  public void affiche ()
  { System.out.println ("Point73 de coordonnees " + x + " " + y) ;
  }
  public double getX() { return x ; }
  public double getY() { return y ; }
  private double x, y ;
}

class Cercle73 extends Point73 {

	
	public Cercle73 (double x, double y, double ray) {
	
		super(x, y);
		this.rayon = ray;
	}
	
	public void deplaceCentre (double dx,double dy) {
		super.deplace(dx, dy);
	}
	
	public void changeRayon (double newray) {
		this.rayon = newray;
	}
	
	public Point73 getCentre() {
		// return this; // on fait ça le type de getCentre est Cercle73 et donc la méthode affiche est celle de Cercle73 
		Point73 center = new Point73(getX(), getY());
		return center; // de cette façon le type retourné est bien un Point73
	}
	
	public void affiche() {
		System.out.println(" Coords centre : " + getX() +" , " +getY() + " Rayon : " + rayon);
		
	}
	private double rayon;
}

public class JF_73 {

	public static void main(String[] args) {
		
		Cercle73 cer1 = new Cercle73(2, 2, 50);
		cer1.affiche();
		cer1.deplaceCentre(5, 5);
		cer1.affiche();
		cer1.getCentre().affiche(); // voir comment dans getCentre
		
	}
}
