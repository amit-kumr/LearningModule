package HackerRank.Algos;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		String word=sc.next();
		int ht=0;
		for (int i = 0; i < word.length(); i++) {
			int  c=word.charAt(i);
			if(arr[c-97]>ht)
				ht=arr[c-97];
			}
		
			int area=ht*word.length();
			System.out.println(area);
	}

}
