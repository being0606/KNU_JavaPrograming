//package week3_homework;
//
//
//import java.util.Scanner;
//
//
///**
// * 숫자세기 프로그램
// * @author being
// *
// */
//public class Counter {
//	private int value;
//	
//	/**
//	 * 초기값이 0인 객
//	 */
//	public Counter() {
//		this(0);
//	}
//	
//	/**
//	 * 햔재값 호
//	 * @param value
//	 */
//	public Counter(int value) {
//		this.value = value;
//	}
//	
//	/**
//	 * 양수입력
//	 */
//	public void countUp() {
//		value++;
//	}
//	
//	/**
//	 * 음수입력
//	 */
//	public void countDown() {
//		value--;
//	}
//	
//	/**
//	 * 초기값
//	 */
//	public void reset() {
//		value = 0;
//	}
//	
//	/**
//	 * 입력값 호출
//	 * @return
//	 */
//	public int getValue() {
//		return value;
//	}
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		Counter counter = new Counter(); //클래스 내에 이미 counter가 있어서 상관없지만. 
//
//		System.out.println("Counting positive and negative integers.");
//
//		while (true) {
//			System.out.println("Enter an integer: ");
//			int i = input.nextInt();
//			if (i == 0)
//				break;
//			else if (i > 0)
//				counter.countUp();
//			else
//				counter.countDown();
//		}
//		System.out.println("Number of positive integers - number of negative integers = " + counter.getValue());
//	}
//}