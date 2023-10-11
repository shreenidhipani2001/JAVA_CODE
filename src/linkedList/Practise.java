package linkedList;

public class Practise {
   Node head;
   class Node{
	   Node next;
	   int data;
	   Node(int data){
		   this.data=data;
		   this.next=null;
	   }
	   
   }
   public void addFirst(int data) {
	Node newN = new Node(data);
	   if(head==null) {
		head=newN;
		return;
	}
	   newN.next=head;
    }
   public void addLast(int data) {
	   Node curr=head;
	   Node newN = new Node(data);
	   if(head==null) {
		   System.out.println("Empty List");return;
	   }
	   while(curr.next!=null) {
		   curr=curr.next;
	   }
	   curr.next=newN;
   }
   public void deleteFirst() {
	   if(head==null) {
		   System.out.println("Empty List");return;
	   }
	   head=head.next;
   }
   public void deleteLast() {
	   if(head==null) {
		   System.out.println("Empty List");return;
	   }
	   Node curr=head;
	   Node lastNode=curr.next;
	   Node secondLast=curr;
	   while(lastNode.next!=null) {
		   lastNode=lastNode.next;
		   secondLast=secondLast.next;
	   }
	   secondLast.next=null;
   }
   public int countNumberOfElements() {
	   int count=0;
	   Node curr=head;
	   if(head==null) {
		   return 0;
	   }
	   while(curr!=null) {
		   count++;
		   curr=curr.next;
	   }
	   return count;
	   
   }
   public void print() {
	   Node curr=head;
	   if(head==null) {
		   System.out.println("Empty List");return;
	   }
	   while(curr!=null) {
		   System.out.print(curr.data+" -->");
		   curr=curr.next;
	   }
	   System.out.println("NULL");
   }
   public void findMid() {
	   Node fast=head,slow=head;
	   while(fast.next!=null && fast!=null) {
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   System.out.println(slow.data);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Practise obj = new Practise();
            
             obj.addFirst(10);
             obj.addLast(20);
             obj.addFirst(0);
             obj.addLast(30);
             obj.addLast(40);
             obj.addLast(50);
             obj.addLast(60);
             obj.addLast(70);
            
             obj.deleteFirst();
            
             obj.deleteLast();
             obj.print();
             obj.findMid();
             System.out.println(obj.countNumberOfElements());
	}

}
