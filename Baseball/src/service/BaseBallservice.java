package service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.TeamDAO;
import dto.*;

public class BaseBallservice {
	// 팀등록 insert
	Scanner sc = new Scanner(System.in);

	public void regTeam() {// 1

		Connection conn = TeamDAO.getConnection();

		System.out.println("[팀등록]");
		System.out.println("팀 명 : ");
		String teamName = sc.nextLine();
		System.out.println("연고지 : ");
		String local = sc.nextLine();
		int num = 0;
		int result = TeamDAO.insertTeam(conn, new Team(num, teamName, local));

		if (result > 0) {
			System.out.println("팀 등록");
		} else {
			System.out.println("팀 등록 실패");
		}

		TeamDAO.close(conn);

	}
	// 팀목록 select

	public void viewTeam() {// 2
		TeamDAO tD = new TeamDAO();
		List<Team> teams = tD.selectTeamList();

		System.out.println("전체팀조회");

		for (Team team : teams) {
			System.out.println(team);

		}

	}

	public void selectTeam() {// 3
		Connection conn = TeamDAO.getConnection();
		System.out.println("조회할 팀 명: ");
		String teamName = sc.nextLine();
		Team team = TeamDAO.selectTeam(conn, teamName);
		if (team != null) {
			System.out.println("팀 명 : " + team.getName());
			System.out.println("연고지  : " + team.getLocal());
		} else {
			System.out.println("해당팀이 없음");
		}

	}
	// 팀조회 select(팀명)

	// 선숟등록 insert
	public void regPlayer() {// 4
		Connection conn = PlayerDAO.getConnection();

		System.out.println("[선수등록]");
		System.out.println("선수명: ");
		String playerName = sc.nextLine();

		// 팀 목록 조회
		viewTeam();
		System.out.println(" 소속 팀 번호 : ");
		int teamNum = Integer.parseInt(sc.nextLine());

		System.out.println("등 번호: ");
		int backNum = Integer.parseInt(sc.nextLine());
		int num = 0;

		String teamName = TeamDAO.getTeamNameByNum(teamNum);
		Player player = new Player(num, playerName, backNum, teamNum, teamName);

		int result = PlayerDAO.insertPlayer(conn, player);

		if (result > 0) {
			System.out.println("선수 등록 성공");
		} else {
			System.out.println("선수 등록 실패");
		}

		PlayerDAO.close(conn);

	}

	// 선수조회 (이름으로)
	public void searchOfPlayerByName() {// 5
		Connection conn = PlayerDAO.getConnection();
		System.out.println("선수이름 입력 : ");
		String name = sc.nextLine();
		List<Player> players = PlayerDAO.selectPlayerByName(name);
		if (players != null) {
			for (Player player : players) {
				System.out.println(player);
			}
		} else {
			System.out.println("해당 이름의 선수 찾을 수 없음 ");
		}
		PlayerDAO.close(conn);
	}

	public void searchOfPlayerByBackNumber() {// 6
		Connection conn = PlayerDAO.getConnection();
		System.out.println("선수 등번호 입력 : ");
		int backnum = Integer.parseInt(sc.nextLine());
		List<Player> players = PlayerDAO.selectPlayerByBackNum(conn, backnum);
		if (players != null) {
			for (Player player : players) {
				System.out.println(player);
			}
		} else {
			System.out.println("해당 등번호 찾을수 없음");
		}

		PlayerDAO.close(conn);

	}

	public void searchOfPlayerByNumber() {// 7
		Connection conn = PlayerDAO.getConnection();
		System.out.println(" 선수 번호 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		Player player = PlayerDAO.selectPlayerByNum(conn, num);
		if (player != null) {
			System.out.println(player);
		} else {
			System.out.println("해당 번호의 선수를 찾을 수 없습니다.");
		}
	}

	public void searchOfplayerInTeam() {
		Connection conn = PlayerDAO.getConnection();
		viewTeam();
		System.out.println("선수목록 조회 할 팀 번호 선택");
		int teamnum = Integer.parseInt(sc.nextLine());
		try {
			List<Player> players = PlayerDAO.selectPlayerByTeam(conn, teamnum);
			for (Player player : players) {
				System.out.println(player);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			PlayerDAO.close(conn);
		}
	}// 8

	
	
	// 선수조회 (등번호으로)
	// 선수조회 (번호로)
	// 특정팀 소속선수 목록조회
	public int menu() {
		System.out.println("[야구 팀 /선수 등록/조회]");
		System.out.println("1.팀등록");
		System.out.println("2.특정팀조회");
		System.out.println("3.팀목록조회");
		System.out.println("----------");
		System.out.println("4.선수등록");
		System.out.println("5.선수조회(이름으로)");
		System.out.println("6.선수조회(등번호로)");
		System.out.println("7.선수조회(번호로)");
		System.out.println("8.특정팀선수목록조회");
		System.out.println("0.종료");
		System.out.println("선택>>");
		return Integer.parseInt(sc.nextLine());

	}

}
