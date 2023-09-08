package service;

import java.util.Scanner;

public class BaseBallservice {
	//팀등록 insert
	//팀목록 select
	Scanner sc = new Scanner(System.in);
	public void regTeam() {
		System.out.println("[팀등록]");
		System.out.println("팀 명 : ");
		String teamName = sc.nextLine();
		System.out.println("연고지 : ");
		String local = sc.nextLine();
	
	}
	//팀조회 select(팀명)
		
	
	
	
	
	//선숟등록 insert
	public void regPlayer() {
		System.out.println("[선수등록]");
		System.out.println("선수명 : ");
		String PlayerName = sc.nextLine();
		System.out.println("<팀 선택> ");
		//팀목록조회
		String team = sc.nextLine(); //팀목록 나오게
		System.out.println("등번호 : ");
		Integer backNum =Integer.parseInt(sc.nextLine()) ;
		

	}
	
	//선수조회 (이름으로)
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
