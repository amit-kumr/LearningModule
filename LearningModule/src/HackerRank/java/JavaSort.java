package HackerRank.java;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student[] student=new Student[n];
		
		for (int i = 0; i < student.length; i++) {
			student[i]=new Student(sc.nextInt(),sc.next(),sc.nextDouble());
			}
		Arrays.sort(student,new StudentComparator());;	
		
		for (Student student2 : student) {
			System.out.println(student2.getFname());
		}
	}

}
