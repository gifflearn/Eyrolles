package exo.chap08_except;
// 

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

class ErrNatJf extends Exception {
	public ErrNatJf() {
	System.out.print("Erreur generic à NatJf : ");
	}
}
	class ErrConsJf extends ErrNatJf {
		public ErrConsJf(int pval) {
			System.out.println("Erreur de construction : Valeur non positive : "+pval);
		}
	}
	class ErrOpJf extends ErrNatJf {
		
		public ErrOpJf(String typeop,int pval1,int pval2) {
		System.out.println("Erreur opération "+typeop+" entre "+pval1+" et " +pval2);
		}
		
	}
		class ErrSomJf extends ErrOpJf {
			public ErrSomJf(int pval1,int pval2) {
				super("Som",pval1,pval2);
				}
		}
		class ErrDiffJf extends ErrOpJf {
			public ErrDiffJf(int pval1,int pval2) {
				super("Diff",pval1,pval2);
				}
		}
		class ErrProdJf extends ErrOpJf {
			public ErrProdJf(int pval1,int pval2) {
				super("Diff",pval1,pval2);
				}
		}
class NatJf {
	
	public NatJf() {
		this.val = 0;
	}
	public NatJf(int pi) throws ErrConsJf {
		if (pi<0) throw new ErrConsJf(pi);
		 this.val=pi;
	}
	public int getN() {
		return this.val;
	}
	public void affiche() {
		System.out.println("Construction de : " + this.val);
	}
	public static NatJf Som(NatJf pval1,NatJf pval2) throws ErrSomJf, ErrConsJf{
		
		if (pval1.val+pval2.val<Integer.MAX_VALUE) {
			return new NatJf(pval1.val+pval2.val);
		} else throw new ErrSomJf(pval1.val,pval2.val);
	}
	
	public static NatJf Diff(NatJf pval1,NatJf pval2) throws ErrDiffJf, ErrConsJf{
		
		if (pval1.val-pval2.val>0) {
			return new NatJf(pval1.val-pval2.val);
		} else throw new ErrDiffJf(pval1.val,pval2.val);
	}
	
	public static NatJf Prod(NatJf pval1,NatJf pval2) throws ErrProdJf, ErrConsJf{
		long p = (long)pval1.val*(long)pval2.val;
		if (p>0 && p<Integer.MAX_VALUE) {
			return new NatJf(pval1.val*pval2.val);
		} else throw new ErrProdJf(pval1.val,pval2.val);
	}
	
	private int val ;
	

	
}

public class JF_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NatJf ent1,ent2,ent3,ent4,ent5,ent6,ent7,ent8,ent9;
		try {
			ent1 = new NatJf(2);
			ent1.affiche();
			//ent2 = new NatJf(-6);
			ent3 = new NatJf(4);
			ent3.affiche();
			ent4 = new NatJf(258969366);
			ent4.affiche();
			ent5 = new NatJf(1562584);
			ent5.affiche();
			//ent6 = NatJf.Prod(ent5, ent4);
			//ent6.affiche();
			ent7 = NatJf.Diff(ent1, ent3);
			ent7.affiche();
		}
		catch (ErrNatJf e) {
			// System.out.println("erreur");
		}
	}
}
