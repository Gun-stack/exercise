package service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.TeamDAO;
import dto.*;

public class BaseBallservice {
	//팀등록 insert
	Scanner sc = new Scanner(System.in);
	public void regTeam() {
		Connection conn = TeamDAO.getConnection();

		int cnt =1;
		System.out.println("[팀등록]");
		System.out.println("팀 명 : ");
		String teamName = sc.nextLine();
		System.out.println("연고지 : ");
		String local = sc.nextLine();
	
		cnt++;
	}
	//팀목록 select
	
	public void viewTeam() {
		TeamDAO tD = new TeamDAO();
		List<Team> teams = tD.selectTeamList();
		System.out.println("전체팀조회");
	for (Team team : teams) {
		System.out.println(""+team.getNum()+":"+team);
		
	}
		
		
		
	}
	public void selectTeam() {
		 System.out.println("조회할 팀 명: ");
		 String teamName = sc.nextLine();
		 
		 TeamDAO tDAO = new TeamDAO();
		 Team team = tDAO.selectTeam(teamName);
		 
		 if(team !=null) {
			 System.out.println("팀 명 : ");
			 System.out.println("연고지  : ");
		 }else {
			 System.out.println("해당팀이 없");
		 }
		
	}
	//팀조회 select(팀명)
		
	
	
	
	
	//선숟등록 insert
	public void regPlayer() {
		System.out.println("[선수등록]");
		System.out.println("선수명 : ");
		String PlayerName = sc.nextLine();
		System.out.println("<팀 선택> ");
		viewTeam();
		String teamnum = sc.nextLine();

		//팀목록조회
		String team = sc.nextLine(); //팀목록 나오게
		System.out.println("등번호 : ");
		Integer backNum =Integer.parseInt(sc.nextLine()) ;
//		Player np = new Player(PlayerName, teamName, backNum);
//	    int result = playerDAO.insertPlayer(np);
	    
	}
	
	//선수조회 (이름으로)
	public void spName() {
		
	}
	public void spBack() {
		
	}
	public void spNum() {
		
	}
	public void pot() {}
	
	//선수조회 (등번호으로)
	//선수조회 (번호로)
	//특정팀 소속선수 목록조회
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
		System.out.println("선택>>");
		return Integer.parseInt(sc.nextLine());
		
	
	}
	
}
