package week3_homework;

import java.util.*;

/**
 * 1000번을 호출하여 나온 값의 빈도수를 출력하는 main메소드를 작성
 * @author being
 *
 */
public class DiceCasting2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Seed: ");
		long seed = input.nextLong();

		Random random = new Random(seed);

		Dice dice = new Dice(random);
		int[] array = new int[12];

		for(int i=0; i<1000; i++) {
			array[dice.roll()-1]++;
		}

		for(int j=0; j<array.length; j++)
			System.out.println(j+1+":\t"+array[j]);

		input.close();
	}

}

//이미 Die class가 있으므로 주석처리하였음.
class Die2 {
	
	public final int MAX = 6;
	Random random;
	
	/**
	 * 생성자
	 * @param r 주사위를 굴려 숫자를 만들어 낼 때 사용할 난수발생기.
	 */
	public Die2(Random r) {
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

class Dice2 {

	private Die2 die1;
	private Die2 die2;

	/**
	 * 생성자
	 * @param r 주사위를 굴려 숫자를 만들어 낼 때 사용할 난수발생기.
	 */
	public Dice2(Random r) {
		die1 = new Die2(r);
		die2 = new Die2(r);
	}

	/**
	 * 주사위 쌍을 굴린다.
	 * @return 주사위 두 쌍의 숫자 합
	 */
	public int roll() {
		return die1.roll()+die2.roll();
	}

}