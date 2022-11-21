package week3_homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 인기투표 기계 프로그램
 * @author being
 *
 */
public class VotingSimulation {

	public static void main(String[] args) {

		System.out.println("Seed: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);

		VotingMachine voteMachine = new VotingMachine();

		for(int i = 0; i<1000; i++) {
			if(random.nextBoolean())
				voteMachine.voteForSun();
			else
				voteMachine.voteForTkeokk();   
		}
		System.out.println("Sundae: " + voteMachine.getSunVotes());
		System.out.println("Tteokbokki: " + voteMachine.getTkeokkVotes());

		input.close();
	}

}

/**
 * 투표기 프로그
 * @author being
 *
 */
class VotingMachine {
	private int Sundae;
	private int Tteokbokki;

	public void voteForTkeokk() {
		Tteokbokki++;
	}
	public void voteForSun() {
		Sundae++;
	}
	public void clear() {
		Tteokbokki = 0;
		Sundae = 0;
	}
	public int getTkeokkVotes() {
		return Tteokbokki;
	}
	public int getSunVotes() {
		return Sundae;
	}

}