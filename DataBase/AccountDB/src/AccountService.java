import java.sql.Connection;
import java.util.List;

public class AccountService {
	public void accountInfo(String id) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccountInfo(conn, id);
		if (acc == null) {
			System.out.println("없는 계좌입니다");
		} else {
			System.out.println(acc);
		}

		Dao.close(conn);
	}

	public void makeAccount(Account acc) {
		Connection conn = Dao.getConnection();
		Account racc = Dao.selectAccountInfo(conn, acc.getId());
		if (racc != null) {
			System.out.println("중복 계좌입니다");
		} else {
			int cnt = Dao.insertAccount(conn, acc);
			if (cnt > 0) {
				System.out.println(cnt + "개 계좌가 개설되었습니다.");
			}
		}
		Dao.close(conn);
	}

	public void deposit(String id, Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccountInfo(conn, id);
		if (acc == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		acc.deposit(money); // 가져온 계좌에 입금 not db ,객체

		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.println(String.format("입급완료 %s 계좌 잔액은 %d 원입니다", acc.getId(), acc.getBalance()));
		}
		Dao.close(conn);
	}

	public void withdraw(String id, Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccountInfo(conn, id);
		if (acc == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		if (acc.getBalance() < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		acc.withdraw(money);
		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.println(String.format("출금완료 %s 계좌 잔액은 %d 원입니다", acc.getId(), acc.getBalance()));
		}
		Dao.close(conn);
	}
	public static void allAccountInfo() {
		Connection conn = Dao.getConnection();
		List<Account> accs =  Dao.selectAccountList(conn);
		for (Account acc : accs) {
			System.out.println(acc);
		}
		Dao.close(conn);
	}
}
