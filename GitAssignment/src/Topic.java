import java.util.ArrayList;
import java.util.List;

public class Topic {

    private List<ISubscriber> subscribers;

    public Topic() {
        subscribers = new ArrayList<ISubscriber>();
    }

    public void addSubscriber(ISubscriber sub) {
        subscribers.add(sub);
    }

    public List<ISubscriber> getSubscribers() {
        return subscribers;
    }

    public void dispatchEvent(String input) {
        for (ISubscriber sub : this.getSubscribers()) {
            sub.notifySubscriber(input);
        }
    }

    public void NotifyOneSubscriber(String input , int index) {
    	try {
        	subscribers.get(index).notifySubscriber(input);
		} catch (Exception e) {
			System.out.println("Invalid Method");
		}
    }
    
    public static double getValue() {
        // TODO Auto-generated method stub
        return 0 ;
    }
}
