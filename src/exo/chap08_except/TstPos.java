package exo.chap08_except;
class Positif
{ public Positif (int n) throws ErrConst
  { if (n<=0) throw new ErrConst() ;
  }
}
class ErrConst extends Exception
{}
public class TstPos
{ public static void main (String args[])
  { System.out.println ("debut main") ;
    boolean ok = false ;
    while (!ok)
    { try
      { System.out.print ("donnez un entier positif : ") ;
        int n = Clavier.lireInt() ;
        Positif ep = new Positif (n) ;
        ok = true ;
      }
      catch (ErrConst e)
      { System.out.println ("*** erreur construction ***") ;
      }
    }
    System.out.println ("fin main") ;
  }
}


/*
*/


/* commentaires :
*/

/* Ennonc� :
Que fait
*/


/* notes perso
Boucle tant qu'il na pas re�u un entier positif
*/
