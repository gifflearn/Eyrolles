package exo.chap08_except;
class EntNatjf {
	public EntNatjf (int val) throws ErrConst {
		if (val<0) throw new ErrConst();
		this.valeur = val;
		
	}
	public int getN() {
		return this.valeur;
	}
	private int valeur;
}
class ErrConst extends Exception {
	
}

public class JF_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		EntNatjf i = new EntNatjf(2);
		EntNatjf j = new EntNatjf(-2);
		}
		catch ( ErrConst e){
			System.out.println("Erreur de construction");
			System.exit(-1);
		}
		
	}

}
