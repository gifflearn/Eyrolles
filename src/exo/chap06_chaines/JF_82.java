package exo.chap06_chaines;
class Repertoire {
	public Repertoire(int tail) {
		rep = new Abonnejf[0];
		maxtaille = tail;
		taille = 0;
	}
	
	public boolean AddAbonne(Abonnejf pers){
		if (taille<maxtaille) {
			rep[taille]=pers;
			taille++;
			return true;
		} else return false;
	}
	
	public int getNAbonne() {
		return taille;
	}
	
	private Abonnejf [] rep;
	private boolean ok;
	private int taille,maxtaille ;
}

class Abonnejf {
	public Abonnejf(String nom,String numero){
		this.name=nom;
		this.phone=numero;
		String [] abonne = {nom,numero};
	}
	public String getPhone() {
		return this.phone;
	}
	public String getName() {
		return this.name;
	}
	
	private String name;
	private String phone;
}

public class JF_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
