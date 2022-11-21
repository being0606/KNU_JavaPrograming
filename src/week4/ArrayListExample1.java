package week4;

import java.util.*;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		// 변수선언은 인터페이스로, 객체구성은 클래스로!
		List<String> list = new ArrayList<>();
		
		// List인터페이스에 정의된 메소드만 list에게 호출할 수 있다.
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list.toString());
	}

}
