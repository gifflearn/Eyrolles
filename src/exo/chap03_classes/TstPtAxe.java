package exo.chap03_classes;
// exo23
class Pointt
{ public Pointt (char c, double x)   // constructeur
  { nom = c ;
    abs = x ;
  }
  public void affiche ()
  { System.out.println ("Point de nom " + nom + "  d'abscisse " + abs) ;
  }
  public void translate (double dx)
  { abs += dx ;
  }
  private char nom ;     // nom du point
  private double abs ;   // abscisse du point
}
public class TstPtAxe
{ public static void main (String args[])
  { Pointt a = new Pointt ('C', 2.5) ;
    a.affiche() ;
    Pointt b = new Pointt ('D', 5.25) ;
    b.affiche() ;
    b.translate(2.25) ;
    b.affiche() ;
  }
}


