package exo.chap06_chaines;
import my_tools.*;
public class JF_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nbr_mot,i,permut=1;
	String [] tab1 ;
	String temp;
	System.out.print("Please entrer le nbre de mots : ");
	nbr_mot = Clavier.lireInt();
	tab1 = new String[nbr_mot];
	System.out.println("\nDonnez vos mots : ");
	for ( i=0;i<nbr_mot;i++) {
		tab1[i]=Clavier.lireString();
	}
	System.out.println("Liste par ordre alphabethique : ");	
	// Tri du tableau par permutation
	while (permut!=0){
		permut=0;
		for (i=0;i<tab1.length-1;i++) {
			if (tab1[i+1].compareToIgnoreCase(tab1[i])<0) { 
				//alors permut
				temp = tab1[i];tab1[i]=tab1[i+1];tab1[i+1]=temp;
				permut++;
			}
		}
	} // si plus de permut le tableau est trié
	//Afiichage du tableau
	for (String st : tab1) { System.out.println(st);
	}

	}
}
