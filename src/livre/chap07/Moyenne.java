package livre.chap07;
import tools.Clavier;
public class Moyenne
{ public static void main (String args[])
  {  int i, nbEl, nbElSupMoy ;
     double somme ;
     double moyenne ;
     
     // creation du tableau à la taille désirée
     System.out.print ("Combien d'eleves ") ;
     nbEl = Clavier.lireInt();
     double notes[] = new double[nbEl] ; // 1 note par eleve
     
     // entrer les notes dans le tableau
     for (i=0 ; i<nbEl ; i++)
      { System.out.print ("donnez la note numero " + (i+1) + " : " ) ;
        notes[i] = Clavier.lireDouble() ;
      }
     
     // Moyenne de la classe
     for (i=0, somme=0 ; i<nbEl ; i++)  somme += notes[i] ;
     moyenne = somme / nbEl ;
     System.out.println ("\nmoyenne de la classe  " + moyenne) ;
     
     // Nbre eleve ( de note ) superieurs à la moyenne précédente
     for (i=0, nbElSupMoy=0 ; i<nbEl ; i++ )
       if (notes[i] > moyenne) nbElSupMoy++ ;
     System.out.println (nbElSupMoy + " eleves ont plus de cette moyenne") ;
  }
}

