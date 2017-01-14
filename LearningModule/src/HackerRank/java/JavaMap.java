package HackerRank.java;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      
	      HashMap<String, Integer>map=new HashMap<String,Integer>();
	      
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         map.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         try{
	         int a=map.get(s);
	         //int g=null;
	      
	        	 System.out.println(s+"="+a);
	         }
	         catch(Exception e){
	        	 System.out.println("Not found");
	         }
	      }	

	}

}
