package exo.chap16_Generique;
class TripletJf<T,U,C> {
	public TripletJf(T pa,U pb,C pc){
		this.a =pa;
		this.b = pb;
		this.c =pc;
	}
	private T a;
	private U b;
	private C c;
	
	public T getPremier(){
		return a;
	}
	public U getSecond(){
		return b;
	}
	public C getTroisieme(){
		return c;
	}
	public void affich() {
		System.out.println("Triplet :"+a+" - "+b+" - "+c);
	}
}
public class JF_152 {

	public static void main(String[] args) {
		
		TripletJf<Integer,Double,String> tr1 = new TripletJf(3, 2.0, "André");
		tr1.affich();
		TripletJf<String,String,Integer> tr2 = new TripletJf("André","Martin",54);
		tr2.affich();
		String nom = tr2.getPremier()+" "+tr2.getSecond();
		System.out.println(nom);
	}

}
