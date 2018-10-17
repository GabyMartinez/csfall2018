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
      
      test.remove("Time");
      
      System.out.println(test);
      
   }
}