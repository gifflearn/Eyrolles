package livre.chap24;
public class ClasseClass 
{ public static void main (String args[]) 
  { Pointy p = new Pointy() ;
    Class<?> c = p.getClass() ; // ou c = Pointy.class ; 
    System.out.println ("classe de c = " + c.getName()) ;  
     // affichage de la conversion de c en String (m�tode toString)
    System.out.println ("classe de c (obtenue par toString) = " + c) ;
    
    Couple<Pointy> cp = new Couple<Pointy>() ;
    Couple <?> cj = new Couple<Pointy>() ;
    System.out.println ("classe Couple<Pointy> = " + cp.getClass().getName()) ;
    System.out.println ("classe Couple<?> = " + cj.getClass().getName()) ;
  }
}
class Pointy
{ private int x, y ;
}
class Couple<T>
{ private T x, y ;
}