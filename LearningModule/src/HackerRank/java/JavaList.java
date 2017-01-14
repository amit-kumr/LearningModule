package HackerRank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			while(n>0){
				int a=sc.nextInt();
				list.add(a);
				n--;
			}
			int q=sc.nextInt();
			while(q>0){
				int x=0;
				int y=0;
				
				String s=sc.next();
				if(s.equalsIgnoreCase("Insert"))
				{
					x=sc.nextInt();
					y=sc.nextInt();
					list.add(x, y);
				}
				else if(s.equalsIgnoreCase("Delete"))
				{
					x=sc.nextInt();
					list.remove(x);
				}
				q--;
			}
			for (Integer integer : list) {
				System.out.print(integer+" ");
			}
			

	}

}
