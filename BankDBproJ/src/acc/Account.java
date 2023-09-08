package acc;

import java.io.Serializable;

import exc.BankError;
import exc.BankExecption;

public class Account implements Serializable {
	String id;
	String name;
	int balance;

	public Account() {}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return String.format("게좌번호 : %s , 이름 : %s , 잔액 : %d 원", id, name, balance);

	}

	public void deposit(int money) throws BankExecption {
		if (money <= 0) {
			throw new BankExecption("입금오류", BankError.MINUS);

		}
		balance += money;
	}

	public void withdraw(int money) throws BankExecption {
		if (balance < money) {
			throw new BankExecption("출금오류", BankError.LACK);
		}
		balance -= money;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}