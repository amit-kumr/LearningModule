package HackerRank.java;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Javadeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
          Deque<Integer> deque = new ArrayDeque<Integer>();
          int n = in.nextInt();
          int m = in.nextInt();

          for (int i = 0; i < n; i++) {
              int num = in.nextInt();
             deque.add(num);
          }
          for (int i = 0; i < n-m; i++) 
          {
			int a=deque.removeFirst();
			int b=deque.removeFirst();
			int c=deque.removeFirst();
			
			
        	  
        	  
        	  
		}
          
	}

	
}
