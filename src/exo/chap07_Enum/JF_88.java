package exo.chap07_Enum;

import exo.chap07_Enum.JF_87.Mois;

public class JF_88 {

public static void main(String[] args) {
		
		for ( Mois2 m : Mois2.values()) {
			m.affiche();
		}
	}
	

enum Mois2
{ janvier   (31, "jan", "january"),     fevrier  (28, "fev", "february"), 
  mars      (31, "mar", "march"),       avril    (30, "avr", "april"),  
  mai       (31, "mai", "may"),         juin     (30, "jun", "june"),
  juillet   (31, "jul", "july"),        aout     (31, "aou", "august"),
  septembre (30, "sep", "september"),   octobre  (31, "oct", "october"), 
  novembre  (30, "nov", "november"),    decembre (31, "dec", "december") ;
	
	  private Mois2(int nb,String abb,String eng) { // constructeur 
		  NbJour = nb;
		  Abbrev = abb;
		  English = eng;
	  }
	  
	  public int Nbj() {
		  return this.NbJour;
	  }
	  
	  public void affiche() {
		  System.out.println(this.Abbrev + " = " + this.toString() + " = " + this.English + " - " + this.NbJour + " jours");
		  
	  }
	  private int NbJour ;
	  private String Abbrev,English;
	}  
}

	
	

