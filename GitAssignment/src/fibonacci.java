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
    
    
     int MAX = 100; 
   int NIL = -1; 
  
   int lookup[] = new int[MAX]; 
  void initialize() 
  { 
    for (int i = 0; i < MAX; i++) 
        lookup[i] = NIL; 
  } 
        
   int fib(int n) 
  { 
    if (lookup[n] == NIL) 
    { 
      if (n <= 1) 
          lookup[n] = n; 
      else
          lookup[n] = fib(n-1) + fib(n-2); 
    } 
    return lookup[n]; 
  } 

    
    @Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am Fibonacci and I am notified with " + input);
                initialize();
                System.out.println("The Result of Fibonacci is " + fib(Integer.parseInt(input)));
	}
        
     
  
    
    
    
}
