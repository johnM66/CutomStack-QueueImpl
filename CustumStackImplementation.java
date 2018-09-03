package ds.searching;

public class CustumStackImplementation {
	private static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
	private Node top;
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		if(top!=null)
		return top.data;
		return 0;
	}
	public void push(int data) {
		Node node=new Node(data);
		if(top!=null) {
			node.next=top;
		}
		top=node;
		if(top==null) {
			top=node;
		}
	}
	public int pop() {
		int data=top.data;
		top=top.next;
		return data;
	}
	
public static void main(String[] args) {
	CustumStackImplementation stack=new  CustumStackImplementation();
	stack.push(151);
	stack.push(22);
	stack.push(1);
	stack.pop();
	int i=stack.peek();
	System.out.println(i+" "+stack.isEmpty());
}
}
