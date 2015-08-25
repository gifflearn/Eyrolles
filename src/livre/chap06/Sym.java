package livre.chap06;
class Pointj
{ public Pointj(int abs, int ord)
  { x = abs ; y = ord ;
  }
  public Pointj symetrique()
  { Pointj res ;
    res = new Pointj (y, x) ;
    return res ;
  }
  public void affiche ()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
public class Sym
{ public static void main (String args[])
  { Pointj a = new Pointj (1, 2) ;
    a.affiche() ;
    Pointj b = a.symetrique() ;
    b.affiche() ;
  }
}

