package exo.chap15_fichiers;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import my_tools.Clavier;

public class JF_147_2 {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

		String nom1="0",prenom;
		Integer annee;
		
		
		
		System.out.print("Nom du fichier à créer : ");
		File monfile = new File(Clavier.lireString());
		DataOutputStream fluxo = new DataOutputStream(new FileOutputStream(monfile));
		
		int num = 0;
		while (true) {
			System.out.print("\nNom 1 : ");
			nom1 = Clavier.lireString();
			if (nom1.equals("0")) break;
			//fluxo.writeChars(nom1);
			num++;
			fluxo.writeInt(num);
			fluxo.writeUTF(nom1);
			System.out.print("\nPrenom : ");
			prenom = Clavier.lireString();
			//fluxo.writeChars(prenom);
			fluxo.writeUTF(prenom);
			System.out.print("\nannee naissance : ");
			annee = Clavier.lireInt();
			fluxo.writeInt(annee);		
		} 
		
		System.out.print("Fin de creation de fichier");
		fluxo.flush();
		fluxo.close();
		
		}
	}

