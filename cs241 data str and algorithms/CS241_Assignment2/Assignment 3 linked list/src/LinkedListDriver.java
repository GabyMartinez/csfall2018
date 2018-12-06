//Driver for LinkedListADT.java
public class LinkedListDriver
{
   public static void main(String[] args)
   {    
      LinkedList test = new LinkedList();
      
      System.out.println("The magazine list is as follows:");
      test.add("Time");
      test.add("Woodworking Today");
      test.add("Communications of the ACM");
      test.add("House and Garden");
      test.add("GQ");
      
      System.out.println(test); 
      //testing sizeOf() method
      System.out.println(test.sizeOf());
      //testing isEmpty() method
      System.out.println("Is the list empty? "+test.isEmpty() + "\n");
      
      System.out.println(test);
      
   }
}