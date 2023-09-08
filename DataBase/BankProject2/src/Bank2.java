import java.util.Scanner;

public class Bank2 {
	Account2 accs[] = new Account2[100];
	int accCnt = 0;
	Scanner sc = new Scanner(System.in);

	int menu() {
		System.out.println("[코스타 은행]");
		System.out.println("1. 개좌계설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel > 0 && sel <= 5)) {
			try {
				throw new BankExecption("메뉴오류", BankError.MENU);

			} catch (BankExecption e) {
				System.out.println(e);
				menu();
			}
		}

		return sel;
	}

	void makeAccount() {
		System.out.println("계좌개설");
		System.out.print("번호 : >");
		String id = sc.nextLine();
		System.out.println("이름 : >");
		String name = sc.nextLine();
		System.out.println("입금액 : >"); // Integer.parseint 로 입력시 깔끔
		int balance = Integer.parseInt(sc.nextLine());
		accs[accCnt++] = new Account2(id, name, balance);
	}

	void deposit() {

	}

	void withdraw() {

	}

	void accountinfo() {
	}

	void allAccountinfo() {
	}

	public static void main(String[] args) {
		Bank2 bank = new Bank2();
		int sel;

		while (true) {
			sel = bank.menu();

			if (sel == 0)
				break;
			switch (sel) {
			case 1:
				bank.makeAccount();
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
		}
	}
}
