package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }
    // Método para verificar si dos árboles de búsqueda binarios son similares
    
    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
   
        // Se tomará las raices de los arboles, como inicio, para verificar si son similares
        return bstSimilares(a1.root, a2.root); 
    }
    /*
	 * Para ver si dos arboles son similares, tendrán que tener la misma estructura.
	 * Por ello,se debe pasar por cada uno de sus descendientes. 
	 * Primero comenzamos por la raiz, y de ahí vamos comparando a sus subarboles izquierdos y derechos.
	 * Si uno de ellos es null y el otro no. Los arboles no serán similares
	 * 
	 */
    // Metodo recursivo
    public <T extends Comparable<T>> boolean bstSimilares(Node<T> nod1, Node<T> nod2) {
    	
    	// Si ambos son null, serán similiares
    	if(nod1 == null && nod2 == null) 
    		return true;
    	
    	//Si uno de los nodos es null y el otro no, los arboles no serán similares 
    	else if((nod1 != null && nod2 == null) || (nod1 == null && nod2 != null)) 
            return false;
    	
    	//Comparando a sus subarboles izquierdos y derechos
    	else 
    		return bstSimilares(nod1.left, nod2.left) && bstSimilares(nod1.right, nod2.right);
                
    }
}
