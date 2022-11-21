package week2_homework;

/**
 * 인간을 나타내는 간단한 클래
 * @author 임현
 *
 */
public class Human2 {
	
	private String name;
	private int age;
	
	/**
	 * 구성자
	 * @return 이름
	 */
	public Human2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 이름을 얻는다.
	 * @return 이름
	 */
	public String getName() {
		return name;
	}
	
	
	
	/**
	 * 이름을 설정한다.
	 * @param n 이름
	 */
	public void setName(String n) {
		this.name = n;

	}
	
	/**
	 * 나이를 설정한다.
	 * @param i 나
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 나이를 설정한다.
	 * @param i 나
	 */
	public void setAge(int i) {
		this.age = i;
	}

	//@Override
	public String toString() {
		return "Human[name=" + name + ", age=" + age + "]";
	}
	
	//객체생성 메인 메소드
	public static void main(String[] args) {
		
		Human2 human1 = new Human2("Yuri", 19);
		Human2 human2 = new Human2("Cheolmin", 20);
		
		System.out.println(human1);
		System.out.print(human2);
	}

}