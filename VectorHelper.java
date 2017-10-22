public class VectorHelper {
	
	
	/**
     * 
     * @param tab tableau d'entiers 
     * @return tab tableau après avoir appliqué une fonction pour les éléments du tableau en paramètres 
     */
    
    public int[] fonction(int[] tab){
		
		for(int i=0;i<tab.length;i++){
			tab[i] = tab[i]*tab[i] ; 
		}
		
		return tab ; 
		
	}
    
    
    /**
     * 
     * @param tab tableau d'entier 
     * @return  tab tabealu retourné après avoir trié les éléments du tableau passé en paramètres
     */
    public int[] trie(int[] tab){
		boolean permut = true ; 
		int i ; //indice pour parcourir le tableau 
		int s; //element intermidaire dans une permutation d'elements du tableau
		
		while(permut){
			permut = false ; 
			for(i=0;i<tab.length;i++){
				if(tab[i]>tab[i+1]){
					s = tab[i] ; 
					tab[i] = tab[i+1] ; 
					tab[i+1] = s ; 
					permut = true ; 
				}
			}
		}		
		return tab ; 
	}
    
    

	/** 
	 * Fonction qui fait la somme de deux vecteurs et retourne le resultat dans un vecteur
	 *       Si il les tableaux sont de tailles differentes il y aura une exception
	 *@author Imadovic
	 * @param tab1
	 * @param tab2
	 * @return result un tabelau qui est le resultat de la somme des deux tableaux en entrees
	 * @throws LengthException
	 * 
	 *
	 */
	public static int[] sommer(int[] tab1,int[] tab2) throws LengthException{
		
		if(tab1.length!=tab2.length) throw new LengthException("Les tableaux sont"
				+ " de tailles differentes");
		
		int[] result=new int[tab1.length];
		
		for(int i=0;i<tab1.length;i++)  result[i]=tab1[i]+tab2[i];
		
		return result;		
		
	}
	

	/**
	 * Fonction qui inverse les elements d'un tableau
	 * @author Imadovic
	 * @param tab le tableau qu'on veut inverser 
	 * @return result le tableau inversee
	 */
	
	public static int[] inverser(int[] tab){
		
		int[] result=new int[tab.length];
		
		for(int i=0;i<tab.length;i++) result[i]=tab[tab.length-i-1];
		
		return result;		
		
	}	

	
	
}