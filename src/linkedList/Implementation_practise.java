package linkedList;
import linkedList.Implementation;
public class Implementation_practise extends Implementation {
	Node head=null;
	class Node{
		String data;
		Node next=null;
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(String data) {
    	Node newN=new Node(data);
    	if(head==null) {
    		head=newN;
    	}
    	newN.next=head;
    	head=newN;
    	
    }
	public void addLast(String data) {
		Node newN= new Node(data);
		if(head==null) {
		       head=newN;
		       return;
		}
		Node curr=head;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next=newN;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
