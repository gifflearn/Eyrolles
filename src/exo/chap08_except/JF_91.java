package exo.chap08_except;
class EntNatjf2 {
	public EntNatjf2 (int val) throws ErrConstjf2 {
		if (val<0) throw new ErrConstjf2(val);
		this.valeur = val;
		
	}
	public int getN() {
		return this.valeur;
	}
	private int valeur;
}
class ErrConstjf2 extends Exception {
	public ErrConstjf2(int valeur) {
		this.value = valeur;
	}
	public int getValue() {
		return this.value;
	}
	private int value;
}

public class JF_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		EntNatjf2 i = new EntNatjf2(2);
		EntNatjf2 j = new EntNatjf2(-2);
		}
		catch ( ErrConstjf2 e){
			System.out.println("Erreur de construction ! valeur : " + e.getValue()+ "*******************************");
			System.exit(-1);
		}
		
	}

}
