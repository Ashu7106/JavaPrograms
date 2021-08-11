package Collections;

public class LinkedListNode {

	//single linkedlist Node
	Node Head;
	class Node{

		int data;
		Node next;

		Node(int data){

			this.data=data; 
		}

	}

	public void PrintMyLinkedlist() {

		Node n=Head;
		while(n!=null) {

			System.out.println(n.data);

			n=n.next;

		}
	}

	public static void main(String[] args) {


		LinkedListNode ll= new LinkedListNode();

		Node First=ll.new Node(10);

		ll.Head=First;

		Node Second = ll.new Node(20);       
		First.next=Second;

		Node Third =ll.new Node(30);

		Second.next=Third;
   
		ll.PrintMyLinkedlist();
          
	}

}
