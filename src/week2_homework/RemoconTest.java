package week2_homework;


import java.util.Scanner;
/**
 * 리모컨 프로그램.
 * @author 임현진
 *
 */
public class RemoconTest {
	
	public static void main(String[] args) {
		
		Remocon remocon = new Remocon();		// Remocon 인스턴스 구성
		
		Scanner input = new Scanner(System.in); // Scanner 인스턴스 구성
		
		remocon.display();	// Remocon에게 display 명령 호출

		boolean end = false;
		int selection = 0;
		while(!end) { // end가 아닌 동안 반
			System.out.println();
			System.out.println("1: volume up.");
			System.out.println("2: volume down.");
			System.out.println("3: Channel up.");
			System.out.println("4: Channel down.");
			System.out.println("0: End.");
			System.out.println("Select: ");
			
			selection = input.nextInt();
			switch (selection) {
			case 1:
				remocon.volumeUp(); break;
			case 2:
				remocon.volumeDown(); break;
			case 3:
				remocon.channelUp(); break;
			case 4:
				remocon.channelDown(); break;
			default:
				System.out.println("Power off.");
				end = true;
			}
		}
		input.close();
	}
}

/**
 * 인스턴스 생성클래스
 * @author 임현진
 *
 */
class Remocon {
	
	//필드
	private int volume = 0;
	private int channel = 0;
	public final static int MAX_VOLUME = 3; //최고 음량
	public final static int MAX_CHANNEL = 3; //채널 번호 최대값
	// 음량 최소값은 0
	// 채널번호 최소값도 0
	
	/**
	 * 음량을 한 단계 높힌다.
	 * 현재 음량이 최대이면 음량이 바뀌지 않는다.
	 */
	public void volumeUp() {
		if (volume < MAX_VOLUME)
			volume++;
		display();
	}
	
	/**
	 * 음량을 한 단계 낮춘다.
	 * 현재 음량이 0이면 음량이 바뀌지 않는다.
	 */
	public void volumeDown() {
		if (volume > 0)
			volume--;
		display();
	}
	
	/**
	 * 한 단계 높은 번호로 채널을 변경한다.
	 * 현재 가장 높은 번호의 채널 있다면 0번 체널 이동한다.
	 */
	public void channelUp() {
		if (channel < MAX_CHANNEL)
			channel++;
		else if (channel == MAX_CHANNEL)
			channel = 0;
		display();
	}
	
	/**
	 * 한 단계 낮 번호로 채널을 변경한다.
	 * 현재 0번 채널에 있다면 가장 높은 번호의 체널로 이동한다.
	 */
	public void channelDown() {
		if (channel > 0)
			channel--;
		else if (channel == 0)
			channel = MAX_CHANNEL;
		display();
	}
	
	/**
	 * 현재의 volume, channel 상태를 화면에 보여준다.
	 */
	public void display() {
		System.out.println("Volume = " + volume + ", Channel = " + channel);
	}
	
}