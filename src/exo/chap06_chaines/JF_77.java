package exo.chap06_chaines;
import my_tools.*;
public class JF_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char voyelle [] ={'a','e','i','o','u','y'};
		String chaine = new String();
		int cpt;
		while (true) {
			System.out.print("\nEntrer une string : ");
			chaine = Clavier.lireString().toLowerCase();
			if (chaine.equals("")) break;
			System.out.println("Comporte : ");
			for (char v : voyelle) {
				cpt = 0;
				for (int i=0;i<chaine.length();i++) {
					if (chaine.charAt(i)==v) {
						cpt +=1;
					}
				}
				System.out.println(cpt + " fois la lettre " + v);
			}
		}
	}

}
