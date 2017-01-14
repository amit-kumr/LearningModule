package cocubes;

public class CheckArmStrongNumber {

	static void checkArmstrongNumber(int n){
		int temp = n;
		int sum = 0;
		int mod = 0;
		
		while(temp != 0) {
			
			mod = temp % 10;
			sum = sum + (mod * mod * mod);
			temp = temp / 10;
		}
		
		if(sum == n) 
			System.out.println(n + " is an Armstrong number");
		else
			System.out.println(n + " is not an Armstrong number");
	}
		
	
	public static void main(String[] args) {

		checkArmstrongNumber(371);

		

	}

}
