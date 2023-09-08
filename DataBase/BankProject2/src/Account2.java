class Account2{
	String id;
	String name;
	int balance;

	Account2 (String id , String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	String info() {
		return String.format("게좌번호 : %s , 이름 : %s , 잔액 : %d 원", id, name, balance);
	}

	void deposit(int i) {
	}

	void withdraw(int i) {
	}
	
}
