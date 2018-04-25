package entregable_tp2;


public class Arbol {

	private Node raiz;

	public Arbol(Node n) {
		this.raiz = n;
	}

	public Node getRaiz() {
		return raiz;
	}

	public void setRaiz(Node n) {
		this.raiz = n;
	}
	
	public boolean hasElem(Comparable<Integer> c) {
		return hasElem(this.raiz, c);
	}
	//complejidad O(h)///////////////
	private Boolean hasElem(Node n, Comparable <Integer> c) {

		if (n != null) {
			if (n.getInfo().equals(c)) {
				return true;
			}else 
				if (n.getInfo().compareTo((Integer) c) > 0) {
				return hasElem(n.getIzq(), c);
				}else {
					return hasElem(n.getDer(), c);
			}
		}
		return false;
	}

	
	public void insert(Comparable<Integer> c) {
		if (this.raiz == null)
			this.raiz = new Node(c);
		else
			insert(this.raiz, c);
	}
	//complejidad O(h)////////
	private void insert(Node n, Comparable<Integer> c) {
		if(c.compareTo((Integer) n.getInfo()) < 0) {
			if (n.getIzq() == null) {
				Node aux = new Node(c);
				n.setIzq(aux);
			}else {
				insert(n.getIzq(), c);
			}
		}else {
			if (n.getDer() == null) {
				Node aux = new Node(c);
				n.setDer(aux);
			}else {
				insert(n.getDer(), c);
			}

		}

	}
	
	private String impArbol (Node n) {
		String aux="";
		if (n != null) {
			aux += impArbol(n.getIzq());
			aux += n.toString();
			aux += impArbol(n.getDer());
		}else {
			aux += "_";
		}
		return aux;
	}
	
	public String impArbol() {
		return impArbol(this.raiz);
	}
	
	
}
