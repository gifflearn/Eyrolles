package exo.chap06_chaines;
import my_tools.*;
class Verbe {
	
	public Verbe(String mot) {
		longueur = mot.length();
		rac=mot.substring(0, longueur-2);
	}
	
	
	public void Conjugue() {
		for (int i = 0;i<6;i++) {
			System.out.println(sujets[i] + " " + rac + terminaisons[i]);
		}
		
	}
	
	final private String terminaisons[] = {"e","es","e","ons","ez","ent"};
	final private String sujets[] = {"Je","tu","il/elle","nous","vous","ils"};
	private String rac;
	private int longueur; 
}

public class JF_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String entree;
		Verbe ver1 ;
		while (true) {
			System.out.print("Entrer un verbe du premier groupe: ");
			entree = Clavier.lireString();
			// on peut aussi trouver er avec substring
			// String fin = verbe.substring (nbLettres-2, nbLettres) ; 
			if (entree.lastIndexOf("er")==(entree.length()-2)) {
				ver1 = new Verbe(entree);
				ver1.Conjugue();
			} else {
				System.out.println("\nIl ne se termine pas par er . Recommencer ! "); 
			}
			
		}
	}
}