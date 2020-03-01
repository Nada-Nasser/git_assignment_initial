public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int radius = Integer.parseInt(input);
        System.out.println("The sphere circumference = " + 2*3.14*radius);
    }
}
