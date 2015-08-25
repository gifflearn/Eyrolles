package exo.chap03_classes;
class SexDecc {
	SexDecc (double dec){
		h =  (int)dec ;
	    int minDec = (int)(60*(dec-h)) ;
	    m = (int)minDec ;
	    s = (int)(60*(minDec-m)) ;
	}	
	SexDecc ( int h,int m,int s ) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public int getH() {
		return h ;
	}
	
	public int getM() {
	    return m ;
	}
	
	public int getS() {
	    return s ;
	}
	
	public double getDec() {
		return (3600*h+60*m+s)/3600. ;
	}
	
	private int h,m,s;
}

public class JF_45 {

	 public static void main (String args[])
	  { SexDecc h1 = new SexDecc(4.51) ;
	    System.out.println ("h1 - decimal = " + h1.getDec()
	       +"  Sexa = " + h1.getH() + " " + h1.getM() + " " + h1.getS()) ;
	   SexDecc h2 = new SexDecc (2, 32, 15) ;
	   System.out.println ("h2 - decimal = " + h2.getDec()
	       +"  Sexa = " + h2.getH() + " " + h2.getM() + " " + h2.getS()) ;
	}
	
}
