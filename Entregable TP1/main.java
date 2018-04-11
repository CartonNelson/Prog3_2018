package ej5;

public class main {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
	
		
		MySimpleLinkedList listaA= new MySimpleLinkedList();
		MySimpleLinkedList listaB= new MySimpleLinkedList();
		
		
		///////////////PUNTO A///////////////
//		listaA.insert(17);
//		listaA.insert(3);		
//		listaA.insert(25);
//		listaA.insert(2);
//		listaA.insert(6);
//		listaA.insert(1);
//		
//		listaB.insert(3);
//		listaB.insert(6);
//		listaB.insert(25);
//		listaB.insert(1);
//		listaB.insert(17);
//		
//		SistA s1 = new SistA(listaA,listaB);
//		MyIterator itResultA = new MyIterator(s1.getListado(listaA, listaB).getFirst());
//		while(itResultA.hasNext()) {
//			System.out.println(itResultA.next().getInfo());
//		}
		
		
		/////////////////PUNTO B////////////
		listaA.insert(1);
		listaA.insert(3);
		listaA.insert(5);
		
		listaB.insert(1);
		listaB.insert(3);
		listaB.insert(5);
		listaB.insert(7);
		
		SistB s2 = new SistB(listaA,listaB);
		
		
		MyIterator itResultB = new MyIterator(s2.getListado(listaA, listaB).getFirst());
		while(itResultB.hasNext()) {
			System.out.println(itResultB.next().getInfo());
		}
		
		
	
	
		
	}
	
}
