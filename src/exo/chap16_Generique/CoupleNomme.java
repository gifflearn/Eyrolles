package exo.chap16_Generique;
class CoupleNomme <T> extends Couple <T>
{ private String nom ;
  public CoupleNomme (T premier, T second, String nom)
  { super (premier, second) ;
    this.nom = nom ;
  }
  public void affiche ()
  { System.out.print ("nom = " + nom + " - " ) ;
    super.affiche() ;
  }
 }
