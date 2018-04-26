package ej6;

public class Main {

	public static void main(String[] args) {
		Auto a = new Auto("Bora", "AA010AB" );
		Auto b = new Auto("Polo", "AA021AB" );
		Auto c = new Auto("Uno", "AA013AB" );
		Auto d = new Auto("Berlingo", "AA017AB" );
		Auto e = new Auto("Gol", "AA010CC" );
		Auto f = new Auto("Cubo", "AA411AA" );
		Auto g = new Auto("Agile", "AB110AB" );
		Auto h = new Auto("Megane", "AA011AF" );
		Auto k = new Auto("Spark", "AA019FF" );
		ArbolBinario arbol = new ArbolBinario();
		arbol.insert(a);
		arbol.insert(b);
		arbol.insert(c);
		arbol.insert(d);
		arbol.insert(e);
		arbol.insert(f);
		arbol.insert(g);
		arbol.insert(h);
		System.out.println(arbol.hasElement(a));
		System.out.println(arbol.hasElement(k));
		
		

	}

}
