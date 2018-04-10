package ej5;

import java.util.Iterator;

public class MyIterator implements Iterator<Node>{
	protected Node nodo;
	
	public MyIterator(Node n) {
		this.nodo=n;
	}
	
	
	@Override
	public boolean hasNext() {
		
		return (nodo!=null);
	}

	@Override
	public Node next() {
		Node aux=new Node();
		aux.setInfo(nodo.getInfo());
		this.nodo=this.nodo.getNext();
		return aux;
	}
	public void setIndice(Node n) {
		this.nodo=n;
	}

}
