
class Node{

	int data;
	Node next;
}


public class LinkedList {

	static int cpunt=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		Node head=null;
		head=list.insert(head, 10);
		head=list.insert(head, 20);
		head=list.insert(head, 30);
		head=list.insert(head, 40);
		head=list.insert(head, 35);
		head=list.insert(head, 50);
		head=list.insert(head, 60);
		head=list.insert(head, 70);
		head=list.insert(head, 80);
		head=list.insert(head, 90);
		list.print(head);
		head=list.reverseList(head);
		//head=list.delete(head, 2);
		list.print(head);



	}
	
	public Node insert(Node head, int value){
		
		Node tmp= new Node();
		tmp.data=value;
		tmp.next=null;
		
		if(head ==null){
			head=tmp;
		}
		else
		{
			Node current= head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=tmp;
		}
		cpunt++;
			return head;
		
	}
	
	public Node delete(Node head,int n){
		
		if(cpunt==0 || cpunt < n)
			return head;
		if(n==1)
		{
			head=head.next;
		
		}
		else
		{
			Node temp=head;
			for(int i=0;i<n-2;i++){
				temp=temp.next;
			}
			temp.next=temp.next.next;
			
		}
		cpunt--;
		return head;
		
	}
	
	public void print(Node head){
		
		while(head !=null){
			System.out.print(head.data +", ");
			head=head.next;
		}
		System.out.println(" ");
		
	}
	
	public void reversePrintUsingRecursion(Node head){
		
			if (head==null) return;
			reversePrintUsingRecursion(head.next);
			System.out.print(head.data+ " , ");

		
		
	}
	
	public Node reverseList(Node head){
		Node prev, current, temp;
		prev=null;
		current = head;
		temp=head;
		while(current!=null){
			current=current.next;
			temp.next=prev;
			prev=temp;
			temp=current;
		}
		
		head=prev;
		return head;
		
	}
}
