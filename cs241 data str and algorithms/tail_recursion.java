/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public 
class TailRecursion{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(fact(5,1));
	}
	public static int fact(int n, int a){//a should be 1
		if(n==1){
			return a;
		}
		else
			return fact(n-1,n*a);	
/*starts with n*1=a

next (n-1*a)=a

	a=n => n-1*n=a
	
next (n-2*a)=a
		
	a=n-1*n => n-2*(n-1*n)=a

*/
	}
	
	/* tail recursion is when the recusrive call is the last thing excecuted in a recursive function.
		all arithmatic is done and saved in the second argument.
		base case returns the value of the second argument.
	*/
}