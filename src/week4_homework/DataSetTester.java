package week4_homework;


import java.util.Scanner;
import java.util.Random;

public class DataSetTester {

   private void test() {
      Scanner input = new Scanner(System.in);
      System.out.print("Seed: ");
      long seed = input.nextLong();
      Random r = new Random(seed);
      System.out.println();
      
      Rectangle2[] rects = new Rectangle2[100];
      for (int i = 0; i < 100; i++) {
         double w = r.nextDouble() * 100.0;
         double h = r.nextDouble() * 100.0;
         rects[i] = new Rectangle2(w, h);
      }
      
      DataSet ds = new DataSet();
      for (int i = 0; i < 100; i++) {
         ds.add(rects[i]);
      }
      
      Measurable rectangle = ds.getMaximum();
      
      System.out.println("Rectangle2 with the largest area: " + rectangle);
      System.out.printf("The Largest area: %,.1f\n", rectangle.getMeasure());
      System.out.printf("Average area: %,.1f", ds.getAverage());
      System.out.println("\n");
      
      DataSet ds2 = new DataSet();
      for (int i = 0; i < 100; i++) {
         ds2.add(new BankAccount(r.nextDouble()*10_000.0));
      }
      
      Measurable account = ds2.getMaximum();
      Measurable account2 = ds2.getMinimum();
   
      System.out.println("BankAccount with the largest balance: " + account);
      System.out.println("BankAccount with the smallest balance: " + account2);
      System.out.printf("Average balance: %,.1f", ds2.getAverage());
      
      input.close();
      
      
   }
   public static void main(String[] args) {
      new DataSetTester().test();

   }

}


class DataSet {
   
   private double sum;
   private Measurable maximum;
   private Measurable minimum;
   private int count;
   
   public DataSet() {
      sum = 0;
      count = 0;
      maximum = null;
      minimum = null;
      
   }
   
   
   public void add(Measurable x) {
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      if (count == 0 || minimum.getMeasure() > x.getMeasure())
         minimum = x;
      count++;
      
   }
   
   
   public double getAverage() {
      if (count == 0)
         return 0;
      return sum / count;
   }
   
   
   public Measurable getMaximum() {
      return maximum;
   }
   
   public Measurable getMinimum() {
      return minimum;
   }
   
   
}



class BankAccount implements Measurable {
   
   private double balance;
   
   
   public BankAccount (double initialBalance) {
      balance = initialBalance;
      
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) {
      balance -= amount;
   }
   
   
   public double getBalance() {
      return balance;
   }
   
   @Override
   public double getMeasure() {
      return balance;
   }
   
   @Override
   public String toString() {
      return String.format("BankAccount[balance = %.1f]", balance);
      
   }
}


class Rectangle2 implements Measurable {
   
   private double width, height;
   
   public Rectangle2(double width, double height) {
      this.width = width;
      this.height = height;
   }
   
   
   public void setDimension(double width, double height) {
      
      this.width = width;
      this.height = height;
   }
   
   @Override
   public double getMeasure() {
      return width * height;
   }
   
   @Override
   public String toString() {
      return String.format("Rectangle2[width=%,.1f, height=%,.1f]", width, height);
      
   }
   
}


interface Measurable {
   double getMeasure();
}