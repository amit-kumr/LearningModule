package HackerRank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringTokens {

	int i[]={2};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int l=a.length();
        
        int start=0;
        int end=0;
        
        ArrayList<String>tokens=new ArrayList<String>();
        
        String token="";
      //  token.concat(str)
       // token.ap
        for (int i = 0; i <l; i++) {	
        	char c=a.charAt(i);
        	
			if(((int)c>=65&&(int)c<=90)||((int)c>=97&&(int)c<=121))
			{
				token=token+c;
			}
			
			else {
				if(token!="")
					tokens.add(token);
				    token="";
			}
			if(i==l-1&&token!="")
				tokens.add(token);
		}

        System.out.println(tokens.size());
        for (String string : tokens) {
			System.out.println(string);
		}
	}

}
