package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }
    // Método para verificar si dos árboles de búsqueda binarios son iguales

    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
    	
    	// Se tomará las raices de los arboles, como inicio, para verificar si son iguales
        return bstIguales(a1.root,a2.root);
    }
    
    /*
	 * Para ver si dos arboles son iguales, tendrán que tener la misma estructura y los mismo valores en sus subarboles.
	 * Por ello,se debe pasar por cada uno de sus descendientes. 
	 * Primero comenzamos por la raiz, y de ahí vamos comparando los valores de sus subarboles izquierdos y derechos.
	 * Si tienen valores diferentes o uno de ellos es null y el otro no. Los arboles no serán iguales
	 * 
	 */
    // Metodo recursivo
    public <T extends Comparable<T>> boolean bstIguales(Node<T> nod1, Node<T> nod2){
    	
    	// Si ambos son null, serán iguales
    	if(nod1 == null && nod2 == null) 
    		return true;
    	
    	//Si uno es null y el otro no, los arboles no serán similares ni iguales.
    	else if((nod1 != null && nod2 == null) || (nod1 == null && nod2 != null)) 
    		return false;
    	
    	//Comparamos los valores de sus subárboles izquierdos y derechos. Veremos si son iguales 
    	else 
    		return nod1.data.compareTo(nod2.data) == 0 && bstIguales(nod1.left,nod2.left) && bstIguales(nod1.right,nod2.right);
    }
}
