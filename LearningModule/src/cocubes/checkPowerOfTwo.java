package cocubes;

public class checkPowerOfTwo {

	static int checkPowerOfTw(int n){
		
		int cnt = 0;
		int mod = 0;
		while(mod!=1&&n!=1)
		{
			mod=n%2;
			n=n/2;
			if(mod==1)
				return -1;
			cnt++;
			
		}
		return cnt;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(checkPowerOfTw(64));

	}

}
