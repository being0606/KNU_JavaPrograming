package week2_homework;

/**
 * 최대값에 도달하면 다시 0부터 세기 시작하는 계수기
 * @author 임현진
 * @version 1.0
 */
public class Counter2 {
	
	private int count = 0;
	private int max = 10;
	
	/**
	 * Counter의 최대값을 설정한다.
	 * Counter의 0부터 max까지 센다.
	 * @param max 최대값
	 */
	public void setMax(int max_set) {
		max = max_set;
	}
	
	/**
	 * count 값을 증가시킨다.
	 * 만약 count 값이 MAX를 초과한다면 0으로 돌아간다.
	 */
	public void tick() {
		count++;
		if (count > max)
			count=0;
	}
	
	/**
	 *  Getter 메소드
	 * @return 현재의 count 값
	 * 		   (0 <= 반환값 <= MAX)
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * 현재의 count 값을 설정한다.
	 * @param number count 값으로 설정할 수
	 *        (전제조건: 0 <= number <= MAX)
	 */
	public void setCount(int number) {
		if(isInputValid(number))
			count = number;
	}
	
	/*
	 * count 설정 값이 유효 범위 내에 있는지 검사
	 */
	private boolean isInputValid(int number) {
		if (number < 0)
			return false;
		if (number > max)
			return false;
			
		return true;
	}
	
	public static void main(String[] args) {
		
		Counter2 c12 = new Counter2();
		Counter2 c60 = new Counter2();
		
		c12.setMax(12);
		c60.setMax(60);
		
		c12.setCount(11);
		
		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		System.out.println();
		
		c60.setCount(59);
		
		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());
	}
}