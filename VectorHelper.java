public class VectorHelper {
	
	
	/**
     * 
     * @param tab tableau d'entiers 
     * @return tab tableau apr�s avoir appliqu� une fonction pour les �l�ments du tableau en param�tres 
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
     * @return  tab tabealu retourn� apr�s avoir tri� les �l�ments du tableau pass� en param�tres
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
	
	
}