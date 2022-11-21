package week2;

public class MyAdderTest {

	public static void main(String[] args) {
		
		MyAdder d;
		d = new MyAdder();
		
		d.add(10,20);
		
		System.out.printf("합은 %d입니다.", d.getValue());
		

	}

}

class MyAdder {
	
	private int sum;
	
	public void add(int m, int n) {
		if (m>n)
			System.out.println("값이 잘못되었습니다.");
		else
			for (;m<n; m++) {
				sum += m;
			}
	}
	
	public int getValue() {
		return sum;
	}
	
	
	
}
