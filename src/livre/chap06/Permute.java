package livre.chap06;

class Pointg
{ public Pointg(int abs, int ord)
  { x = abs ; y = ord ;
  }
  public void permute (Pointg a)  // methode d'echange les coordonnees
                                 // du point courant avec celles de a
  { Pointg c = new Pointg(0,0) ;
    c.x = a.x ; c.y = a.y ;  // copie de a dans c
    a.x = x ;   a.y = y ;    // copie du point courant dans a
    x = c.x ;   y = c.y ;    // copie de c dans le point courant
  }
  public void affiche ()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
public class Permute
{ public static void main (String args[])
  { Pointg a = new Pointg (1, 2) ;
    Pointg b = new Pointg (5, 6) ;
    a.affiche() ; b.affiche() ;
    a.permute (b) ;
    a.affiche() ; b.affiche() ;
  }
}

