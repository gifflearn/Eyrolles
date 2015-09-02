package exo.chap06_chaines;
import my_tools.Clavier;
public class JF_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = new String();
		while (chaine != "") {
			System.out.print("Please enter a string : ");
			chaine = Clavier.lireString();
			System.out.print("Un caractere sur 2    : ");
			for (int i=0;i<chaine.length();i += 2) {
				System.out.print(chaine.charAt(i)+" ");
			}
			System.out.println("\nle premier caractere : " + chaine.charAt(0));
			System.out.println("le dernier caractere : " + chaine.charAt(chaine.length()-1));
		}
		
	}

}
