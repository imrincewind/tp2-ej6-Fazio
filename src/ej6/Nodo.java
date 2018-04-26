package ej6;



public class Nodo {

	private Object info;
	private Nodo left = null;
	private Nodo right = null;

	public Nodo(Object o) {
		this.info = o;
	}

	public Nodo() {
		
	}

	public void setInfo(Object o) {
		this.info = o;
	}

	public void setLeft(Nodo left) {
		this.left = left;
	}

	public void setRight(Nodo right) {
		this.right = right;
	}

	public Object getInfo() {
		return info;
	}

	public Nodo getLeft() {
		return left;
	}

	public Nodo getRight() {
		return right;
	}

	
}
