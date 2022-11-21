package week3_homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 주사위를 두 개 던저 합이 나오는 프로그램
 * 10회반
 * @author being
 *
 */
public class DiceCasting1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Seed: ");
		long seed = input.nextLong();
		
		Random random = new Random(seed);
		
		Dice dice = new Dice(random);
		
		for(int i=0; i<10; i++) {
			System.out.println(dice.roll());
		}	
		input.close();
	}
}

/**
 * 한 개의 주사위를 나타내는 Dice클래스를 작성합니다.
 * @author being
 *
 */
class Die {
	
	public final int MAX = 6;
	Random random;
	
	/**
	 * 생성자
	 * @param r 주사위를 굴려 숫자를 만들어 낼 때 사용할 난수발생기.
	 */
	public Die(Random r) {
		random = r; //r의 참조값 복사.
	}
	
	/**
	 * 주사위를 굴린다. 주사위를 굴린 결과는 1 이상 6 이하 정수이다.
	 * @return 주사위를 굴려 나온 숫자.
	 */
	public int roll() {
		return random.nextInt(MAX)+1; //(random.nextInt == 0~5) + 1 == 1~6
	}

}

/**
 * 두 개의 주사위를 던져나온 값을 리
 * @author being
 *
 */
class Dice {

	private Die die1;
	private Die die2;

	/**
	 * 생성자
	 * @param r 주사위를 굴려 숫자를 만들어 낼 때 사용할 난수발생기.
	 */
	public Dice(Random r) {
		die1 = new Die(r);
		die2 = new Die(r);
	}

	/**
	 * 주사위 쌍을 굴린다.
	 * @return 주사위 두 쌍의 숫자 합
	 */
	public int roll() {
		return die1.roll()+die2.roll();
	}

}