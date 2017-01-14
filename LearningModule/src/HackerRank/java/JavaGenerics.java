package HackerRank.java;

public class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static  <E> void printArray(E arr[]){
		
		for (E element : arr) {
			System.out.println(element);
		}
		
	}
}
