package exo.chap06_chaines;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import my_tools.*;

public class JF_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char mot[];
		while (true) {
			System.out.print("\nPlease enter a integer : ");
			//n = Clavier.lireInt();
			//chaine = String.valueOf(n);
			//mot = chaine.toCharArray();
			mot = String.valueOf(Clavier.lireInt()).toCharArray();
			if (mot.length == 0) break; // il faudrait gerer l'erreur
			for (char i : mot ) {
				System.out.print("\n" + i);
			}
			
		}	
	}

}
