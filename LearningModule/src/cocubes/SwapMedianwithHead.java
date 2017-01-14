package cocubes;

import LinkedList.Node;
import LinkedList.SinglyLinkedList;

public class SwapMedianwithHead {

	public static Node swapWithMedian(Node head)
	
	{
		Node slow=head;
		Node fast=head;
		
		Node prev=null,prev1=null;
		Node prevFast=null;
				
				while(fast!=null&&fast.next!=null)
				{
					prev1=prev;
                    prev=slow;
					slow=slow.next;
					prevFast=fast.next;
					fast=fast.next.next;
				}
				if(fast==null){
					prev1.next=slow.next;
					prev.next=head;
					head=prev;
					prevFast.next=slow;
					slow.next=null;
					
					
				}
				else {
					prev.next=slow.next;
					slow.next=head;
					head=slow;
					
				}
				return head;
			}
	
	
	public static void main(String[] args) {

		SinglyLinkedList list=new SinglyLinkedList();

		list.push(6);
		list.push(7);
		list.push(9);	
		list.push(10);
		list.push(11);
		SinglyLinkedList.head=list.push(8);
		
		list.printLinkedList();
		
		SinglyLinkedList.head=swapWithMedian(SinglyLinkedList.head);
		list.printLinkedList();
		

	}

}
