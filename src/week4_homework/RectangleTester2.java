package week4_homework;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RectangleTester2 {

	private void test() {

		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random r = new Random(seed);

		Rectangle2[] ar = new Rectangle2[3];   //Rectangle 배열
		List<Rectangle2> list = new ArrayList<>();   //ArrayList<Rectangle>

		for (int i=0; i<3; i++) {
			double width = r.nextDouble() * 100.0;   //0.0 이상 100.0 미만 난수
			double height = r.nextDouble() * 100.0;   //0.0 이상 100.0 미만 난수
			Rectangle2 rect = new Rectangle2(width, height);
			ar[i] = rect;   //배열에 rect를 넣는다
			list.add(rect);   //list에 rect를 넣는다
		}

		System.out.println("Print the array using for-each loop.");
		for (Rectangle2 rect : ar)   //ar에 있는 각 rect에 대해
			System.out.println(rect); 

		System.out.println();

		System.out.println("Print the array list using for-each loop.");
		for (Rectangle2 rect : list)   //list에 있는 각 rect에 대해
			System.out.println(rect); 

		System.out.println();

		System.out.println("Resize the first Rectangle in the ArrayList to (1.0, 2.0).");
		Rectangle2 rec = list.get(0);   //list에 있는 사각형 중 첫 번째 사각형
		rec.setDimension(1.0,  2.0);   

		System.out.println();

		System.out.println("Print the array using for-each loop.");
		for (Rectangle2 rect : ar)   //ar에 있는 각 rect에 대해
			System.out.println(rect); 

		System.out.println();

		System.out.println("Print the array list using for-each loop.");
		for (Rectangle2 rect : list)   //list에 있는 각 rect에 대해
			System.out.println(rect); 


		input.close();
	}

	public static void main(String[] args) {

		new RectangleTester2().test();

	}

}

//class Rectangle2 {
//
//	/**
//	 * 생성자
//	 * @param width 사각형의 너비
//	 * @param height 사각형의 높이
//	 */
//	public Rectangle2 (double width, double height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	/**
//	 * 사각형의 크기를 설정
//	 * @param width 사각형의 너비
//	 * @param height 사각형의 높이
//	 */
//	public void setDimension(double width, double height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	@Override
//	public String toString() { 
//		return String.format("Rectangle[width=%.1f, height=%.1f]", width, height);
//	}
//
//	/**
//	 * 필드
//	 */
//	private double width, height ;
//}