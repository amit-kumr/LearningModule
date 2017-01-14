package HackerRank.java;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int len=A.length()+B.length();
        System.out.println(len);
        int a=A.compareTo(B);
         
         if(a>=1)
        System.out.println("Yes");
         else
        System.out.println("No"); 
         
         
         String a1=A.substring(1);
         String a2=B.substring(1);
         String s1=A.charAt(0)+"";
         String s2=B.charAt(0)+"";
         
         System.out.println(s1.toUpperCase()+a1+" "+s2.toUpperCase()+a2);
        	 
	}

}
