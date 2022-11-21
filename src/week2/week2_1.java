package week2;

public class week2_1 {

	public static void main(String[] args) {
		
		AgingCat c;
		
		c = new AgingCat();
		
		c.age = 3; //메모리 쓰기 but, 이러면 혼남.안정성을 떨어트림.
		System.out.print(c.age); //메모리 읽기
		
//		Cat c1;
//		c1 = new Cat();
//		
////		c1.eat();
////		c1.yaong();
	}
}

class Cat {

	public static void eat() {
		System.out.print("얌");
	}
	
	public static void yaong() {
		System.out.println("야옹");
	}
}

class AgingCat {
	
	int age;		//메모
	public static void eat() {
		System.out.print("얌");
	}
	
	public static void yaong() {
		System.out.println("야야옹");
	}
}

//pubilic : 모든 유저에게 보여주겠다
//priv : 폴더 안에서만
//package : 이건 뭐

// static : 값이 변하지 않는다.

// 에플리케이션 <--> 시스템소프트웨어


//클래스(맴버) :  구성자 , 필드 , 메소드 