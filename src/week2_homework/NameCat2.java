package week2_homework;

/**
 * p30 NameCat클래스에 NameCatTest의 main메소드를 NameCat에 넣었다.
 * @author 임현진 
 *
 */
public class NameCat2 {
	
	// 필드
	private String name;
	private int age;
	
	/**
	 * 구성자
	 */
	public NameCat2() {		}
	
	/**
	 * 구성자
	 * @param name 이름
	 */
	public NameCat2(String name) {
		this.name = name;
	}
	
	/**
	 * 구성자
	 * @param name 이름
	 * @param age 나이
	 */
	public NameCat2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 먹는 동작 출력
	 */
	public void eat() {
		System.out.println("Nom nom nom!");
	}
	
	/**
	 * "야옹" 출력
	 */
	public void yaong() {
		System.out.println("meow~");
	}
	
	/**
	 * 이름을 설정한다. 
	 * @param name 이름
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 이름을 반환한다. 
	 * @param 이름
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 나이를 설정한다. 
	 * @param name 나이
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 나이를 반환한다. 
	 * @return 나
	 */
	public int getAge() {
		return age;
	}
	//@Override
	public String toString() {
		return "NameCat2[name=" + name + ", age=" + age + "]";
	}
	
	//NameCatTest의 main메소드
	public static void main(String[] args) {
		
		NameCat2 c1, c2, c3;
		
		c1 = new NameCat2();
		c2 = new NameCat2("Bella");
		c3 = new NameCat2("Kitty", 19);
		
		c1.setName("Cleo");
		c1.setAge(20);
		
		c2.setAge(21);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
