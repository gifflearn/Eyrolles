package exo.chap03_classes;
//exo30
class Ppoint
{ public Ppoint (int xx) { x = xx ; }
  public void affiche ()
  { System.out.println ("abscisse = " + (x-origine)) ;
    System.out.println ("   relative a une origine d'abscisse " + origine) ;
  }
  public static void setOrigine (int org) { origine = org ;  }
  public static int getOrigine()          { return origine ; }
  private static int origine ;   // abscisse absolue de l'origine courante
  private int x ;                // abscisse absolue du point
}
public class TstOrig
{ public static void main (String args[])
  { Ppoint a = new Ppoint (3) ;  System.out.print ("Point a - ") ; a.affiche() ;
    Ppoint b = new Ppoint (12) ; System.out.print ("Point b - ") ; b.affiche() ;
    Ppoint.setOrigine(3) ;
    System.out.println ("On place l'origine en " + Ppoint.getOrigine()) ;
    System.out.print ("Point a - ") ; a.affiche() ;
    System.out.print ("Point b - ") ; b.affiche() ;
  }
}
