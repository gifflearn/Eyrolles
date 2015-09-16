package exo.chap17_Collections;
import java.util.* ;
class IndexBJf {
	public IndexBJf() {
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
		for (Map.Entry <String, TreeSet <Integer> > elem : elementsIndex) {
			System.out.print("\n"+elem.getKey()); // la clef String
			TreeSet<Integer> numeros = elem.getValue(); // le TreeSet des numeros de page
			for (Integer val : numeros) {
			System.out.print(" " +val);
			}
		}
	}
	public void IndexPage() {
		lindexPage = new TreeMap <Integer, TreeSet <String> > () ;  
		Set <Map.Entry <String, TreeSet <Integer> > > elementsIndex = lindex.entrySet () ;
		for (Map.Entry <String, TreeSet <Integer> > elem : elementsIndex) {
			TreeSet<Integer> numeros = elem.getValue(); // le TreeSet des numeros de page
			for (Integer val : numeros) {
				// Ajouter dans le noul Index Page
				TreeSet<String> TexteExistants = lindexPage.get(val); // Texte deja associés à la clef numero
				if (TexteExistants==null) { // la clef n'existe pas encore
					TreeSet<String> textNew = new TreeSet<String>();
					textNew.add(elem.getKey());
					lindexPage.put(val, textNew);
				} else {
					TexteExistants.add(elem.getKey());
					lindexPage.put(val, TexteExistants);
				}
				
				
				
			}
		}
		
	}
	public void listePage() {
		//System.out.println(lindexPage);
				Set <Map.Entry <Integer, TreeSet <String> > > elementsIndex = lindexPage.entrySet () ;
				System.out.print("Index Page : ");
				for (Map.Entry <Integer, TreeSet <String> > elem : elementsIndex) {
					System.out.print("\n"+elem.getKey()); // la clef Integer
					TreeSet<String> sujets = elem.getValue(); // le TreeSet des sujetss de la page
					for (String texte : sujets) {
					System.out.print(" " +texte);
					}
				}
	}
	
	//private HashMap<String, Integer> lindex;
	//private TreeMap<String, Integer> lindex;
	 private TreeMap <String, TreeSet <Integer> > lindex ;
	 private TreeMap <Integer,TreeSet<String>> lindexPage;
}
public class JF_168 {

	public static void main (String args[])
		  { IndexBJf monIndex = new IndexBJf () ;
		    monIndex.ajouter ("Java", 25) ;
		    monIndex.ajouter ("C++", 45) ;
		    monIndex.ajouter ("Java", 12) ;
		    monIndex.ajouter ("objet", 15) ;
		    monIndex.ajouter ("polymorphisme", 45) ;
		    monIndex.liste() ;
		    System.out.println("\n\nReverso");
		    monIndex.IndexPage();
		    monIndex.listePage();
		  }
}
