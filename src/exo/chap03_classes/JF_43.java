package exo.chap03_classes;
class Poiint
{ public Poiint (double x, double y)          { 
	
	rho = Math.sqrt(x*x + y*y);
	theta = Math.atan(y/x) ; 
	
	}

  public void deplace (double dx, double dy) {
	  
	    double x = rho * Math.cos(theta) + dx ;
	    double y = rho * Math.sin(theta) + dy ;
	    rho = Math.sqrt (x*x + y*y) ;
	    theta = Math.atan2 (y, x) ;
	  
  }
  
  public double abscisse () { 
	  return rho*Math.cos(theta) ; 
	  }
  
  public double ordonnee () {
	  
	  return rho*Math.sin(theta);
	  
  }
  
  public void homothetie(double dx) {
	  rho *= dx ;
  }
  
  public void rotation(double th){
	  theta += th ;
  }
  
  public void afficheCart ()
  { System.out.println ("Cordonnees cartesiennes = " + rho*Math.cos(theta)
                         + " " + rho*Math.sin(theta) ) ;
  }
  public void affichePol ()
  { System.out.println ("Cordonnees polaires = " + rho + " " + theta) ;
  }
  
  public double rho() {// c'est la longueur du segment
	  return rho ;
	  }
  
  public double theta () { // c'est l'angle du segment
	  return theta;
	  }

  
  private double rho,theta;
  
}

public class JF_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poiint a ;
	    a = new Poiint(1, 1) ;       a.afficheCart() ; a.affichePol() ;
	    a.deplace(-1, -1) ;         a.afficheCart() ; a.affichePol() ;
	    Poiint b = new Poiint(1, 0) ; b.afficheCart() ; b.affichePol() ;
	    b.homothetie (2) ;          b.afficheCart() ; b.affichePol() ;
	    b.rotation (Math.PI) ;      b.afficheCart() ; b.affichePol() ;
	}

}
