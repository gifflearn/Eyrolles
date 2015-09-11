package exo.chap16_Generique;


public class JF_157 {
	public static <T> T tiz(T pa,T pb){
		Double x = Math.random();
		if (x>0.5) return pb; else return pa;
	}
	
	public static void main(String[] args) {
		
		int a=1,b=2;
		Double c=0.1,d=0.2;
		System.out.println(JF_157.<Integer>tiz(a,b));
		//
		System.out.println(JF_157.<Integer>tiz(c,d));
		
	}
}
