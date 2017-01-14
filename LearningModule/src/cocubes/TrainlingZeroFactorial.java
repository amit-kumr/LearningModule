package cocubes;

public class TrainlingZeroFactorial {

	static int trainlingZero(int n){
		
		int cnt = 0;
		if(n==5)
		{
		return 1;
		}
		else{
			
			for ( int j = 5; n/j >= 1; j *= 5 )
			{
		
			cnt  +=  n  /  j;
			}
			
			
			
		}
		return cnt;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(trainlingZero(100));

	}

}
