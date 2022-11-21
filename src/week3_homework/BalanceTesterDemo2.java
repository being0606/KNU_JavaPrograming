package week3_homework;

import java.util.Scanner;

/**
 * 괄호의 짝이 맞는 지 판단하는 프로그
 * @author being
 *
 */
public class BalanceTesterDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String string= input.nextLine();
		System.out.println("Enter a string to check balance:");
		BalanceTester tester = new BalanceTester(string);
		if(tester.balanced())
			System.out.println("괄호짝이 맞습니다.");
		else
			System.out.println("괄호짝이 맞지 않습니다.");
		input.close();

	}

}
/**
 * 문자열의 괄호 열림, 괄호 닫힘 짝이 맞는지 여부를 검사하는 도구.
 * "(1+(2+3))"은 괄호 짝이 맞는 문자열.
 * "(1+(2+3)"은 괄호 짝이 맞지 않는 문자열.

 */

class BalanceTester {
	String str;
	Counter counter;

	/**
	 * 생성자.
	 * @param s 검사할 문자열.
	 */
	public BalanceTester(String s) {
		this.str = s;
		this.counter = new Counter();
	}
	/**
	 * str의 괄호 짝이 맞는지 검사한다.
	 * @return true, 짝이 맞는 경우,
	 *          false, 짝이 맞지 않는 경우,
	 */
	public boolean balanced() {

		for(int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if(c == '(') {
				counter.countUp();
			}
			if(c == ')') {
				counter.countDown();
			}
			if(counter.getValue()<0) {
				return false;
			}


		}
		int count = counter.getValue();
		counter.reset();

		if(count ==0)
			return true;
		else
			return false;
	}

}

/**
 * 숫자세기 프로그램
 * @author being
 *
 */
class Counter {
	private int value;
	
	/**
	 * 초기값이 0인 객체
	 */
	public Counter() {
		this(0);
	}
	
	/**
	 * 현재값 호출
	 * @param value
	 */
	public Counter(int value) {
		this.value = value;
	}
	
	/**
	 * 양수입력
	 */
	public void countUp() {
		value++;
	}
	
	/**
	 * 음수입력
	 */
	public void countDown() {
		value--;
	}
	
	/**
	 * 초기화
	 */
	public void reset() {
		value = 0;
	}
	
	/**
	 * 입력값 호출
	 * @return
	 */
	public int getValue() {
		return value;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Counter counter = new Counter();

		System.out.println("Counting positive and negative integers.");

		while (true) {
			System.out.println("Enter an integer: ");
			int i = input.nextInt();
			if (i == 0)
				break;
			else if (i > 0)
				counter.countUp();
			else
				counter.countDown();
		}

		System.out.println("Number of positive integers - number of negative integers = " + counter.getValue());
		input.close();
	}
}