package exo.chap03_classes;
//exo24
class AA
{ public AA (int coeff)
  { nbre *= coeff ;
    nbre += decal ;
  }
  public void affiche ()
  { System.out.println ("nbre = " + nbre + "  decal = " + decal) ;
  }
  private int nbre = 20 ;
  private int decal ;
}
public class InitChmp
{ public static void main (String args[])
  { AA a = new AA (5) ; a.affiche() ;
  }
}


