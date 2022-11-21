package week3_homework;

import java.util.*;

/**
 * 문자열을 뒤집어서 출력하는 프로그램
 * @author being
 *
 */
public class ReverserTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 :");
		String s = input.nextLine();

		Reverser reverser = new Reverser(s);
		String reversedString = null;
		reversedString = reverser.reverse();

		System.out.println("뒤집힌 문자열 :" + reversedString);

		String reversedWords = null;
		reversedWords = reverser.reverseWords();

		System.out.println("단어 단위로 뒤집힌 문자열 :"+reversedWords);

		input.close();
	}

}

/**
 * 문자열을 구성하는 글자들의 순서를 바꾼다.
 * 새 문자열을 만들어 준다.
 * @author being
 *
 */
class Reverser {

	private String s;
	public Reverser(String s) {
		this.s = s;
	}

	
	/**
	 * 문자열을 구성하는 글자들의 순서를 바꾼 새 문자열을 만들어준다.
	 * @return 순서가 바뀐 새 문자
	 */	 
	public String reverse() {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i==0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	
	/**
	 * 문자열을 구서하는 글자들의 순서를 바꾼 새 문자열을 만들어준다.
	 * @return 순서가 바뀐 새 문자열.
	 */	 
	public String reverseWords() {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = arr.length - 1; i >= 0; i--)
           sb.append(arr[i]+" ");
        return sb.toString();
     }
}

