package ej6;


public class ArbolBinario {
	private Nodo root = null;
	private int size;


	public Nodo getRoot() {
		return root;
	}

	public boolean hasElement(Object elem) {
		if (size != 0) {
			if (findElem(root, elem).getInfo() == elem) {
				
				
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	private Nodo findElem(Nodo n, Object elem) {
		if (n != null) {
			if (n.getInfo().equals(elem)) {
				return n;
			} else if (n.getInfo().toString().compareTo(elem.toString()) < 0) {
				if (n.getRight() != null) {
					
					findElem(n.getRight(), elem); 
				} else { 
					return n; 
				} 
			} else if (n.getLeft() != null) { 
				findElem(n.getLeft(), elem);
			} else {
				return n;
			}
		}

		return n;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(Object o) { 
		Nodo nodo = new Nodo(o);
		if (!this.isEmpty()) {
			Nodo nod = findElem(root, o);
			if (nod != null) {
				if (nod.getInfo().toString().compareTo(o.toString()) < 0) {
					nod.setRight(nodo);
					size++;
				} else if (nod.getInfo().toString().compareTo(o.toString()) > 0) {
					nod.setLeft(nodo);
					size++;
				} 
			}
		} else {
			
			this.root = nodo;
			size++;
		}
		
	}

	

}