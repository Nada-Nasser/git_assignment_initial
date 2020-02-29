
public class SphereArea implements ISubscriber {
	public void notifySubscriber(String input) {
		double R = Double.parseDouble(input); 
		System.out.println(R * R * 4 * 22.0 / 7 );
	}

}
