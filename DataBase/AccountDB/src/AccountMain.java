
public class AccountMain {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		
//		service.accountInfo("10101");
		//계좌개설
		
		
		
//		service.deposit("10103",50000);
//		service.withdraw("10103",50000);
//		service.accountInfo("10103");

		Account acc = new Account("10104","사건우",200000,null);
		service.makeAccount(acc);
		service.allAccountInfo();
	}
}
