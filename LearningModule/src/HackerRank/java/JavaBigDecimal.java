package HackerRank.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
	
		  Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	int l=s.length;
	      	l=l-2;
	      	for(int i=0;i<l;i++)
	      	{
	      	    
	      	    
	      	    for(int j=1;j<l-i;j++)
	      	        {
	      	    	BigDecimal k1=new BigDecimal(s[j-1]);
	      	    	BigDecimal k2=new BigDecimal(s[j]);
	      	    	
	      	    	if(k1.compareTo(k2)==-1){
	      	    		String temp=s[j-1];
	      	    		s[j-1]=s[j];
	      	    		s[j]=temp;
//	      	    		BigDecimal temp=k1;
//	      	    		k1=k2;
//	      	    		k2=temp;
	      	    	}
	      	    }
	      	    
	      	}
	      	for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }

	      	
	}

}
