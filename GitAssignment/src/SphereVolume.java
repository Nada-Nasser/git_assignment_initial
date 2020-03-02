
public class SphereVolume implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int radius = Integer.valueOf(input);
		
		double PI = Math.acos(-1);
		double volume = (4.0/3.0) * PI * Math.pow(radius, 3);
		System.out.println( "Sphere Volume is: " + volume);
	}

}
