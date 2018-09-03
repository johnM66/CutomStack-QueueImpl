package ds.searching;

public class CustumQueueImplementation {
	private static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
	private Node head;
	private Node tail;
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		if(head!=null)
		return head.data;
		return 0;
	}
	public void add(int data) {
		Node node=new Node(data);
		if(tail!=null) {
			tail.next=node;
		}
		tail=node;
		if(head==null) {
			head=node;
		}
	}
	public int remove() {
		int data=head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		return data;
	}
	
public static void main(String[] args) {
	CustumQueueImplementation queue=new  CustumQueueImplementation();
	queue.add(99);
	queue.add(20);
	queue.add(2);
	queue.add(25);
	queue.add(29);
	queue.isEmpty();
	queue.remove();
	int i=queue.peek();
	System.out.println(i+" "+queue.isEmpty());
}
}
