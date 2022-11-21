package week4_homework;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Rectangle {
   
   private double width, height;

   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }
   
   public void setDimension(double width, double height) {
      this.width = width;
      this.height = height;
   }
   
   public String toString() {
      String widthSt = String.format("%.1f",width);
      String heightSt = String.format("%.1f",height);
      return "Rectangle[width=" + widthSt + ", height=" + heightSt + "]";
   }
   
}

public class RectangleTester {
   
   private void test() {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Seed: ");
      long seed = input.nextLong();
      
      Random random = new Random(seed);
      
      List<String> list = new ArrayList<>();
      String[] recsen = new String[3];
      
      for (int i = 0; i < 3; i++) {
         double randint1 = 100.0 * random.nextDouble();
         double randint2 = 100.0 * random.nextDouble();
         Rectangle rt = new Rectangle(randint1, randint2);
         String listrt = rt.toString();
         list.add(listrt);
         recsen[i] = rt.toString();
      }
      
      System.out.println("Print the array using for-each loop.");
      for (String a : recsen) {
         System.out.println(a);
      }
      
      System.out.println("\nPrint the array list using for-each loop.");
      for (String b : list) {
         System.out.println(b);
      }
      input.close();
   }
   
   public static void main(String[] args) { 
      new RectangleTester().test();
   }

}