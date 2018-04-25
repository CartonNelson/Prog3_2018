package entregable_tp2;

public class Node {
	private Comparable<Integer> info;
	private Node izq;
	private Node der;
	
	
	public Node() {
		info = 0;
		this.izq = null;
		this.der = null;
	}
	
	public Node(Comparable<Integer> c) {
		setInfo(c);
		
	}
	public void setInfo(Comparable<Integer> c) {
		info = c;
	}
	
	public void setIzq(Node n) {
		this.izq=n;
	}
	
	public void setDer(Node n) {
		this.der=n;
	}
	
	
	public Comparable<Integer> getInfo() {
		return info;
	}
	
	
	public Node getIzq() {
		return this.izq;
	}
	
	public Node getDer() {
		return this.der;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.info.toString();
	}
}
