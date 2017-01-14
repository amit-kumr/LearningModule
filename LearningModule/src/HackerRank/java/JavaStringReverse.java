package HackerRank.java;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        
        boolean flag=false;
        
        for (int i = 0; i <len/2; i++) {
			
        	if(!(s.charAt(i)==s.charAt(len-i-1)))
        	{
        		flag=true;
        		break;
        	}
		}
        if(flag)
        System.out.println("No");
        else 
        	System.out.println("Yes");
	}

}
