package ej5;

public class sistema {
	private MySimpleLinkedList resultList;
	private MyIterator itA,itB;
	
	public sistema(MySimpleLinkedList A,MySimpleLinkedList B) {
		
		this.itA=new MyIterator(A.getFirst());
		this.itB=new MyIterator(B.getFirst());
	}
	//////////////PUNTO A////////////////////////
	public MySimpleLinkedList getListadoA(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		this.resultList=new MySimpleLinkedList();
		compararListasDesord(listA,listB);
		return resultList;
	}
	
	
	public void compararListasDesord(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		while (itA.hasNext()) {
			Node auxA = new Node();
			auxA=itA.next();
			while (itB.hasNext()) {
				Node auxB= new Node();
				auxB=itB.next();
				if(auxA.getInfo()==(auxB.getInfo())) {
					insertarOrdenado(resultList,auxA);
				}

			}
			itB.setIndice(listB.getFirst());
		}
		itA.setIndice(listA.getFirst());
	}


	public void insertarOrdenado(MySimpleLinkedList result, Node n) {
		
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
	/////////////////////PUNTO B/////////////////////////
	public MySimpleLinkedList getListadoB(MySimpleLinkedList listA, MySimpleLinkedList listB) {
		this.resultList=new MySimpleLinkedList();
		if (listA.getSize()<=listB.getSize()) {
			compararListasOrd(listA,listB);
			return resultList;
		}else {
			compararListasOrd(listB,listA);
			return resultList;
		}
		
	}
	
public void compararListasOrd(MySimpleLinkedList listA,MySimpleLinkedList listB) {
		
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
