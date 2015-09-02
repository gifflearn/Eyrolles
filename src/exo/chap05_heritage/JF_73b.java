package exo.chap05_heritage;
class Point73b
{ public Point73b (double x, double y) { this.x=x ; this.y=y ; }
  public void deplace (double dx, double dy) { x+=dx ; y+=dy ; }
  public void affiche ()
  { System.out.println ("Point73b de coordonnees " + x + " " + y) ;
  }
  public double getX() { return x ; }
  public double getY() { return y ; }
  private double x, y ;
}

class Cercle73b  {

	
	public Cercle73b (double x, double y, double ray) {
	
		mil = new Point73b(x,y);
		this.rayon = ray;
	}
	
	public void deplaceCentre (double dx,double dy) {
		mil.deplace(dx, dy);
	}
	
	public void changeRayon (double newray) {
		this.rayon = newray;
	}
	
	public Point73b getCentre() {
		return mil;
	}
	
	public void affiche() {
		System.out.println(" Coords centre : " + mil.getX() +" , " + mil.getY() + " Rayon : " + rayon);
		
	}
	private double rayon;
	private Point73b mil;
}

public class JF_73b {

	public static void main(String[] args) {
		
		Cercle73b cer1 = new Cercle73b(2, 2, 50);
		cer1.affiche();
		cer1.deplaceCentre(5, 5);
		cer1.affiche();
		cer1.getCentre().affiche(); // voir comment dans getCentre
		
	}
}