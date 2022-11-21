package week2_homework;
/**
 * p30 NameCat클래스에 NameCatTest의 main메소드를 NameCat에 넣었다.
 *
 * @author 임현진 
 *
 */
public class NameCat {
	
	//NameCatTest의 main메소드 
	public static void main(String[] args) {
		
		NameCat c1, c2;
		
		c1 = new NameCat();
		c2 = new NameCat();
		
		c1.setName("Bella");
		c2.setName("Kitty");
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());

	}
	
	private String name;
	
	//객체의 이름을 설정하는 메소드 
	public void setName(String n) {
		name = n;
	}
	
	//객체의 이름을 리턴하 메소드 
	public String getName() {
		return name;
	}

}