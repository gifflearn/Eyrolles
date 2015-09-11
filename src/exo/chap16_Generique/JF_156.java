package exo.chap16_Generique;

public class JF_156 {

	public static <T> T tirage(T[] t){
		int n = t.length;
		if (n==0) return null;
		int i =  (int)(n*Math.random());
		return t[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tabs= {"zero","un","deux","trois"};
		System.out.println(tirage(tabs));
	}

}
