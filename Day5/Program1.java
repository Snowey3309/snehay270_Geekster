/*1. Take an integer input.
    If the entered number is an even number, then
        a. If the number is greater than 1000, then print “Even and above 1000”
        b. Else print “Even”
    Else If the entered number is an odd number, then
        a. If the number is greater than 1000, then print “Odd and above 1000”
        b. Else print “Odd”*/

package Day5;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int N;
			Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		if(N%2==0)	
		  {
			if(N>1000)  {
		        System.out.print("Even and above 1000");
						}
			else        {
				System.out.print("Even");
	                    }
		  }
	
		else if	(N%2==1)
		  {
		     if(N>1000) {
		    	 System.out.print("Odd and above 1000");
	                    }
		     else {
			System.out.print("Odd");
	              }
	      }
	        
	
	}
	}
	
