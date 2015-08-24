package livre.chap06;
class Pointc
{ public Pointc(int abs, int ord)
  { x = abs ;
    y = ord ;
    System.out.println ("constructeur deux arguments : " + x + " " + y) ;
  }
  public Pointc()
  { this (0,0) ;  // appel Pointc (0,0) ; doit etre la premiere instruction
    System.out.println ("constructeur sans argument") ;
  }
  private int x, y ;
}
public class Consthis
{ public static void main (String args[])
  { Pointc a = new Pointc (1, 2) ;
    Pointc b = new Pointc() ;
  }
}

