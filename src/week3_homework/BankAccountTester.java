package week3_homework;

/**
 * 은행 프로그램
 * @author being
 *
 */
public class BankAccountTester {

	public static void main(String[] args) {
		
		//객체 두 개 구성
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(1000.0);
		
		account1.deposit(500.0);
		account2.deposit(500.0);
		
		account1.withdraw(100.0);
		account2.withdraw(100.0);

		System.out.println("Balance of the first account = "+account1.getBalance());
		System.out.println("Balance of the second account = "+account2.getBalance());

		
	}

}

/**
 * 은행 계좌 잔액을 관리하여 인출, 입금이 가능하다.
 * @author being
 *
 */
class BankAccount {
	
	private double balance; //필드, 잔액
	
	/**
	 * 잔액이 0.0인 계좌를 구성한다.
	 */
	public BankAccount() {
		balance = 0.0;
	}
	
	
	/**
	 * 주어진 금액을 초기 잔액으로 갖는 계좌를 구성한다.
	 * @param initialBalance 초기 잔액
	 */
	public BankAccount(double initialBalance) {
		balance=initialBalance;
	}
	
	/**
	 * 계좌에 입금한다.
	 * @param amount 입금할 금액
	 */
	public void deposit(double amount) {
		balance+=amount;
	}
	
	
	/**
	 * 계좌에서 출금한다.
	 * @param amount 출금할 금액
	 */
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	
	/**
	 * 잔액이 얼마인지 알아본다.
	 * @return amount 쟌액
	 */
	public double getBalance() {
		return balance;
	}
	
	
}