import java.util.Scanner;

public class Bank {
	static Account[] accs = new Account[100];
	static int accCnt;
	static Scanner sc = new Scanner(System.in);

	int menu()  throws BankExecption {
		System.out.println("[코스타 은행]");
		System.out.println("1. 개좌계설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>>");

//		int sel =0;
//		try {
//			sel =Integer.parseInt(sc.nextLine()); 
//		} catch (NumberFormatException e) {}
//		return sel;
		
		
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel > 0 && sel <= 5)) {
			throw new BankExecption("메뉴오류", BankError.MENU);
		}
		return sel;
		
		
		
	}
	void selAccMenu() throws BankExecption {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:makeAccount();
			
			break;
		case 2:makeSpecialAccount();
		
		break;

		default:
//			try {
				throw new BankExecption("메뉴오류", BankError.MENU);
//			} catch (BankExecption e) {
//				System.out.println(e);
//				selAccMenu();
			
			
		}
		
		
	}
	
	
	void makeAccount() throws BankExecption {
		System.out.println("[계좌 개설]");
		System.out.print("계좌 번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc!=null) {
			throw new BankExecption("계좌오류", BankError.EXISTED);
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		
		int money = Integer.parseInt(sc.nextLine());
		if (money<=0) {
			throw new BankExecption("입금오류", BankError.MINUS);
		}
		accs[accCnt++] = new Account(id, name, money);

	}
	  void makeSpecialAccount() throws BankExecption{
	        System.out.println("[특수 계좌 개설]");
	        System.out.print("계좌 번호 : ");
	        String id = sc.nextLine();
	        Account acc = searchAccById(id);
	        if(acc!=null){
	        	throw new BankExecption("계좌오류",BankError.EXISTED );
	        }
	        System.out.print("이름 : ");
	        String name = sc.nextLine();
	        System.out.print("입금액 : ");
	        int money = Integer.parseInt(sc.nextLine());
	        System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) : ");
	        String grade = sc.nextLine();
	        // 등급을 잘못 입력 받았을 경우 잘못된 등급임을 알리기
	        if(!grade.equals("V") && !grade.equals("G") && !grade.equals("S") && !grade.equals("N")){
	            System.out.println("잘못된 등급입니다. Normal 등급으로 설정되었습니다.");
	        }
	        if(accCnt == accs.length) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
	        else accs[accCnt++] = new SpecialAccount(id, name, money, grade); // 다형성 이용하여 부모 클래스 타입의 배열에 생성 가능
	    }


	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void deposit() throws BankExecption {
		System.out.println("[입금]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
//		try {
			if (acc == null) throw new BankExecption("계좌오류", BankError.NOID);
			
//		} catch (BankExecption e) {
//			System.out.println(e);
//			deposit();
//		}
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}

	void withdraw() throws BankExecption {
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id); // 스트링 말고 클래스는 다 null임
//		try {
			if (acc == null) throw new BankExecption("계좌오류",BankError.NOID); 
			
//		} catch (BankExecption e) {
//			System.out.println(e);
//		}
		
		System.out.print("출금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);

	}

	void accountinfo() throws BankExecption {
		System.out.println("[계좌 조회]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id); // 스트링 말고 클래스는 다 null임
		
		
		if (acc == null) throw new BankExecption("계좌오류", BankError.NOID);
//		{
//			System.out.println("계좌번호가 틀립니다,");
//			return;
//		}
		System.out.println(acc);
	}

	void allAccountinfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i]);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0)
					break;
				switch (sel) {
				case 1:
					bank.selAccMenu();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountinfo();
					break;
				case 5:
					bank.allAccountinfo();
					break;
				}
			}catch (NumberFormatException e) {
				System.out.println("입력형식이 맞지 않습니다. 다시선택");
			}catch (BankExecption e) {
				System.out.println(e);
			}

		}
	}
}
