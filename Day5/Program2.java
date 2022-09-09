/*2. Take integer inputs x, y, z from the user,
    If the x is divisible by 3, then
        a. If y is greater than or equal to 200, then add 10 to the value of z.
        b. Else if y is greater than or equal to 100 but less than 200, then add 5 to the
           value of z
        c. Else if y is greater than or equal to 50, but less than 100, then add 4 to the
           value of z
        d. Else add 1 to z
    Else if x is not divisible by 3, then
        a. If y is greater than or equal to 200, then add 3 to the value of z.
        b. Else if y is greater than or equal to 100 but less than 200, then add 2 to the
           value of z
        c. Else add 1 to z
In the end add 10 to the value of z and print the final value of z. */




package Day5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  int x = sc.nextInt();	
		  int y = sc.nextInt();
		  int z = sc.nextInt();
		  
		  
		if (x%3==0)
		{
			  if(y>=200){  
				  System.out.print(z+3);
			            }
			  else if(y>=100 && y<200) {
				  System.out.print(z+2);
			            }
			  else      {
				  System.out.print(z+1);
			            }
		}
		else if  (x%3==1)
		{
			   if (y>=200){
				   System.out.print(z+3);
			              }
			   else if  (y>=100 && y<200) {
				   System.out.print(z+2);
			                              }
	    
			   else  {
				   System.out.print(z+1);
			         }
			  
		
		
		}
			
   }
}
