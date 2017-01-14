package HackerRank.java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     
		 
	      while (sc.hasNext()) {
	    	  boolean flag=false;
	         String input=sc.next();
	         
	         if(input.length()%2==0){
	        	 
	         Stack<Character>stack=new Stack<>();
	            //Complete the code
	         for (int i = 0; i < input.length(); i++) {
				char c=input.charAt(i);
				 if(c=='('||c=='{'||c=='[')
				 {
					 stack.push(c);
				 }
				 else if(!stack.empty()){
					 char c1=stack.pop();
					 if(c1=='('||c1=='{'||c1=='[')
						 flag=true;
					 else 
					 {
						 flag=false;
						 break;
					 }
					 
				 }
				 else 
				 {
					 flag=false;
					 break;
				 }
				 
			}}
	         System.out.println(flag);
	        
	      }
	      
    sc.close();
	}

}
