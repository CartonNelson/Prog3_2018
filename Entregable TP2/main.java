package entregable_tp2;

public class main {
	
	public static void main(String[] args) {
		
		
		
		Node aux = new Node (5);
		Arbol a = new Arbol(aux);



		a.insert(3);
		a.insert(2);
		a.insert(23);
		a.insert(7);
		a.insert(1);
		a.insert(12);
		
		System.out.println(a.impArbol());
		
		System.out.println(a.hasElem(4));
		System.out.println(a.hasElem(7));
		
	}

}
