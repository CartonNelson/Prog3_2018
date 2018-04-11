package ej5;

public abstract class sistema {
	protected MySimpleLinkedList resultList;
	protected MyIterator itA,itB;
	
	public sistema(MySimpleLinkedList A,MySimpleLinkedList B) {
		
		this.itA=new MyIterator(A.getFirst());
		this.itB=new MyIterator(B.getFirst());
	}

	
	public abstract MySimpleLinkedList getListado(MySimpleLinkedList listA, MySimpleLinkedList listB);
	public abstract void compararListas(MySimpleLinkedList listA, MySimpleLinkedList listB);
	


	
	

	
	
	
	
}
