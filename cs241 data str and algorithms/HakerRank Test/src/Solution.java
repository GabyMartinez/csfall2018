import java.util.*;

class MyCalculator {

    int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
          
        return (p == 0) ? 1 : n*power(n,p-1);
    }
}

public class Solution {
    public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
		MyCalculator calc = new MyCalculator();
		int x,y;
		
		while(scan.hasNext()) {
	
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(calc.power(x,y));
			
		}
        // Write your code here
    }
}
