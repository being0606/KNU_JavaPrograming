package week3_homework;

/**
 * 은행 프로그램
 * @author being
 *
 */
public class NumberedBankAccountTest {

	public static void main(String[] args) {
		NumberedBankAccount account1 = new NumberedBankAccount(1000.0);
		NumberedBankAccount account2 = new NumberedBankAccount();
		NumberedBankAccount account3 = new NumberedBankAccount();

		System.out.println("Account1: " + account1);
		System.out.println("Account2: " + account2);
		System.out.println("Account3: " + account3);

		System.out.println("Transfer 300.0won: account1 --> account2");
		account1.transfer(300.0, account2);

		System.out.println("Account1: " + account1);
		System.out.println("Account2: " + account2);
		System.out.println("Account3: " + account3);
	}

}
/**
 * 은행 계좌
 * 잔액을 관리하여 인출, 입금, 계좌이체가 가능하다
 *
 */
class NumberedBankAccount {
	private int accountNumber;
	private double balance;
	private static int nextAccountNumber = 100;

	/**
	 * 잔액이 0.0인 계좌를 구성한다.
	 */
	public NumberedBankAccount() {
		balance = 0.0;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	/**
	 * 잔액이 0.0인 계좌를 구성한다.
	 */
	/**
	 * 주어진 금액을 초기 잔액으로 갖는 계좌를 구성한다.
	 * @param initialBalance 초기 잔액
	 */
	public NumberedBankAccount(double initialBalance) {
		balance = initialBalance;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;   
	}
	/**
	 * 계좌번호를 읽는다.
	 * @return 계좌번호
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * 계좌에 입금한다.
	 * @param amount 입금할 금액
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}
	/**
	 * 계좌에서 출금한다.
	 * @param amount 출금할 금액
	 */
	public void withdraw(double amount) {
		balance = balance - amount;

	}
	/**
	 * 잔액이 얼마인지 알아본다.
	 * @return 잔액
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * 다른 계좌로 amount만큼 계좌이체한다(송금한다.)
	 * @param amount 송금할 계좌
	 * @param other 돈을 받을 계좌
	 */
	public void transfer(double amount, NumberedBankAccount other) {
		balance -= amount;
		other.deposit(amount);
	}
	
	//출력하는 메소드
	public String toString() {
		return "NumberedBankAccount[accountNumber=" + accountNumber + ",balance=" +balance+"]";

	}
}