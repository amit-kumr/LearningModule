package LinkedList;

public class SinglyLinkedList {

	public static Node head;
	
	public Node push(int n){
		
		Node newNode=new Node(n);
		
		if(head==null){
			head=newNode;
			}
		else {
			newNode.next=head;
			head=newNode;
			
			
		}
	return head;	
	}
	
	public void printLinkedList(){
		Node curr=head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	
	}
}
