package exo.chap03_classes;
//exo27
class Pointp
{ public Pointp (int abs, int ord)      { x = abs ;  y = ord ; }
  public void deplace (int dx, int dy) { x += dx ;  y += dy ; }
  
  /*public void affiche ()
  { System.out.println ("Je suis un point de coordonnees " + x + " " + y) ;
  }*/
  
  public double abscisse(){
	  return x;
  }
  
  public double ordonnee(){
	  return y;
  }
  
  private double x ;   // abscisse
  private double y ;   // ordonnee
}
public class TstPnt
{ public static void main (String args[])
  { Pointp a ;
    a = new Pointp(3, 5) ;
    //a.affiche() ;
    System.out.println("Abscisse du point : " + a.abscisse() + " et ordonnée du point : " + a.ordonnee() );
    a.deplace(2, 0) ;
    //a.affiche() ;
    System.out.println("Abscisse du point : " + a.abscisse() + " et ordonnée du point : " + a.ordonnee() );
    Pointp b = new Pointp(6, 8) ;
    //b.affiche() ;
    System.out.println("Abscisse du point : " + b.abscisse() + " et ordonnée du point : " + b.ordonnee() );
    
    
  }
}

