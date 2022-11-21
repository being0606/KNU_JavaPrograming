package week2;

public class week2_2 {

	public static void main(String[] args) {
		
		Dog d1, d2;
		d1 = new Dog();
		d2 = new Dog();
		
		d1.setName("Dog01");
		d2.setName("Dog02");
		
		d1.setAge(1);
		d2.setAge(1);
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		
		
		
	}
}

class Dog {
	
	private String name; //이름 필
	private int age; //이름 필
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int n) {
		age = n;
	}
	
	public int getAge() {
		return age;
	}
}