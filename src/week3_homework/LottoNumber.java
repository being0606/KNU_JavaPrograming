package week3_homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 로또 복권 번호 추첨 프로그
 * @author being
 *
 */
public class LottoNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);

		int [] array = new int [6]; //6개추
		for(int row=0; row<array.length;row++) {
			array[row]= generator.nextInt(50);
			System.out.print(array[row]+" ");
		}
		input.close();
	}
}