package HackerRank.DataStructure.Arrays;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
        for(int j=0; j < 6; j++){
            arr[i][j] = in.nextInt();
        }
    }
        int l=arr.length;
        int max=-50;
    for (int i = 0; i <l-2 ; i++) {
    	for (int j = 0; j < l-2; j++) {
    		int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		
    	
    		if(sum>max)
    			max=sum;
    	}
		
	}    
	System.out.println(max);
	}

}
