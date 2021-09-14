// Using linked list in Java
import java.until.LinkedList;

public class MyClass {
    public static void main(String args[]) {
      LinkedList travelBucketList = new LinkedList();
      
      // Add Items
      travelBucketList.add("Helsinki, Finland");
      travelBucketList.addFirst("London, England");
      travelBucketList.addLast("Berlin, Germany");
      travelBucketList.add(2, "Athens, Greece");
      System.out.println(travelBucketList);
      
      // Access
      System.out.println(travelBucketList.get(2));
      System.out.println(travelBucketList.getFirst());
      
      System.out.println(travelBucketList.contains("London, England"));
      
      // Remove Items
      travelBucketList.removeFirst();
      travelBucketList.removeLast();
      System.out.println(travelBucketList);
      
      travelBucketList.remove("Athens, Greece");
      travelBucketList.remove(0);
      System.out.println(travelBucketList);
    }
}