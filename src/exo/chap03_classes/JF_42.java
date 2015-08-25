package exo.chap03_classes;
class Pooint
{ public Pooint (double x, double y)          { this.x = x ; this.y = y ; }
  public void deplace (double dx, double dy) { x += dx ;  y += dy ; }
  public double abscisse () { return x ; }
  public double ordonnee () { return y ; }
  
  public void homothetie(double dx) {
	this.x *= dx;
	this.y *= dx;
  }
  
  public void rotation(double th){
	    double r = Math.sqrt (x*x + y*y) ;
	    double t = Math.atan2 (y, x) ;
	    t += th ;
	    x = r * Math.cos(t) ;
	    y = r = Math.sin(t) ;
  }
  
  public void afficheCart() {
	 System.out.println("Coordonnes Cartesiennes : " + x + "  " + y); 
  }
  
  public double rho() {
	  return Math.sqrt (x* x + y* y) ;
	  }
  
  public double theta () {
	  return Math.atan2( y, x) ;
	  }

  public void affichePol() {
	  System.out.println ("Cordonnees polaires = " + Math.sqrt (x*x + y*y)
              + " " + Math.atan2 (y, x) ) ;
  }
  private double x,y;
  
}

public class JF_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pooint a ;
	    a = new Pooint(1, 1) ;       a.afficheCart() ; a.affichePol() ;
	    a.deplace(-1, -1) ;         a.afficheCart() ; a.affichePol() ;
	    Pooint b = new Pooint(1, 0) ; b.afficheCart() ; b.affichePol() ;
	    b.homothetie (2) ;          b.afficheCart() ; b.affichePol() ;
	    b.rotation (Math.PI) ;      b.afficheCart() ; b.affichePol() ;
	}

}
