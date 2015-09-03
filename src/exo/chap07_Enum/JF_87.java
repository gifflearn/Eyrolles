package exo.chap07_Enum;

public class JF_87 {

	public static void main(String[] args) {
		
		for ( Mois m : Mois.values()) {
			m.affiche();
		}
	}
	

	enum Mois
	{ janvier (31),   fevrier (28), mars (31),     avril (30),
	  mai (31),       juin (30),    juillet (31),  aout (31), 
	  septembre (30), octobre (31), novembre (30), decembre (31) ;
	
	  private Mois(int nb) { // constructeur 
		  NbJour = nb;
	  }
	  
	  public int Nbj() {
		  return this.NbJour;
	  }
	  
	  public void affiche() {
		  System.out.println(this.toString() + this.NbJour);
		  
	  }
	  private int NbJour ;
	}  
}
