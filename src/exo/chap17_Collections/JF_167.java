package exo.chap17_Collections;
import java.util.* ;
class IndexJf {
	public IndexJf() {
		//lindex = new HashMap<String, Integer>();
		//lindex = new TreeMap<String, Integer>();
		lindex = new TreeMap<String, TreeSet <Integer>>();
	}
	public void ajouter(String pval, Integer ppage) {
		TreeSet<Integer> numeroexistants = lindex.get(pval); // numeropages deja associés à la clef pval
		if (numeroexistants==null) { // la clef n'existe pas encore
			TreeSet<Integer> numNew = new TreeSet<Integer>();
			numNew.add(ppage);
			lindex.put(pval, numNew);
		} else {
			numeroexistants.add(ppage);
			lindex.put(pval, numeroexistants);
		}

	}
	public void liste() {
		//System.out.println(lindex);
		Set <Map.Entry <String, TreeSet <Integer> > > elementsIndex = lindex.entrySet () ;
		System.out.print("Index : ");
		for (Map.Entry <String, TreeSet <Integer> > entre : elementsIndex) {
			System.out.print("\n"+entre.getKey());
			TreeSet<Integer> numeros = entre.getValue();
			for (Integer val : numeros) {
			System.out.print(" " +val);
			}
		}
	}
	//private HashMap<String, Integer> lindex;
	//private TreeMap<String, Integer> lindex;
	 private TreeMap <String, TreeSet <Integer> > lindex ;
}
public class JF_167 {

	public static void main (String args[])
		  { IndexJf monIndex = new IndexJf () ;
		    monIndex.ajouter ("Java", 25) ;
		    monIndex.ajouter ("C++", 45) ;
		    monIndex.ajouter ("Java", 12) ;
		    monIndex.ajouter ("objet", 15) ;
		    monIndex.ajouter ("polymorphisme", 45) ;
		    monIndex.liste() ;
		  }
}
