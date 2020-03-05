
public class TwoPowerNSubscriber implements ISubscriber{

	@Override
	public void notifySubscriber(String input) 
	{
		try {
			int N = Integer.parseInt(input);
			int Result = power(N);
			System.out.println("2^" + N + " = " + Result);
		}	
		catch (Exception e) {
			System.out.println("Invalid Input, " + input + " is not a number.");
		}
	}
	
	
	private int power(int N) // 2^N
	{
		int Result = 1 , X = 2;
		
		while(N > 0)
		{
			if( ( N & 1 ) == 1) // if N is Odd
			{
				Result*=X;
			}
			
			N>>=1; // N = N/2
			X *= X;
		}
		
		return Result;
	}

}
