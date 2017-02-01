package cocubes;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
	
	
	static int longestSubsequence(String s) {
		
		//aaeeiiioouu
		String m="";
		boolean flag=true;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(i==0&&c=='a'){
				m=m+c;
			}
			else if(c=='a' && m.charAt(m.length()-1)=='a'){
			m=m+c;
			}
			else if(c=='e') {
				if(m.charAt(m.length()-1)=='a'||m.charAt(m.length()-1)=='e')
					m=m+c;
				
			}
			else if(c=='i') {
				if(m.charAt(m.length()-1)=='e'||m.charAt(m.length()-1)=='i')
					m=m+c;
				
			}
			else if(c=='o') {
				if(m.charAt(m.length()-1)=='i'||m.charAt(m.length()-1)=='o')
					m=m+c;
				
			}
			else if(c=='u') {
				if(m.charAt(m.length()-1)=='o'||m.charAt(m.length()-1)=='u')
					m=m+c;
				
			}
		}
		if((!m.contains("a"))||(!m.contains("e"))||(!m.contains("i"))||(!m.contains("o"))||(!m.contains("u")))
			return 0;
		return m.length();


    }
	
	
	static String mergeStrings(String a, String b) {
		
		String res="";
		int i=0;
		char c1=a.charAt(i);
		char c2=b.charAt(i);
		while(c1!='\0'&&c2!='\0'){
			res=res+c1+c2+"";
			i+=1;
			try{
			c1=a.charAt(i);
			c2=b.charAt(i);
			}
			catch(Exception e){
				break;
			}
		}
		if(a.length()==i){
		res=res+b.substring(i);	
		}
		else {
			
			res=res+a.substring(i);	
		}
		return res;


    }

	public static void main(String[] args) throws IOException {
		   Scanner in = new Scanner(System.in);

		   String _a=in.next();
	       
	       int  res = longestSubsequence(_a);
	       System.out.println(res);


	}

}
