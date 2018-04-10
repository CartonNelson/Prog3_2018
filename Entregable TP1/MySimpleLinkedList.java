package ej5;

import java.util.Iterator;

public class MySimpleLinkedList {
	protected Node first;
	protected int size;
	protected Node last;
	public MySimpleLinkedList() {
		first = null;
		last=null;
		size=0;
	}
	
	public int getSize() {
		return this.size;
	}
	public void insertFirst(int o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
		size++;
	}
	public void insert(int o) {
		Node tmp = new Node(o, null);
		if(first==null) {
			first=tmp;
			last=tmp;
		}	else {
			last.setNext(tmp);
			last=tmp;
			}
		size++;
	}
	
	
	public boolean isEmpty() { 
		return(first==null);
	}


	public Node getFirst() {
		return this.first;
	}
	public Node getLast() {
		return this.last;
	}

}
