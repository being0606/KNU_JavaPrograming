package week3_homework;

import java.util.Scanner;
import java.util.Random;

/**
 * 로또번호 생성
 * @author being
 *
 */
public class LottoGeneratorTest {

	public static void main(String[] args) {

		int[] numbers; // 정수 배열을 가리키는 데 사용할 레퍼런스 변수.

		System.out.print("Seed: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);

		// RottoGenerator 인스턴스 구
		LottoGenerator generator = new LottoGenerator(random);

		// 여섯개의 숫자로 이루어진 로또 번호를 10번 만들어 줌.
		for(int n = 0; n < 10; n++){
			numbers = generator.generateNumbers();
			for(int i = 0; i < 6; i++){
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}

/**
 * 로또 복권을 적을 수 있 여섯 개를 만들어 주는 클래스
 */
class LottoGenerator
{
	private Random random;

	/**
	 * 생성자
	 * @param generator 난수를 발생시키는 데 사용할 난수 발생기(Random)
	 */
	public LottoGenerator(Random generator)
	{
		this.random = generator;
	}

	/**
	 * 로또 복권에 적을 수 여섯 개를 만들어 준다.
	 * @return 여섯 개의 정수가 들어 있는 정수 배열.
	 */
	public int[] generateNumbers(){
		
		int[] Lotto;
		Lotto = new int[6];
		for(int i = 0; i < Lotto.length; i++)
			Lotto[i] = random.nextInt(50);

		return Lotto;
	}

}