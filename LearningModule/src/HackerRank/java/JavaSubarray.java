package HackerRank.java;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
		int a[]=new int[n];
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
			if(a[i]<0)
				cnt++;
		}
		//for
		
		
		//int sum =0;
		int low=0;
		int max=1;
		int max1=1;
		
		while(max<n){
			low=0;
		while(max<n)
		{
			int sum=0;
		for (int i =low; i<=max; i++) {
			int k1=a[i];
			 sum=sum+k1;
				}
		low=low+1;
		max=max+1;
		
		if(sum<0)
			cnt++;
		}
		max=max1+1;
		max1++;
		}
		
		
		
		System.out.println(cnt);
		}
		
	}


