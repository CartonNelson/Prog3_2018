package ej5;

public class SistB extends sistema{

	public SistB(MySimpleLinkedList A, MySimpleLinkedList B) {
		super(A, B);
	}

	public MySimpleLinkedList getListado(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		this.resultList=new MySimpleLinkedList();
		if (listA.getSize()<=listB.getSize()) {
			compararListas(listA,listB);
			return resultList;
		}else {
			compararListas(listB,listA);
			return resultList;
		}
		
	}
	
public void compararListas(MySimpleLinkedList listA,MySimpleLinkedList listB) {
		
		while(itA.hasNext()) {
			Node auxA = new Node();
			auxA=itA.next();
			
			while (itB.hasNext()) {
				Node auxB= new Node();
				auxB=itB.next();
				if(auxA.getInfo()==(auxB.getInfo())) {
					resultList.insert(auxA.getInfo());
					
				}	
			}
			
			
			itB.setIndice(listB.getFirst());
		}
		itA.setIndice(listA.getFirst());
	}



}
