package exo.chap06_chaines;
class Repertoire {
	public Repertoire(int tail) {
		rep = new Abonnejf[tail];
		maxtaille = tail;
		taille = 0;
	}
	
	public boolean AddAbonne(Abonnejf pers){
		if (taille<maxtaille) {
			rep[taille]=pers;
			taille++;
			return true;
		} else return false;
	}
	
	public int getNAbonne() {
		return taille;
	}
	
	public Abonnejf getAbonne(int rang) {
		return rep[rang];
	}
	
	public String getNumero(String name) {
		for (Abonnejf ab : rep) {
			if (ab.getName()==name) {return ab.getPhone();}
		}
		return "Not found";
	}
	
	public Abonnejf [] getAbonnesTries() {
		// Cloner le tableau
		reptrie = (Abonnejf[]) rep.clone();
		// trie par selection :
		// lors de chaque itération, on sélectionne l’élément le plus petit parmi ceux restant à trier et le met à sa place dans le
		// tableau, en l’échangeant avec l’élément qui s’y trouve ( à la position i) 
		for (int i=0;i<taille;i++){
			int Imin =i;
			Abonnejf temp = new Abonnejf();
			for (int j=i+1;j<taille;j++){ // on cherche le + petit dans ceux qui restent
				if ( reptrie[j].getName().compareToIgnoreCase(reptrie[Imin].getName()) <0 ) {Imin=j;}// si ( name de j < name de Im )	
			}
			// permutation
			temp = reptrie[i];
			reptrie[i] = reptrie[Imin];
			reptrie[Imin] = temp;
		}
		return reptrie;
	}
	
	private Abonnejf [] rep;
	private Abonnejf [] reptrie;
	private int taille,maxtaille ;
}

class Abonnejf {
	public Abonnejf() {}
	public Abonnejf(String nom,String numero){
		this.name=nom;
		this.phone=numero;
		this.abonne[0] = nom;
		this.abonne[1] = numero;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getName() {
		return this.name;
	}
	public String [] GetAbonne(){
		return abonne;
	}
	
	private String name;
	private String phone;
	private String [] abonne = new String[2];
}

public class JF_82 {

	public static void main(String[] args) 
	
	{ Repertoire rep = new Repertoire(10) ;
    System.out.println ("il y a " + rep.getNAbonne () + " abonnes") ;
    Abonnejf a = new Abonnejf("Dupont", "02-38-25-88-99") ;
    Abonnejf b = new Abonnejf("iuval",  "04-55-66-77-99") ;
    Abonnejf c = new Abonnejf("huval",  "04-55-66-77-99") ;
    Abonnejf d = new Abonnejf("guval",  "04-55-66-77-99") ;
    Abonnejf e = new Abonnejf("fuval",  "04-55-66-77-99") ;
    Abonnejf f = new Abonnejf("Euval",  "04-55-66-77-99") ;
    rep.AddAbonne (a) ;rep.AddAbonne (b) ;rep.AddAbonne (c) ;rep.AddAbonne (d) ;rep.AddAbonne (e) ;rep.AddAbonne (f) ;
    
    rep.AddAbonne (new Abonnejf ("Duchene", "02-11-22-33-44")) ;
    rep.AddAbonne (new Abonnejf ("dubois", "01-11-22-33-44")) ;
    System.out.print ("\nMaintenant il y a " + rep.getNAbonne () + " abonnes") ;
    System.out.println (" qui sont : ") ;
    for (int i=0 ; i<rep.getNAbonne() ; i++)
      System.out.println (rep.getAbonne(i).getName() + " " + rep.getAbonne(i).getPhone()) ;
    System.out.println ("\nou encore, par ordre alphabetique") ;
    Abonnejf[] abonnes = rep.getAbonnesTries () ;
    for (int i=0 ; i<rep.getNAbonne () ; i++)
      System.out.println (abonnes[i].getName() + " " + abonnes[i].getPhone()) ;
  }

}
