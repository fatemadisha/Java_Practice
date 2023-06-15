package Newtest.Java_try;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	int name1, name2,name3,name4;
    		
    		System.out.print("Input first number: ");
   		     name1 = input.nextInt();
   		    
   		 System.out.print("Input second number: ");
		     name2 = input.nextInt();
		    
		    System.out.print("Input third number: ");
   		     name3 = input.nextInt();
   		    
   		 System.out.print("Input fourth number: ");
		     name4 = input.nextInt();
  
    	
    	if ( (name1==name2)&&(name2==name3)&&(name3==name4)) {
    		
    		System.out.println("Numbers are equal");
    		
    	}
    	else {
    		System.out.println("Numbers are  not equal");
    	}
    	
        
    }
}
