package exo.chap04_tableaux;

import tools.Clavier;

class UtilTabjf {
	
	public static int[] Genere(int n){
		int cartab[];
		cartab = new int[n];
		for (int i=0,j=1;i<n;i++,j+=2) {
				cartab[i]=(int)Math.pow((double)j,(double)2); // ou j*j !!"
		}
		return cartab;
	}
	
	public static int[] Somme(int t1[],int t2[]){
		int cartab[];
		cartab = new int[t1.length];
		if (t1.length != t2.length) return null;
		for (int i=0;i<t1.length;i++) {
				cartab[i]=t1[i]+t2[i];
		}
		return cartab;
	}
	
	
	public static void Affiche(int t[]){
		
		// System.out.print ("Name ??") ;
	    for (int i=0 ; i<t.length; i++) System.out.print (t[i] + "  ") ;
	    System.out.println () ;
		
	}
	
}
public class JF_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=-1;
        int [] t1= null, t2 = null,t3= null;
		while (!(n>=0)) {
			System.out.print("Combien de valeurs ? (zero pour sortie ) ");
			n = Clavier.lireInt();
			if (n==0) { break;} else { 
				t1 = UtilTabjf.Genere(n);
				t2 = UtilTabjf.Genere(n);}
		
	    }
		UtilTabjf.Affiche(t1);
		UtilTabjf.Affiche(t2);
		t3 = UtilTabjf.Somme(t1, t2);
		UtilTabjf.Affiche(t3);
		
	}
}
