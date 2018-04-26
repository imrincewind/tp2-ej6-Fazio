package ej6;

public class ArbolBinario {
	private Nodo root = new Nodo();
	private int size;
	private Nodo answer = null;

	public Nodo getRoot() {
		return root;
	}

	public boolean hasElement(Object elem) {
		if (size != 0) {
			if (findElem(root, elem).getInfo() == elem) {
				
				answer = null; 
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
				answer = n;
			} else if (n.getInfo().toString().compareTo(elem.toString()) < 0) {
				if (n.getRight() != null) {
					answer = n.getRight();
					findElem(answer, elem); 
				} else { 
					answer = n; 
				} 
			} else if (n.getLeft() != null) { 
				answer = n.getLeft();
				findElem(answer, elem);
			} else {
				answer = n;
			}
		}

		return answer;
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
			root.setInfo(o);
			size++;
		}
		
	}

	

}