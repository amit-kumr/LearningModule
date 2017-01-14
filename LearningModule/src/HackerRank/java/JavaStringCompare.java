package HackerRank.java;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        
        String min="";
        String max="";
        
        int start=0;
        int end=n;
        min=s.substring(start,end);;
        int length=s.length();
        while(end<=length)
        {
        	String sub=s.substring(start,end);
            int res1=	sub.compareTo(min);
            
            if(!(res1>=1))
            	min=sub;
            int res2=	sub.compareTo(max);
        	if(res2>=1)
        		max=sub;
        	start++;
        	end++;
        }
        
        System.out.println(min);
        System.out.println(max);

	}

}
