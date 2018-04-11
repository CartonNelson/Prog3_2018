package ej5;

public class SistA extends sistema{

	public SistA(MySimpleLinkedList A, MySimpleLinkedList B) {
		super(A, B);
	}
	
	
	public MySimpleLinkedList getListado(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		this.resultList=new MySimpleLinkedList();
		compararListas(listA,listB);
		return resultList;
	}
	
	public void compararListas(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		while (itA.hasNext()) {
			Node auxA = new Node();
			auxA=itA.next();
			while (itB.hasNext()) {
				Node auxB= new Node();
				auxB=itB.next();
				if(auxA.getInfo()==(auxB.getInfo())) {
					insertar(resultList,auxA);
				}

			}
			itB.setIndice(listB.getFirst());
		}
		itA.setIndice(listA.getFirst());
	}
	
public void insertar(MySimpleLinkedList result, Node n) {
		
		if (resultList.getFirst()==null || resultList.getLast().getInfo()<n.getInfo()) {
			resultList.insert(n.getInfo());
			
		}
		
		
		else {
			Node aux = new Node();
			Node anterior= new Node();
			aux=resultList.getFirst();
			while(n.getInfo()>aux.getInfo()&&aux.getNext()!=null) {			
				anterior=aux;
				aux=aux.getNext();
					
			}
					Node insert = new Node();
					insert.setInfo(n.getInfo());
					insert.setNext(aux);
					anterior.setNext(insert);
									
			}
		if (resultList.getFirst().getInfo()>n.getInfo()) {
			resultList.insertFirst(n.getInfo());
			
		}
	}
}
