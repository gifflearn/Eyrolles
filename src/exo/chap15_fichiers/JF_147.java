package exo.chap15_fichiers;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import my_tools.*;

public class JF_147 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	String nom1="0",prenom;
	int annee;
	
	
	
	System.out.print("Nom du fichier à créer : ");
	File monfile = new File(Clavier.lireString());
	DataOutputStream fluxo = new DataOutputStream(new FileOutputStream(monfile));
		
	while (true) {
		System.out.print("\nNom 1 : ");
		nom1 = Clavier.lireString();
		if (nom1.equals("0")) break;
		fluxo.writeChars(nom1);
		System.out.print("\nPrenom : ");
		prenom = Clavier.lireString();
		fluxo.writeChars(prenom);
		System.out.print("\nannee naissance : ");
		annee = Clavier.lireInt();
		fluxo.writeInt(annee);		
	} 
	
	System.out.print("Fin de creation de fichier");
	fluxo.close();
	
	}

}
