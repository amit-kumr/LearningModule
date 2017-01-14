package MediumProblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaximumInSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a1 = {1, 2, 3, 4, 5, 6};
	       // List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6));
		 List<Integer> list1=maxList(a1, 3);
		 
		 System.out.println(list1.toString());
	}

	public static List<Integer> maxList(int []a ,int k)
	{
		if(k<=0){
			throw new IllegalArgumentException("value should be greater than Zero for k!");
		}
		
		Deque<Integer> deque=new ArrayDeque<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		
		int i ;
		for (i = 0; i <k; i++) {
			
			while(!deque.isEmpty()&& a[deque.peek()]<=a[i])
				{
				deque.removeFirst();
				}
			
			deque.addLast(i);	
		}
		for (; i < a.length;i++) {
			result.add(a[deque.peek()]);
			
			while(!deque.isEmpty()&& deque.peek()<=i-k)
			{
			deque.removeFirst();
			}
			while (!deque.isEmpty() && a[deque.peek()] <= a[i]) {
                deque.removeFirst();
            }

            deque.addLast(i);
        
			
		}
		
		result.add(a[deque.peek()]);
        return result;
    
		
	}
}
