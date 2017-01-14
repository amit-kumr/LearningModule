package HackerRank.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		ArrayList<Integer> listElements=new ArrayList<Integer>();
		ArrayList<Integer> lists=new ArrayList<Integer>();
		
		while(n>0){
			
			int d=in.nextInt();
			lists.add(d);
			while(d>0)
			{
				int v=in.nextInt();
				listElements.add(v);
				d--;
			}
			n--;
		}
		int q=in.nextInt();
		
		int[] arr_listElements=new int[listElements.size()];
		int[] arr_lists=new int[lists.size()];
		int j=0;
		for (int i : lists) {
			arr_lists[j]=i;
			j++;
		}
		j=0;
		for (int i : listElements) {
			arr_listElements[j]=i;
			j++;
		}
		in.nextLine();
		while(q>0)
		{
			
			String str=in.nextLine();
			String []str1=str.split(" ");
			
			
	
		try{
			int x =Integer.valueOf(str1[0]);
			int y=Integer.valueOf(str1[1]);
			
			int ele=arr_lists[x-1];
			if(ele>0&&x>0&&y>0)
			{
			int sum=0;
			for (int i = 0; i<x-1; i++) {
				 sum=sum+arr_lists[i];
			}
			System.out.println(arr_listElements[sum+y-1]);
			}
			else {
				System.out.println("ERROR!");
			}
			
		}
		catch(Exception e){
			System.out.println("ERROR!");
		}
		//arr_listElements
		q--;
		
		}
		
	}

}
