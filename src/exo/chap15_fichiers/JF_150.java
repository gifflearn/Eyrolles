package exo.chap15_fichiers;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import my_tools.Clavier;

public class JF_150 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String line,ch;
		int numligne=0;
		BufferedReader fluxi = null;
		
		final int longNumLigne = 4 ; // nombre de caracteres utilises pour afficher le numero de ligne 
		final int nbCarParLigne = 60 ;
		
		char charNumLigne[] = new char[longNumLigne] ;  // pour les caracteres du numero de ligne
		
		System.out.print("Nom du fichier à ouvrir : "); // c:\temp\entree.txt
		File monfile = new File(Clavier.lireString());
		try {
			//DataInputStream fluxi = new DataInputStream(new FileInputStream(monfile));
			fluxi = new BufferedReader(new InputStreamReader(new FileInputStream(monfile)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		do {
			numligne++;
			line= fluxi.readLine();
			if (line==null)break;
			
			 /* determination des caracteres correspondant au numero de ligne */
			ch = String.valueOf (numligne) ;
	        int i, j ;  // pour parcourir le numero de ligne
	        for (i=0 ; i<longNumLigne-ch.length() ; i++) charNumLigne[i] = '0' ;
	        for (j=0 ; i<longNumLigne ; i++, j++)  charNumLigne[i] = ch.charAt(j) ;
	          /* affichage numero de ligne suivi d'un espace*/
	        for (i=0 ; i<longNumLigne ; i++) System.out.print (charNumLigne[i]) ;
	        System.out.print(" ");
	        
	        // Affichage des lignes
	        
	        int n=0;
	        while (n<line.length()) {
	        	if (n!=0 && n%nbCarParLigne==0) { // alors on passe à la ligne de ligne
	        		System.out.println(); // saut de ligne
	        		for (int k=0;k<longNumLigne+1;k++) System.out.print(" ");
	        	}
	        	System.out.print(line.charAt(n));
	        	n++;
	        }
	        System.out.println(); // saut de ligne		
				
		} while (line!=null);
		fluxi.close();
		System.out.println("Fin du fichier");

	}

}
