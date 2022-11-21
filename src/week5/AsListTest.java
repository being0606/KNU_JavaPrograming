package week5;
import java.util.*;
//import java.lang.Comparable;
public class AsListTest {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Seed: ");
      long seed = input.nextLong();
      Random generator = new Random(seed);

      List<Integer> list = Arrays.asList(generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt());      
      
      System.out.println("List.");
      System.out.println(list);
      System.out.println();
      System.out.println("List sorted in Natural ordering.");
      Collections.sort(list);
      System.out.println(list);
      System.out.println();
      System.out.println("List sorted by the absolute values.");
      Collections.sort(list, new AbsoluteValueComparator());
      System.out.println(list);
      input.close();
   }
}

class AbsoluteValueComparator implements Comparator<Integer> {
   public int compare (Integer i1, Integer i2) {
      if(Math.abs(i1) > Math.abs(i2))
         return 1;
      else if (Math.abs(i1) == Math.abs(i2))
         return 0;
      else
         return -1;
   }
}