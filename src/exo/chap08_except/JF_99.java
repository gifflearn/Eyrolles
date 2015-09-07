package exo.chap08_except;
class ErrNatJf extends Exception {
	
}
	class ErrConsJf extends ErrNatJf {
		public ErrConsJf(int val) {
			System.out.println("Erreur de construction : Valeur non positive : "+val);
		}
	}
	class ErrOpJf extends ErrNatJf {
		System.out.println("Erreur opération : ");
	}
		class ErrSomJf extends ErrOpJf {
			
		}
		class ErrDiffJf extends ErrOpJf {
			
		}
		class ErrProdJf extends ErrOpJf {
			
		}
class NatJf {
	
	public NatJf(int i) throws ErrConsJf {
		if (i<=0) throw new ErrConsJf(i);
		 this.val=i;
	}
	
	private int val ;
	
}

public class JF_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NatJf ent1,ent2;
		try {
			ent1 = new NatJf(2);
			ent2 = new NatJf(-6);
		}
		catch (ErrConsJf e) {
			System.exit (-1) ;
		}
		

		
	}

}
