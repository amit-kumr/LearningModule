package HackerRank.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	      
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        Set <String>set=new HashSet<String>();
	        Set <String>set1=new HashSet<String>();
	        Set <String>set2=new HashSet<String>();
	    
	       
	       int cnt=0;
	        for (int i = 0; i < t; i++) {
	        	String left=pair_left[i];
	        	String right=pair_right[i];
	        	
	        	
	        	String str=left+right;
	        	boolean f=set.add(str);
	        	
	        	boolean f1=set1.add(left);
	        	boolean f2=set2.add(right);
	        
				if(f)
				{
					++cnt;
					
				}
				else if(f1||f2){
					cnt++;
				}

				System.out.println(cnt);
			}
	        
	        
	}

}
