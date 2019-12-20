
class Node {
	
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
}
public class LinkedList {

	Node header;
	
	public LinkedList() {
		header = null;
	}
	
	public void printLinkedList() {
		Node n = header;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void inBetweenLinkedList(int position , int data) {
		
	}
	
	public void addAtLast (int data) {
		Node nextNode = new Node(data);
		Node currentNode = header;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = nextNode;
	}
	
	public void push(int d) {
		Node currentHeader = new Node(d);
		currentHeader.next = header;
		this.header = currentHeader;
	}
	
	public int peek() {
		if (this.header == null)
			return 0;
		return this.header.data;
	}
	
	public int pop() {
		Node currentNode = this.header;
		this.header = this.header.next;
		return currentNode.data;
	}
	
	public void add(int d) {
		if(this.header == null) {
			this.header = new Node(d);
		}else {
			Node newNode = new Node(d);
			Node currentNode = this.header;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node (3);
		
		list.header = one;
		one.next = two;
		two.next = three;
		//list.addAtLast(4);
		//list.printLinkedList();
		
		LinkedList stack = new LinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//System.out.println("peek value : " +stack.peek());
		stack.push(4);
		//System.out.println("stack values");
		//stack.printLinkedList();
		//System.out.println("pop value : "+ stack.pop());
		//System.out.println("stack values after pop ");
		//stack.printLinkedList();
		
		LinkedList queue = new LinkedList();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("Queue data");
		queue.printLinkedList();
		System.out.println("pop value :  "+queue.pop());
		System.out.println("Queue data after pop");
		queue.printLinkedList();
	}
	
	
}
