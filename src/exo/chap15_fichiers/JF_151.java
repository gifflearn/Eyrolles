package exo.chap15_fichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import my_tools.Clavier;

public class JF_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File monrep;
		File [] contenu;
		
		while (true) {
			System.out.print("Nom du repertoirer à lister : "); // c:\temp\entree.txt
			monrep = new File(Clavier.lireString());
			if (monrep.isDirectory()) break;
			System.out.println("Non de repertoire inexistant");
		}
		
		contenu = monrep.listFiles();
		for (File ligne : contenu){
			System.out.print(ligne.getName());
			if (ligne.isDirectory()) System.out.println(" Repertoire");
			else {
				System.out.println(" Fichier " + ligne.length() + " octets ");
			}
		}
		
	}

}
