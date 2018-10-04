import java.util.Arrays;
public class KaminoDriver {
	public static void main(String[] args) throws CloneNotSupportedException{

		JangoFett obj1 = new JangoFett();
		JangoFett copy1 = new JangoFett(21, 121);
		JangoFett copy2 = new JangoFett(22, 222);
		JangoFett copy3 = new JangoFett(23, 323);

		JangoFett[] fettArray1 = {copy1, copy2, copy3};
		
		JangoFett[] fettArray2= new JangoFett[fettArray1.length];
		
		JangoFett[] fettArray3 = fettArray1; //addition shallow copy
		
		for(int i=0; i<fettArray1.length; i++)
		{
			//fettArray2[i]= fettArray1[i].clone();  **SHOW ERROR**
			fettArray2[i]= (JangoFett)fettArray1[i].clone();
		}
		
		System.out.print("                "+copy1 + ", ");
		System.out.print(copy2 + ", ");
		System.out.println(copy3+"\n");
		
		System.out.println("fettArray1[] = " + Arrays.toString(fettArray1));
		System.out.println("fettArray2[] = " + Arrays.toString(fettArray2));
		System.out.println("fettArray3[] = " + Arrays.toString(fettArray3)); //addition shallow copy
		
		obj1.zeroFett(copy1);
		
		System.out.println();
		System.out.println("fettArray1[] = " + Arrays.toString(fettArray1));
		System.out.println("fettArray2[] = " + Arrays.toString(fettArray2)); //deep copy: doesnt change when og changes
		System.out.println("fettArray3[] = " + Arrays.toString(fettArray3)); //shallow copy: changes when og changes
		
		//shallow copy makes an array that points to the first array (alias)
		//deep copy creates a new array with a different reference in memory with the same numbers as the original array
		
		
		
	}
}
