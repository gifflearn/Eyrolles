package exo.chap05_heritage;
class AA
{ public void f(double x) { System.out.print ("AA.f(double=" + x +") ") ; }
}
class BB extends AA {}
class CC extends AA
{ public void f(long q)   { System.out.print ("CC.f(long="   + q + ") ") ; }
}
class DD extends CC
{ public void f(int n)    { System.out.print ("DD.f(int="    + n + ") ") ; }
}
class FF extends CC
{ public void f(float x)  { System.out.print ("FF.f(float="  + x + ") ") ; }
  public void f(int n)    { System.out.print ("FF.f(int="    + n + ") ") ; }
}

public class PolySur
{ public static void main (String arg[])
  { byte bb=1 ; short p=2 ; int n=3 ; long q=4 ;
    float x=5.f ; double y=6. ;

    System.out.println ("** AA ** ") ;
    AA a = new AA() ; a.f(bb) ; a.f(x) ;                   System.out.println() ;

    System.out.println ("** BB ** ") ;
    BB b = new BB() ; b.f(bb) ; b.f(x) ;                   System.out.println() ;
    a = b ;         a.f(bb) ; a.f(x) ;                   System.out.println() ;

    System.out.println ("** CC ** ") ;
    CC c = new CC() ; c.f(bb) ; c.f(q) ; c.f(x) ;          System.out.println() ;
    a = c ;         a.f(bb) ; a.f(q) ; a.f(x) ;          System.out.println() ;

    System.out.println ("** DD ** ") ;
    DD d = new DD() ; d.f(bb) ; c.f(q) ; c.f(y) ;          System.out.println() ;
    a = c ;         a.f(bb) ; a.f(q) ; a.f(y) ;          System.out.println() ;

    System.out.println ("** FF ** ") ;
    FF f = new FF() ; f.f(bb) ; f.f(n) ; f.f(x) ; f.f(y) ; System.out.println() ;
    a = f ;         a.f(bb) ; a.f(n) ; a.f(x) ; a.f(y) ; System.out.println() ;
    c = f ;         c.f(bb) ; c.f(n) ; c.f(x) ; c.f(y) ;
  }
}

/*
** AA **
AA.f(double=1.0) AA.f(double=5.0)
** BB **
AA.f(double=1.0) AA.f(double=5.0)
AA.f(double=1.0) AA.f(double=5.0)
** CC **
CC.f(long=1) CC.f(long=4) AA.f(double=5.0)
AA.f(double=1.0) AA.f(double=4.0) AA.f(double=5.0)
** DD **
DD.f(int=1) CC.f(long=4) AA.f(double=6.0)
AA.f(double=1.0) AA.f(double=4.0) AA.f(double=6.0)
** FF **
FF.f(int=1) FF.f(int=3) FF.f(float=5.0) AA.f(double=6.0)
AA.f(double=1.0) AA.f(double=3.0) AA.f(double=5.0) AA.f(double=6.0)
CC.f(long=1) CC.f(long=3) AA.f(double=5.0) AA.f(double=6.0)
*/


