
public class SummationSeriesSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		System.out.println("Hello, I am summation series subscriber and I am notified with " + input);		
		try {
		        int num = Integer.parseInt(input), sum= num*(num+1)/2;
			System.out.println("The Summation of series is = "+sum);
		    }	
		catch (Exception e)
		{
		        System.out.println("Invalid '"+ input +"' is not a number.");
		}		
	}
}
