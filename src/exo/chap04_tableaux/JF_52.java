package exo.chap04_tableaux;

import java.lang.reflect.Parameter;

public class JF_52
{   
	public static void affiche(int t[]){
	
		// System.out.print ("Name ??") ;
	    for (int i=0 ; i<t.length; i++) System.out.print (t[i] + " ") ;
	    System.out.println () ;
		
	}
	
	public static void main (String args[])
  { final int N = 4 ;
    int t1[] = new int [N] ;
    int t2[] = new int [N] ;
    for (int i=0 ; i<N ; i++) t1[i] = i+1 ;
    for (int i=0 ; i<N ; i++) t2[i] = 2*i+1 ;
         // affichage des valeurs de t1 et de t2
    affiche(t1);
    affiche(t2);
    

    t1 = t2 ;
    t1[0] = 10 ; t2[1] = 20 ; t1[2] = 30 ; t2[3] = 40 ;

         // affichage des valeurs de t1 et de t2
    affiche(t1);
    affiche(t2);
    
  } 
}