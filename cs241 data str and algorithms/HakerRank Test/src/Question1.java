import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Question1 {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int valuesCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String[] values = new String[valuesCount];

	        for (int i = 0; i < valuesCount; i++) {
	            String valuesItem = scanner.nextLine();
	            values[i] = valuesItem;
	        }

	        String[] res = braces(values);

	        for (int i = 0; i < res.length; i++) {
	            bufferedWriter.write(res[i]);

	            if (i != res.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	    
	    static String[] braces(String[] values) {
	        String[] result = new String[2];
	        if(values.length>15){
	            result[1] = "NO";
	        }
	        else{
	            for (int i=0; i<values.length;i++){
	                String val = values[i];
	                
	           /*     switch(val){
	                    case "{":
	                        if(values[i+1]){
	                            
	                        }
	                }
			*/
	          //      /*
	                if(val.equals("{")){
	                    if(values[i+1].equals("}")){
	                        result[1] = "YES";
	                    }
	                    else 
	                    	result[1] = "NO";
	                }
	                else if(val.equals("[")){
	                    if(values[i+1].equals("]")){
	                        result[1] = "YES";
	                    }
	                    else
	                        result[1] = "NO";

	                }
	                else if(val.equals("(")){
	                    if(values[i+1].equals("]")){
	                        result[1] = "YES";
	                    }
	                    else
	                        result[1] = "NO";
	                }
	                else{
	                    result[1] = "NO"; 
	                }
	        //     */

	            }
	        }
	        return result;

	    }
}


