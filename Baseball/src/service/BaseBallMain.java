package service;

public class BaseBallMain {
	public static void main(String[] args) {
		BaseBallservice bs = new BaseBallservice();
		while (true) {
			int sel = bs.menu();
			switch (sel) {
			case 1:
				bs.regTeam();
				break;
			case 2:
				bs.selectTeam();
				break;
			case 3:
				bs.viewTeam();
				break;
			case 4:
				bs.regPlayer();
				break;
			case 5:
				bs.searchOfPlayerByName();
				break;
			case 6:
				bs.searchOfPlayerByBackNumber();
				break;
			case 7:
				bs.searchOfPlayerByNumber();
				break;
			case 8:
				bs.searchOfplayerInTeam();
				break;
			case 0:
				System.out.println("종료");
				return;
			default:
				System.out.println("메뉴값을 다시");

			}
		}

	}
}
