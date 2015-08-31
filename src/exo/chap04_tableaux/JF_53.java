package exo.chap04_tableaux;
class UtilTabj {
	
	public static void Affiche(double t[]){
			
			// System.out.print ("Name ??") ;
		    for (int i=0 ; i<t.length; i++) System.out.print (t[i] + "  ") ;
		    System.out.println () ;
			
		}
    public static void Somme(double t[]){
    	double tot=0;
    	for (double v : t) tot +=v;
    	System.out.println("Somme : " + tot);
    }
	
    public static void Increm(double t[],double di){
    	for (int i=0;i<t.length;i++){
    		t[i] += di;
    	}
    }
}
public class JF_53 {
	
	public static void main(String[] args) {
		final int N = 4 ;
	    double t1[] = new double [N] ;
	    for (int i=0 ; i<N ; i++) t1[i] = i+1 ;
	         // affichage des valeurs de t1 
	    UtilTabj.Affiche(t1);
	    UtilTabj.Somme(t1);
	    UtilTabj.Increm(t1,4);
	    UtilTabj.Affiche(t1);

	    
	}
	
	
}
