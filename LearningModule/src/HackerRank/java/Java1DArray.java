package HackerRank.java;

import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t>0){
			
			int n=in.nextInt();
			int m=in.nextInt();
			
			int a[]=new int[n];
			
			for (int i = 0; i < a.length; i++) {
				a[i]=in.nextInt();
				}
			System.out.println(gameWin(a, n, m));
			t--;
		}

	}

	public static String gameWin(int a[],int n,int m){
		String status ="NO";
		
		int curr=0;
		if(m>=n)
			status="YES";
		else 
		{
			int cnt=0;
		while(curr<n&&cnt<=n){
			
			try{
			if(a[curr+m]==0){
				curr=curr+m;
			}
			else if(a[curr+1]==0)
				curr=curr+1;
			else 
				if(a[curr-1]==0)
				curr=curr-1;
				
//			else if(a[curr-5]==0)
//				curr=curr-5;
			else 
				break;
		}
		catch(Exception e)
		{
			if(curr+m>=n)
		status="YES";
			else 
				status="NO";
		break;
		}
			cnt++;
		}
		
		if(curr>=n)
		status="YES";
		}
		
		return status;
	}
	
}
