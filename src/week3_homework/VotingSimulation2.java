//package week3_homework;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * 인기투표 기계 프로그램
// * @author being
// *
// */
//public class VotingSimulation {
//
//	public static void main(String[]args) {
//
//		System.out.println("Seed: ");
//		Scanner input = new Scanner(System.in);
//		long seed = input.nextLong();
//		Random random = new Random(seed);
//
//		VotingSimulation2 voteMachine2 = new VotingSimulation2();
//
//		for(int i = 0; i<1000; i++) {
//			if(random.nextBoolean())
//				voteMachine2.vote("Sundae");      
//			else
//				voteMachine2.vote("Tteokbokki");
//		}
//		System.out.println("Sundae: " + voteMachine2.getVotes("Sundae"));
//		System.out.println("Tteokbokki: " + voteMachine2.getVotes("Tteokbokki"));
//
//		input.close();
//	}
//
//
//
//}
//
///**
// * 투표기 프로그
// * @author being
// *
// */
//class VotingSimulation2 {
//	private int Sundae;
//	private int Tteokbokki;
//
//	public void voteForTkeokk() {
//		Tteokbokki++;
//	}
//	public void voteForSun() {
//		Sundae++;
//	}
//	public void clear() {
//		Tteokbokki = 0;
//		Sundae = 0;
//	}
//	public int getTkeokkVotes() {
//		return Tteokbokki;
//	}
//	public int getSunVotes() {
//		return Sundae;
//	}
//	public void vote(String pick) {
//		if(pick.equals("Tteokbokki"))
//			Tteokbokki++;
//		else if(pick.equals("Sundae"))
//			Sundae++;
//	}
//	public int getVotes(String pick) {
//		if(pick.equals("Tteokbokki"))
//			return Tteokbokki;
//		else if(pick.equals("Sundae"))
//			return Sundae;
//		else
//			return 0;
//
//	}
//
//
//}