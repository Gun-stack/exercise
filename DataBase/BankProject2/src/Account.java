
class Account {
	String id;
	String name;
	int balance;

	Account() {
	}

	Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	
//	String info() {
//		return String.format("게좌번호 : %s , 이름 : %s , 잔액 : %d 원", id, name, balance);
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("게좌번호 : %s , 이름 : %s , 잔액 : %d 원", id, name, balance);

	}
	
	
	
	
	
	void deposit(int money) throws BankExecption {
		if (money<=0) { 
			throw new BankExecption("입금오류", BankError.MINUS);
			
		}
		balance += money;
//		System.out.print("입금 + " + money + "원 ");
//		System.out.println("잔액 : " + balance);
	}

	void withdraw(int money) throws BankExecption{
		if (balance < money) {
			throw new BankExecption("출금오류", BankError.LACK);
		}
		balance -= money;
//		System.out.print("출금 - " + money + "원 ");
//		System.out.println("잔액 : " + balance);

	}

}