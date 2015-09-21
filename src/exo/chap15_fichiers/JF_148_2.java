package exo.chap15_fichiers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import my_tools.Clavier;

public class JF_148_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String nom1,prenom;
		Integer annee,num;
	
		System.out.print("Nom du fichier à ouvrir : ");
		File monfile = new File(Clavier.lireString());
		DataInputStream fluxi = new DataInputStream(new FileInputStream(monfile));
		boolean eof = false;
		while (!eof) {
			
			try {
				num = fluxi.readInt();
				System.out.print("\nNumero : "+num);
				nom1 = fluxi.readUTF();
				System.out.print("\nNom 1 : "+nom1);
				prenom = fluxi.readUTF();
				System.out.print("\nPrenom : "+prenom);
				annee = fluxi.readInt();
				System.out.print("\nannee naissance : "+annee);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				eof = true;
			}

		
		} 
		
		System.out.print("\n"
				+ "Fin du fichier");
		fluxi.close();
	}

}
