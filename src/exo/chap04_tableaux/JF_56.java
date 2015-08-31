package exo.chap04_tableaux;
class Aleatjf {
	
	public Aleatjf (int n, int l)
	{ nVal = n ; limite = l ;
	  val = new int[n] ;
	  for (int i=0 ; i<nVal ; i++)
	    val[i] = (int)((l+1)*Math.random()) ;
	}
	
	private int nVal,limite;
	private int [] val;
	
	public int getValeur(int n) {
		return this.val[n];
	}
	
	public int[] getValeurs() {
		int[] res = new int[nVal] ;
	    for (int i=0 ; i<nVal ; i++)
	      res[i] = val[i] ;
	    return res ;
	}
	
	public int[] histo() {
		int[] res = new int[limite+1] ;  // pour aller de 0 à limite
	    for (int i=0 ; i<nVal ; i++) res[val[i]]++ ;
	    return res ;
	}
}
public class JF_56 {

}
