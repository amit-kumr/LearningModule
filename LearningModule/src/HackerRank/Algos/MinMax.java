package HackerRank.Algos;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] arr={a,b,c,d,e};
        long min = Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        long min_sum = 0;
        long max_sum = 0;
        
        for(int i=0;i<5;i++){
            
        	if(arr[i]<min)
            min=arr[i];
        	
        	if(arr[i]>max)
            max=arr[i];
        	
        	min_sum=min_sum+arr[i];
        	max_sum=max_sum+arr[i];
        	
        }
        long as=max_sum-min;
        System.out.println(min_sum-max+" "+as);
        
    }
}
