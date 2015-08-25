package exo.chap03_classes;
//exo29
class Aa
{ static int f (int n)
  { q = n ;
  }
  void g (int n)
  { q = n ;
    p = n ; // ne peut plus etre modifier car final
  }
  static private final int p = 20 ;
  //private int q ;
  static private int q ;
}
public class EssaiA
{ public static void main (String args[])
  { Aa a = new Aa() ; int n = 5 ;
    a.g(n) ;
    a.f(n) ;
    f(n) ; // n'existe pas
    Aa.f(2);// bon 
  }
}
