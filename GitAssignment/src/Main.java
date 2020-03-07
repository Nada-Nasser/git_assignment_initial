import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
	    new fibonacci(),
		new CircleVolume(),
		new Lucas_Series(),
		new SphereVolume(),
		new SummationSeriesSubscriber(),
		new TwoPowerNSubscriber()
	};
	public static void main(String[] args) {
		
		int choice = 0;
		Scanner in = new Scanner(System.in);
		Topic mathTopic = new Topic();
		
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		
		while(true) {
			System.out.println("\n1- All methods \n"
							 + "2- select one \n"
							 + "3-exit");
			
			System.out.print("\nYour Choice : ");
			choice = in.nextInt();
			if(choice == 1)
			{
				System.out.print("\nWrite n : ");
				Scanner sc = new Scanner(System.in);
				String input = sc.next();
				System.out.println();
				mathTopic.dispatchEvent(input);
			}
			else if (choice == 2)
			{
				System.out.println("\nSelect which method you want");
				System.out.println("1- Summation Series (0 to n).");
				System.out.println("2- Circle volume.");
				System.out.println("3- Sphere Volume.");
				System.out.println("4- Sphere Circumference.");
				System.out.println("5- Lucas Series.");
				System.out.println("6- Sphere Area.");
				System.out.println("7- 2 power n.");
				System.out.println("8- Fibonacci.");
				
				System.out.print("\nYour Choice :- ");
				choice = in.nextInt();
				
				System.out.print("\nWrite n : ");
				Scanner sc = new Scanner(System.in);
				String input = sc.next();
				
				System.out.println();
				mathTopic.NotifyOneSubscriber(input, choice-1);		
			}
			else if(choice == 3)
				break;
			else
				System.out.println("Invalid choice");
			
			System.out.println("------------");
		}		
	}
}
