package exo.chap03_classes;
class PPoint
{ public PPoint (double x, double y)          { this.x = x ;  this.y = y ; }
  public void deplace (double dx, double dy) { x += dx ;     y += dy ;    }
  public double getX() { return this.x;}
  public double getY() { return this.y;}
  public void setX(double nx) { 
	  this.x = nx;
	  }
  public void setY(double ny) { 
	  this.y = ny;
	  }
  public void affiche ()
  { System.out.println ("coordonnees = " + x + " " + y ) ;
  }
  private double x, y ;
}

class Segmett {
	
	Segmett (PPoint origine, PPoint extremite){
		this.POrig = origine;
		this.PExtr = extremite;
	}
	Segmett (double xOr, double yOr, double xExt, double yExt){
		POrig = new PPoint(xOr,yOr);
		PExtr = new PPoint(xExt,yExt);
	}
	
	private PPoint POrig, PExtr;

	
	double Longueur(){
		
		double xOr = POrig.getX(), yOr = POrig.getY() ;
		double xExt = PExtr.getX(), yExt = PExtr.getY() ;
		return Math.sqrt ( (xExt-xOr)*( xExt-xOr) + (yExt-yOr)*( yExt-yOr) ) ;
	}
	
	void deplaceOrigine (double dx, double dy){
		POrig.setX(POrig.getX() + dx);
		POrig.setY(POrig.getY() + dy);
	}
	void deplaceExtremite (double dx, double dy){
		PExtr.setX(PExtr.getX() + dx);
		PExtr.setY(PExtr.getY() + dy);
	}
	void affiche(){
		System.out.print("Origine : ");POrig.affiche();
		System.out.print("Extreminte : ");PExtr.affiche();
	}


}

public class JF_41 {

	public static void main(String[] args) {
		
		PPoint a = new PPoint(1, 3) ;
	    PPoint b = new PPoint(4, 8) ;
	    a.affiche() ; b.affiche() ;
	    Segmett s1 = new Segmett (a, b) ;
	    s1.affiche() ;
	    s1.deplaceOrigine (2, 5) ;
	    s1.affiche() ;
	    Segmett s2 = new Segmett (3, 4, 5, 6) ;
	    s2.affiche() ;
	    System.out.println ("longeur = " + s2.Longueur()) ;
	    s2.deplaceExtremite (-2, -2) ;
	    s2.affiche() ;
		
	}

}
