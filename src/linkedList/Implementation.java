package linkedList;



public class Implementation {
	Node head=null;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	 public  void deleteNode(int data) {
	    	
	    	Node s=head;
	    	
	    	while(s.next!=null) {
	    		s.next=null;
	    	}
	    }
	public void addFirst(int data) {
		Node newN = new Node(data);
		if(head == null) {
			head=newN;
			return;
			
		}
		newN.next=head;
		head=newN;
	}
	public void findMiddle() {
		Node fast,slow;
		slow=head;
		fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		System.out.println(slow.data+"  is the middle element of the LinkedList.");
	}
    public void print() {
		Node curr=head;int count=0;
		while(curr!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;count++;
		}
		System.out.println("NULL");
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Implementation list= new Implementation();
               list.addFirst(1);
               list.addFirst(2);
               list.addFirst(3);
               list.addFirst(4);
               list.addFirst(5);
               list.addFirst(6);
               list.print();
          
               System.out.println();
               list.findMiddle();
	}

}
