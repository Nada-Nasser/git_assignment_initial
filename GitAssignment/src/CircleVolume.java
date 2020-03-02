public class CircleVolume implements ISubscriber {
    @java.lang.Override
    public void notifySubscriber(String input) {
        double redius = Double.parseDouble(input);
        double volume = (4.0/3.0) * (22.0/7.0) * Math.pow(redius , 3);
        System.out.println("The volume of the ball is: " + volume);
    }
}