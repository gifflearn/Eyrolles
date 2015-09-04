package exo.chap07_Enum;
import my_tools.*;
class Elevejf {
	public Elevejf(String nom){
		this.name =nom;
	}
	
	public void setAdm(Enum<Mentionjf> enum1) {
		this.admiss = enum1;
	}
	
	public void affiche() {
		System.out.println("Nom de l'élève : " + this.name +" - "+((Mentionjf) this.admiss).details() );
	}
	
	private String name;
	private Enum<Mentionjf> admiss;
}

public class JF_89 {
	
	static public Enum<Mentionjf> Mentionjf (double moyenne) {
		if ( moyenne<10.) return Mentionjf.NA;
		if ( moyenne<12.) return Mentionjf.P;
		if ( moyenne<14.) return Mentionjf.AB;
		if ( moyenne<16.) return Mentionjf.B;
		return Mentionjf.TB;
	}
	
	public static void main(String[] args) {
		
		String [] Nom = {"Albert","Roger","Seb","Sam","Eric","Bill","Tyrion","Cersei","Sansa"};
		Elevejf [] tabel = new Elevejf[Nom.length];
		double notes=0;
		int moy=0,j=0,i;
		for (String e : Nom) {
			System.out.println("Donnez les 3 notes de l'eleve " + e);
			for (i=0;i<3;i++) {
				notes += Clavier.lireInt();
			}
			moy =  (int) Math.abs(notes/3);
			tabel[j] = new Elevejf(e);
			tabel[j].setAdm(Mentionjf(moy));
			j++;moy=0;notes=0;
		}
		
		for (Elevejf el : tabel) {
			el.affiche();
		}
	}

}

enum Mentionjf
{ NA ("Non admis"), P ("Passable"), AB ("Assez bien"),
	          B ("Bien"), TB ("Tres bien"), NC ("Non connu") ;
  private Mentionjf (String d)
  { mentionDetaillee = d ;
  }
  public String details ()
  { return mentionDetaillee ;
  }
  private String mentionDetaillee ;
}
