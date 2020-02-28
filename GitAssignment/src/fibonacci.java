/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saeed
 */
public class fibonacci  implements ISubscriber {
    @Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am Fibonacci and I am notified with " + input);
                System.out.println("The Result of Fibonacci is " + fib(Integer.parseInt(input)));
	}
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
        } 

  
    
    
    
}
