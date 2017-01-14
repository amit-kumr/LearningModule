package mediumTypeSolution;

public class CheckPowerOfTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkPowerOFTwo(100));
	}

	static int checkPowerOFTwo(int n){
		
		int count = 0;


		if(n < 0){

		System.out.println("Error: There is no Factorial for a number less than 0");

		return -1; //error condition

		}

		if(n == 5){
		return 1; 
		}


		
		for ( int j = 5; n/j >= 1; j *= 5 )
		{
	
		count  +=  n  /  j;
		}

		return count;
		
	}
}
