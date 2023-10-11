package linkedList;


public class Delete {
	Node head=null;
	class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }public void addFirst(int data) {
    	Node newN=new Node(data);
    	if(head==null) {
    		head=newN;
    	}
    	newN.next=head;
    	head=newN;
    	
    }
    public void print() {
		Node curr=head;
		int count =0;
		while(curr!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
			count++;
		}
		System.out.println("NULL");
		System.out.println(count);
	}
    public void addLast(int data) {
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
    public  void deleteFirst() {
    	if(head==null) {
    		System.out.println("empty");return;
    		
    	}
    	head=head.next;
    	
    }
    public  void deleteLast() {
    	if(head==null) {
    		System.out.println("empty");return;
    		
    	}
    	if(head.next==null) {
    		head=null;
    	}
    	Node secondLast=head;
    	Node LastNode=head.next;
    	while(LastNode.next!=null) {
    		LastNode=LastNode.next;
    		secondLast=secondLast.next;
    	}
    	secondLast.next=null;
    }
    public void midNode() {
    	Node fast,slow;
    	fast=head;slow=head;
    	while(fast!=null && fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    System.out.println(" "+slow.data);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete obj = new Delete();
		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.addFirst(40);
		obj.addFirst(50);
		obj.addLast(70);
		obj.print();
	}

}
