package exo.chap05_heritage;
class Point
{ public Point (double x, double y) { this.x=x ; this.y=y ; }
  public void deplace (double dx, double dy) { x+=dx ; y+=dy ; }
  public void affiche ()
  { System.out.println ("Point de coordonnees " + x + " " + y) ;
  }
  public double getX() { return x ; }
  public double getY() { return y ; }
  private double x, y ;
}
class Cercle
{ public Cercle (double x, double y, double r)
  { centre = new Point (x, y) ;
    this.r = r ;
  }
  public void deplaceCentre (double dx, double dy)
  { centre.deplace (dx, dy) ;
  }
  public void changeRayon (double r)
  { this.r = r ;
  }
  public Point getCentre()
  { return centre ;
  }
  public void affiche ()
  { System.out.println ("Cercle de centre " + centre.getX() + " " + centre.getY()
                        + " et de rayon " + r) ;
  }
  private Point centre ;
  private double r ;
}
public class TstCerM
{ public static void main (String args[])
  { Cercle c = new Cercle (3, 8, 2.5) ;
    c.affiche() ;
    c.deplaceCentre (1, 0.5) ;
    c.changeRayon (5.25) ;
    c.affiche() ;
    Point a = c.getCentre() ;
    a.affiche() ;
  }
}

/*
Cercle de centre 3.0 8.0 et de rayon 2.5
Cercle de centre 4.0 8.5 et de rayon 5.25
Point de coordonnees 4.0 8.5
*/
