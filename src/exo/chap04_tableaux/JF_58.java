package exo.chap04_tableaux;

import sun.security.util.Length;

class Ut2D {
	
	public static void Affiche( double t[][]) {
		
		for (double [] v : t){
			System.out.println("Ligne : ");
			for ( double v2 : v ){
				System.out.print(v2 + "  ");
			}
			System.out.println("");
		}
	}
	
	public static void Affiche( double t1d[]) {	

			for ( double v3 : t1d ){
				System.out.print(v3 + "  ");
			}
	}
	
	public static boolean dimEgal(double t1[][],double t2[][]) {
		boolean egal = true;
		if (t1.length != t2.length) {egal=false;return egal;} 
			else if ( !Ut2D.Regulier(t1) || !Ut2D.Regulier(t2)) { egal =false ; return egal; }
			else if (t1[0].length!=t2[0].length) { egal=false;return egal;}
			
		return egal;	
	}
	
	public static boolean Regulier(double t[][]) {
		boolean regulier=true;
		int taillep;
		if (t.length != 0) {taillep = t[0].length;
				for (double [] v : t){
				if (taillep != v.length) {regulier=false;break;}	
				}
		}
		return regulier;
	}
	
	public static double [] sommeLignes(double t[][]){
		double sum;
		int i=0;
		double tsum []=new double[t.length];
		for (double [] v : t){
			sum = 0;
			//tsum[i]=0;
			for ( double v2 : v ){
				sum +=v2;
			}
			//System.out.println("\nSomme ligne : " + sum);
			tsum[i]=sum;i++;
		}
		return tsum;
	}
	
	public static double[][] Somme (double t1[][],double t2[][]){
	
		double [][] som =null;
		
		if (Ut2D.dimEgal(t1,t2)) {
			 som =new double[t1.length][t1[0].length];
			for (int i = 0 ; i < t1.length ; i++) 
				for (int j = 0 ; j < t1[0].length ; j++)
					som[ i][ j] = t1[ i][ j] + t2[ i][ j] ;
		}
		
		return som;
	}
	
}
public class JF_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] ta = {{0,1,2,3,4},{4.5,5,6,7,8}};
		double [][] tb = {{0,1.2,2.2,3.2,4.2},{5.2,6.2,7.2,8.2,9.2}};
		double [][] tr = {{1,2,3},{4.5,6},{7,8,9}};
		double [][] ts = {{1,2,3},{4,5,6},{7,8,9}};
		double [][] tt = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("\nAffichage ta :");
		Ut2D.Affiche(ta);
		System.out.println("\nAffichage tb :");
		Ut2D.Affiche(tb);
		System.out.println("\nAffichage tr :");
		Ut2D.Affiche(tr);
		System.out.println("\nTest : " + tr[2][2]);
		System.out.println("\ntr est il regulier : " + Ut2D.Regulier(tr));
		System.out.println("\n SommeLignes de tr : ");
		Ut2D.Affiche(Ut2D.sommeLignes(tr));
		System.out.println("\n\nts dimEgal à tt ? "+ Ut2D.dimEgal(ts,tt) );
		Ut2D.Affiche(Ut2D.Somme(ts,tt));
		
		
		
	}

}
