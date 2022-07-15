package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }
    // Método para verificar si un arbol es estrictamente binario

    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	
    	//Se tomará la raiz del arbol, como inicio, para verificar
        return bstEstrictamenteBinario(a.root);
    }
    
    /*
   	 * Para ver si un arbol es estrictamente binario, se tiene en cuenta que cada nodo (no hoja) del árbol tiene 2 hijos
   	 * Por ello,se debe pasar por cada uno de sus descendientes. 
   	 * Primero comenzamos por la raiz, y de ahí vamos comparando los valores de sus subarboles izquierdos y derechos.
   	 * Si tienen valores diferentes o uno de ellos es null y el otro no. Los arboles no serán iguales
   	 * 
   	 */
       // Metodo recursivo
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> nod){
    	
    	//Si el nodo es null, entonces es estrictamente binario
    	if(nod == null) 
    		return true;
    	
    	//Se verificará que el nodo tenga o bien ambos hijos, o ninguno.
    	else
    		return  ((nod.left == null && nod.right == null) || (nod.left != null && nod.right != null)) && bstEstrictamenteBinario(nod.left) && bstEstrictamenteBinario(nod.right);
    }
}
